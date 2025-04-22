package com.metacoding.springrocketdanv1.salaryRange;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SalaryRangeRepository {
    private final EntityManager em;
}