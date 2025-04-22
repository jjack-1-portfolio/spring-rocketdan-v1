package com.metacoding.springrocketdanv1.company;

import com.metacoding.springrocketdanv1.certification.CertificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

@Import(CompanyRepository.class)
@DataJpaTest
public class CompanyRepositoryTest {
    @Autowired
    private CompanyRepository companyRepository;
}
