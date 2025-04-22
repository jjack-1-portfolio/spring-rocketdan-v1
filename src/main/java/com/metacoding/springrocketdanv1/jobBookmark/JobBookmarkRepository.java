package com.metacoding.springrocketdanv1.jobBookmark;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class JobBookmarkRepository {
    private final EntityManager em;
}
