package org.fmmonteiro.adapter.database;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.fmmonteiro.model.entities.PortEntity;
import org.fmmonteiro.model.entities.UpcomingShipEntity;

import java.util.List;

@ApplicationScoped
public class UpcomingShipRepository implements PanacheRepository<UpcomingShipEntity> {

    public List<UpcomingShipEntity> getAllUpcomingShips() {
        return findAll().list();
    }
}
