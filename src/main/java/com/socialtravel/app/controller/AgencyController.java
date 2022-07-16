package com.socialtravel.app.controller;

import com.socialtravel.app.dto.AgencyIn;
import com.socialtravel.app.dto.AgencyOut;
import com.socialtravel.app.service.AgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/agency")
public class AgencyController {

    private AgencyService agencyService;

    @Autowired
    private AgencyController(AgencyService agencyService) {
        this.agencyService = agencyService;
    }

    @GetMapping
    public List<AgencyOut> getAllUsers() {
        return agencyService.getAllAgencies();
    }

    @GetMapping("/{id}")
    public AgencyOut getUserById(@PathVariable("id") Long id) {
        return agencyService.getAgencyById(id);
    }

    @PostMapping
    public AgencyOut createUser(@RequestBody AgencyIn agencyIn) {
        return agencyService.createAgency(agencyIn);
    }

}
