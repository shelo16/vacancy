package com.tornikeshelia.vacancies.controller.vacancy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/vacancy")
public class VacancyController {

    @GetMapping(value = "/")
    public String getAllVacancies() {
        return "Hello World";
    }

}
