package com.metacoding.springrocketdanv1.certification;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CertificationRepository {
    private final EntityManager em;
}
