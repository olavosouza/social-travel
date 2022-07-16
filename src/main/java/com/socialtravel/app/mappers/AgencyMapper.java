package com.socialtravel.app.mappers;

import com.socialtravel.app.dto.AgencyIn;
import com.socialtravel.app.dto.AgencyOut;
import com.socialtravel.app.entity.Agency;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AgencyMapper {

    Agency agencyInToAgency(AgencyIn source);

    AgencyOut agencyToAgencyOut(Agency user);

}
