package com.socialtravel.app.service;

import com.socialtravel.app.dto.AgencyIn;
import com.socialtravel.app.dto.AgencyOut;
import com.socialtravel.app.mappers.AgencyMapper;
import com.socialtravel.app.repository.AgencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AgencyService {

    private AgencyRepository agencyRepository;
    private AgencyMapper agencyMapper;

    @Autowired
    private AgencyService(AgencyRepository agencyRepository, AgencyMapper agencyMapper) {
        this.agencyMapper = agencyMapper;
        this.agencyRepository = agencyRepository;
    }

    public AgencyOut createAgency(AgencyIn agencyIn) {
        var userToBeSaved = agencyMapper.agencyInToAgency(agencyIn);
        var user = agencyRepository.save(userToBeSaved);
        return agencyMapper.agencyToAgencyOut(user);
    }

    public List<AgencyOut> getAllAgencies() {
        var agencies = agencyRepository.findAll();
        return agencies.stream()
            .map(agency -> agencyMapper.agencyToAgencyOut(agency))
            .collect(Collectors.toList());
    }

    public AgencyOut getAgencyById(Long id) {
        var agency = agencyRepository.findById(id).orElseThrow();
        return agencyMapper.agencyToAgencyOut(agency);
    }

}
