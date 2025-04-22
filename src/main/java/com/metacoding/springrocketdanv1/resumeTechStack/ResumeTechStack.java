package com.metacoding.springrocketdanv1.resumeTechStack;

import com.metacoding.springrocketdanv1.resume.Resume;
import com.metacoding.springrocketdanv1.techStack.TechStack;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "resume_tech_stack_tb")
public class ResumeTechStack {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // 이력서 FK
    @ManyToOne(fetch = FetchType.LAZY)
    private Resume resume;

    // 기술스택 FK
    @ManyToOne(fetch = FetchType.LAZY)
    private TechStack techStack;
}
