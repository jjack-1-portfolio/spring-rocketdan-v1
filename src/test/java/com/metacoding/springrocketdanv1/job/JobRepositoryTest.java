package com.metacoding.springrocketdanv1.job;

import com.metacoding.springrocketdanv1.companyTechStack.CompanyTechStack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

@Import(JobRepository.class)
@DataJpaTest
public class JobRepositoryTest {
    @Autowired
    private JobRepository jobRepository;
}
