package org.fmmonteiro.model.entities;


import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "cruise")
public class CruiseEntity {

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
