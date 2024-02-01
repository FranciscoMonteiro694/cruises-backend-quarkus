package org.fmmonteiro.adapter.database;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.fmmonteiro.model.entities.CompanyEntity;
import org.fmmonteiro.model.entities.CruiseEntity;

import java.util.List;

@ApplicationScoped
public class CompanyRepository implements PanacheRepository<CompanyEntity> {

}
