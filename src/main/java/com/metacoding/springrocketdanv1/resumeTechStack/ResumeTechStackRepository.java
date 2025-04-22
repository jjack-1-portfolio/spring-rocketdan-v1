package com.metacoding.springrocketdanv1.resumeTechStack;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ResumeTechStackRepository {
    private final EntityManager em;
}