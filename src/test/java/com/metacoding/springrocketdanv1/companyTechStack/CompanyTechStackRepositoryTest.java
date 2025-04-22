package com.metacoding.springrocketdanv1.companyTechStack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

@Import(CompanyTechStackRepository.class)
@DataJpaTest
public class CompanyTechStackRepositoryTest {
    @Autowired
    private CompanyTechStackRepository companyTechStackRepository;
}
