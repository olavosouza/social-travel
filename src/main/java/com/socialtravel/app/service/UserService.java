package com.socialtravel.app.service;

import com.socialtravel.app.dto.UserIn;
import com.socialtravel.app.dto.UserOut;
import com.socialtravel.app.mappers.UserMapper;
import com.socialtravel.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private UserRepository userRepository;
    private UserMapper userMapper;

    @Autowired
    private UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userMapper = userMapper;
        this.userRepository = userRepository;
    }

    public UserOut createUser(UserIn userIn) {
        var userToBeSaved = userMapper.userInToUser(userIn);
        var user = userRepository.save(userToBeSaved);
        return userMapper.userToUserOut(user);
    }

    public List<UserOut> getAllUsers() {
        var users = userRepository.findAll();
        return users.stream()
            .map(user -> userMapper.userToUserOut(user))
            .collect(Collectors.toList());
    }

    public UserOut getUserById(Long id) {
        var user = userRepository.findById(id).orElseThrow();
        return userMapper.userToUserOut(user);
    }

}
