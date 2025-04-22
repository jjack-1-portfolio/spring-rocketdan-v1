package com.metacoding.springrocketdanv1.jobTechStack;

import com.metacoding.springrocketdanv1.jobGroup.JobGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

@Import(JobTechStackRepository.class)
@DataJpaTest
public class JobTechStackRepositoryTest {
    @Autowired
    private JobTechStackRepository jobTechStackRepository;
}
