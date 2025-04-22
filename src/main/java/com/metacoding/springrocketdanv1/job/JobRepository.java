package com.metacoding.springrocketdanv1.job;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class JobRepository {
    private final EntityManager em;
}
