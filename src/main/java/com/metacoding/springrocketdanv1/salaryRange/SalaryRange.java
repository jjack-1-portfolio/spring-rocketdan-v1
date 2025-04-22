package com.metacoding.springrocketdanv1.salaryRange;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "salary_range_tb")
public class SalaryRange {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer minSalary;
    private Integer maxSalary;
    private String label; // 구간표시 "minSalary-maxSalary"
}
