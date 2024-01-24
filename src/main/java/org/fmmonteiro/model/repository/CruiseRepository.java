package org.fmmonteiro.model.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.fmmonteiro.model.Cruise;

import java.util.List;

@ApplicationScoped
public class CruiseRepository implements PanacheRepository<Cruise> {

    public List<Cruise> getAllCruises() {
        System.out.println("Here " + listAll().get(0));
        return listAll();
    }
}
