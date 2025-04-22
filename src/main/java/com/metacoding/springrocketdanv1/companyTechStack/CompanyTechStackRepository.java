package com.metacoding.springrocketdanv1.companyTechStack;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CompanyTechStackRepository {
    private final EntityManager em;
}
