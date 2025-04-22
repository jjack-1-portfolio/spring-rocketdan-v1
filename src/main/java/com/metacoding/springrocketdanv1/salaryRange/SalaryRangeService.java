package com.metacoding.springrocketdanv1.salaryRange;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SalaryRangeService {
    private final SalaryRangeRepository salaryRangeRepository;
}