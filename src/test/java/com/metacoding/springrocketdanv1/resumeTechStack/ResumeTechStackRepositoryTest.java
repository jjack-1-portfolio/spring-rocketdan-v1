package com.metacoding.springrocketdanv1.resumeTechStack;

import com.metacoding.springrocketdanv1.resumeBookmark.ResumeBookmarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

@Import(ResumeTechStackRepository.class)
@DataJpaTest
public class ResumeTechStackRepositoryTest {
    @Autowired
    private ResumeTechStackRepository resumeTechStackRepository;
}
