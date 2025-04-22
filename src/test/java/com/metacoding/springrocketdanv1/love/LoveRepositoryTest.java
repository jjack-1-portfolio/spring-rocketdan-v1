package com.metacoding.springrocketdanv1.love;

import com.metacoding.springrocketdanv1.jobTechStack.JobTechStackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

@Import(LoveRepository.class)
@DataJpaTest
public class LoveRepositoryTest {
    @Autowired
    private LoveRepository loveRepository;
}
