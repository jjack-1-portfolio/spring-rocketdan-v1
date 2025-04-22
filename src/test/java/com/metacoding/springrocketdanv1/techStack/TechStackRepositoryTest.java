package com.metacoding.springrocketdanv1.techStack;

import com.metacoding.springrocketdanv1.salaryRange.SalaryRangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

@Import(TechStackRepository.class)
@DataJpaTest
public class TechStackRepositoryTest {
    @Autowired
    private TechStackRepository techStackRepository;
}
