package com.tornikeshelia.vacancies.service.vacancy;

import com.tornikeshelia.vacancies.model.dto.VacancyDto;

import java.util.List;

public interface VacancyService {

    List<VacancyDto> getAllVacancies();
    Long addUpdateVacancy(VacancyDto vacancyDto);
    VacancyDto getVacancy(Long vacancyId);
    void deleteVacancy(Long vacancyId);

    // TODO Add Search DTO
    List<VacancyDto> searchVacancy(String VacancyTitle,
                                   List<String> skillsRequiredList,
                                   int expRequired,
                                   List<String> toolsRequiredList);

}
