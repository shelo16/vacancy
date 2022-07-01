package com.tornikeshelia.vacancies.model.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "VACANCY")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vacancy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vacancyId;

    @Column(name = "VACANCY_TITLE")
    private String vacancyTitle;

    @Column(name = "VACANCY_DETAILS")
    private String vacancyDetails;

    @Column(name = "EXP_REQUIRED")
    private int expRequired;

    //TODO : Create Table for this two
    @Column(name = "SKILLS_REQUIRED")
    private String skillsRequired;

    @Column(name = "TOOLS_REQUIRED")
    private String toolsRequired;

    @Column(name = "CV_RECEIVED")
    private int cvReceived;

    @Column(name = "DATE_ADDED")
    private Date dateAdded;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORG_ID")
    private OrganisationDetails organisationDetails;

    @PrePersist
    protected void onCreate() {
        dateAdded = new Date(new java.util.Date().getTime());
    }
}
