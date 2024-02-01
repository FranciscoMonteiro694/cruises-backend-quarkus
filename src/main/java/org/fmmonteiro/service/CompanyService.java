package org.fmmonteiro.service;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.AllArgsConstructor;
import org.fmmonteiro.adapter.database.CompanyRepository;
import org.fmmonteiro.model.dtos.response.Company;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
@AllArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;

    public List<Company> getAllCompanies() {
        return companyRepository.getAllCompanies().stream().map(companyEntity -> Company.builder()
                        .companyName(companyEntity.getCompanyName())
                        .build())
                .collect(Collectors.toList());
    }
}
