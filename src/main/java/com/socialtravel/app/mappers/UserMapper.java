package com.socialtravel.app.mappers;

import com.socialtravel.app.dto.UserIn;
import com.socialtravel.app.dto.UserOut;
import com.socialtravel.app.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User userInToUser(UserIn source);

    UserOut userToUserOut(User user);

}
