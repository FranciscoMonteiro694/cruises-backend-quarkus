package org.fmmonteiro.adapter.database;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.fmmonteiro.model.entities.PortEntity;
import org.fmmonteiro.model.entities.UpcomingShipEntity;

@ApplicationScoped
public class UpcomingShipRepository implements PanacheRepository<UpcomingShipEntity> {

}
