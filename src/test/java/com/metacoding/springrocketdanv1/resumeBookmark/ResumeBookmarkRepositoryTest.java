package com.metacoding.springrocketdanv1.resumeBookmark;

import com.metacoding.springrocketdanv1.resume.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

@Import(ResumeBookmarkRepository.class)
@DataJpaTest
public class ResumeBookmarkRepositoryTest {
    @Autowired
    private ResumeBookmarkRepository resumeBookmarkRepository;
}
