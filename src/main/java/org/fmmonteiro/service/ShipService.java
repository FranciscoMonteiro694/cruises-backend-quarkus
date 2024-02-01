package org.fmmonteiro.service;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.AllArgsConstructor;
import org.fmmonteiro.adapter.database.CompanyRepository;
import org.fmmonteiro.adapter.database.CruiseRepository;
import org.fmmonteiro.model.dtos.response.Cruise;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
@AllArgsConstructor
public class ShipService {

    private final CruiseRepository cruiseRepository;
    private final CompanyRepository companyRepository;

    // TODO -> Refactor this method to avoid using different repositories
    public List<Cruise> getAllCruises() {
        return cruiseRepository.getAllCruises().stream().map(cruiseEntity -> Cruise.builder()
                .shipName(cruiseEntity.getShipName())
                .passengerCapacity(cruiseEntity.getPassengerCapacity())
                .shipAvatarUrl(cruiseEntity.getAvatarUrl())
                .companyAvatarUrl(companyRepository.findById(cruiseEntity.getCompanyId()).getAvatarUrl())
                .build())
                .collect(Collectors.toList());
    }
}
