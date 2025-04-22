package com.metacoding.springrocketdanv1.resume;

import com.metacoding.springrocketdanv1.reply.ReplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

@Import(ResumeRepository.class)
@DataJpaTest
public class ResumeRepositoryTest {
    @Autowired
    private ResumeRepository resumeRepository;
}
