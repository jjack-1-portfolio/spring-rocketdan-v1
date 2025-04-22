package com.metacoding.springrocketdanv1.jobGroup;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "job_group_tb")
public class JobGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name; // 직군. 백엔드 개발자, 프론트엔드 개발자
}
