package com.metacoding.springrocketdanv1.jobGroup;

import com.metacoding.springrocketdanv1.jobBookmark.JobBookmarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

@Import(JobGroupRepository.class)
@DataJpaTest
public class JobGroupRepositoryTest {
    @Autowired
    private JobGroupRepository jobGroupRepository;
}
