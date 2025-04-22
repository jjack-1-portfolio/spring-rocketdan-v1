package com.metacoding.springrocketdanv1.salaryRange;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class SalaryRangeController {
    private final SalaryRangeService salaryRangeService;
}