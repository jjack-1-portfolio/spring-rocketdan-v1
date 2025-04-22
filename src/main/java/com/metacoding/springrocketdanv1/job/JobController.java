package com.metacoding.springrocketdanv1.job;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class JobController {
    private final JobService jobService;
}
