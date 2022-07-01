package com.tornikeshelia.vacancies.model.dto;

import com.tornikeshelia.vacancies.model.persistence.entity.OrganisationDetails;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VacancyDto {

    private Long vacancyId;
    private String vacancyTitle;
    private String vacancyDetails;
    private int expRequired;
    //TODO : Create Table for this two
    private String skillsRequired;
    private String toolsRequired;

    private int cvReceived;
    private Date dateAdded;
    private OrganisationDetails organisationDetails;

}
