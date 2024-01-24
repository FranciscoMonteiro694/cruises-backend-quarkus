package org.fmmonteiro.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Cruise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long companyId;
    private String shipName;
    private Integer crewCapacity;
    private Integer passengerCapacity;
    private String avatarUrl;
    private Integer yearOfOrigin;
}
