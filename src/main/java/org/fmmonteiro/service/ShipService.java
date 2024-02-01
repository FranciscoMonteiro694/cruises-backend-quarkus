package org.fmmonteiro.service;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.AllArgsConstructor;
import org.fmmonteiro.adapter.database.CompanyRepository;
import org.fmmonteiro.adapter.database.CruiseRepository;
import org.fmmonteiro.adapter.database.UpcomingShipRepository;
import org.fmmonteiro.model.dtos.response.Cruise;
import org.fmmonteiro.model.dtos.response.UpcomingShip;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
@AllArgsConstructor
public class ShipService {

    private final CruiseRepository cruiseRepository;
    private final UpcomingShipRepository upcomingShipRepository;
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

    // TODO -> Refactor this method to avoid using different repositories
    public List<UpcomingShip> getUpcomingShips() {
        return upcomingShipRepository.getAllUpcomingShips().stream().map(upcomingShipEntity -> UpcomingShip.builder()
                .name(upcomingShipEntity.getName())
                .expectedDate(upcomingShipEntity.getName())
                .companyAvatarUrl(companyRepository.findById(upcomingShipEntity.getCompanyId()).getAvatarUrl())
                .build())
                .collect(Collectors.toList());
    }
}
