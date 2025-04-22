package com.metacoding.springrocketdanv1.user;

import com.metacoding.springrocketdanv1.techStack.TechStackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

@Import(UserRepository.class)
@DataJpaTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;
}
