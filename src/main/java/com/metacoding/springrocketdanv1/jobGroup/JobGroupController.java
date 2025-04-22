package com.metacoding.springrocketdanv1.jobGroup;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class JobGroupController {
    private final JobGroupService jobGroupService;
}
