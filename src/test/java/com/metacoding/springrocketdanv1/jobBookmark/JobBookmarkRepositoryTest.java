package com.metacoding.springrocketdanv1.jobBookmark;

import com.metacoding.springrocketdanv1.job.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

@Import(JobBookmarkRepository.class)
@DataJpaTest
public class JobBookmarkRepositoryTest {
    @Autowired
    private JobBookmarkRepository jobBookmarkRepository;
}
