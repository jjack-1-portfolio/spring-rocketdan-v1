package com.metacoding.springrocketdanv1.jobGroup;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class JobGroupRepository {
    private final EntityManager em;
}
