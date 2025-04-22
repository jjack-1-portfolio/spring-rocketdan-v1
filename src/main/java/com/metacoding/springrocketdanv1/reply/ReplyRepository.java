package com.metacoding.springrocketdanv1.reply;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ReplyRepository {
    private final EntityManager em;
}
