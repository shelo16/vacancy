package com.tornikeshelia.vacancies.model.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ORGANISATION_DETAILS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrganisationDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orgId;
    @Column(name = "DATE_CREATED")
    private Date dateCreated;

    @Column(name = "ORG_NAME")
    private String orgName;

    @PrePersist
    protected void onCreate() {
        dateCreated = new Date(new Date().getTime());
    }
}
