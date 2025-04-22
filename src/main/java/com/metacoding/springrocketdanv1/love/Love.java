package com.metacoding.springrocketdanv1.love;

import com.metacoding.springrocketdanv1.board.Board;
import com.metacoding.springrocketdanv1.user.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "love_tb", uniqueConstraints = {
        @UniqueConstraint(
                name = "uk_user_board",
                columnNames = {"user_id", "board_id"}
        )
})
public class Love {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // 유저 FK
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    // 게시물 FK
    @ManyToOne(fetch = FetchType.LAZY)
    private Board board;
}
