package org.fmmonteiro.adapter.database.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "company")
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String companyName;
    private String countryOfOrigin;
    private String avatarUrl;
    private Integer founded;
}
