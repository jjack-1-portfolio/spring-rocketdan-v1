package com.metacoding.springrocketdanv1.techStack;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class TechStackRepository {
    private final EntityManager em;
}