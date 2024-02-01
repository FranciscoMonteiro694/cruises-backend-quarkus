package org.fmmonteiro.service;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.AllArgsConstructor;
import org.fmmonteiro.adapter.database.PortRepository;
import org.fmmonteiro.model.dtos.response.Port;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
@AllArgsConstructor
public class PortService {

    private final PortRepository portRepository;

    public List<Port> getAllPorts() {
        return portRepository.getAllPorts().stream().map(portEntity -> Port.builder()
                .name(portEntity.getName())
                .flagUrl(portEntity.getFlagUrl())
                .imageUrl(portEntity.getImageUrl())
                .build())
                .collect(Collectors.toList());
    }
}
