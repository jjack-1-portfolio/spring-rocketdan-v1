package com.metacoding.springrocketdanv1.reply;

import com.metacoding.springrocketdanv1.love.LoveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

@Import(ReplyRepository.class)
@DataJpaTest
public class ReplyRepositoryTest {
    @Autowired
    private ReplyRepository replyRepository;
}
