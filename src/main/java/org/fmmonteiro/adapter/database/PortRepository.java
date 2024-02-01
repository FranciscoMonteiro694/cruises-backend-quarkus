package org.fmmonteiro.adapter.database;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.fmmonteiro.model.dtos.response.Port;
import org.fmmonteiro.model.entities.CompanyEntity;
import org.fmmonteiro.model.entities.PortEntity;

import java.util.List;

@ApplicationScoped
public class PortRepository implements PanacheRepository<PortEntity> {

    public List<PortEntity> getAllPorts() {
        return findAll().list();
    }
}
