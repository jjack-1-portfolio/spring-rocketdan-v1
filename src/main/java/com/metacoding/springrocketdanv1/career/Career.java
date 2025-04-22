package com.metacoding.springrocketdanv1.career;

import com.metacoding.springrocketdanv1.jobGroup.JobGroup;
import com.metacoding.springrocketdanv1.resume.Resume;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "career_tb")
public class Career {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String companyName; // 이전에 다녔던 기업이름
    private String startDate; // 시작일
    private String endDate; // 종료일

    @CreationTimestamp
    private Timestamp createdAt;

    // 직군 FK
    @ManyToOne(fetch = FetchType.LAZY)
    private JobGroup jobGroup;

    // 이력서 FK
    @ManyToOne(fetch = FetchType.LAZY)
    private Resume resume;

}
