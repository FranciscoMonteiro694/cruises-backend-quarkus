package org.fmmonteiro.service;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.AllArgsConstructor;
import org.fmmonteiro.adapter.database.repository.CruiseRepository;
import org.fmmonteiro.model.dtos.response.Cruise;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
@AllArgsConstructor
public class ShipService {

    private final CruiseRepository cruiseRepository;

    public List<Cruise> getAllCruises() {
        return cruiseRepository.getAllCruises().stream().map(entity -> Cruise.builder()
                .shipName(entity.getShipName())
                .passengerCapacity(entity.getPassengerCapacity())
                .avatarUrl(entity.getAvatarUrl())
                .build())
                .collect(Collectors.toList());
    }
}
