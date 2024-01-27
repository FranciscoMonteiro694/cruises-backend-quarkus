package org.fmmonteiro.adapter.database.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.fmmonteiro.adapter.database.entity.CruiseEntity;

import java.util.List;

@ApplicationScoped
public class CruiseRepository implements PanacheRepository<CruiseEntity> {

    public List<CruiseEntity> getAllCruises() {
        System.out.println("Here " + findAll().list());
        return findAll().list();
    }
}
