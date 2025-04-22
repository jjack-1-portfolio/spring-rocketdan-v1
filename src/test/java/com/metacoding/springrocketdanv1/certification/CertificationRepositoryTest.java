package com.metacoding.springrocketdanv1.certification;

import com.metacoding.springrocketdanv1.board.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

@Import(CertificationRepository.class)
@DataJpaTest
public class CertificationRepositoryTest {
    @Autowired
    private CertificationRepository certificationRepository;
}
