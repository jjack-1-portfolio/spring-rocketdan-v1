package com.metacoding.springrocketdanv1.company;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CompanyRepository {
    private final EntityManager em;
}
