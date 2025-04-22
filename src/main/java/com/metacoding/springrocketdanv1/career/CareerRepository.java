package com.metacoding.springrocketdanv1.career;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CareerRepository {
    private final EntityManager em;
}
