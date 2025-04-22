package com.metacoding.springrocketdanv1.resume;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class ResumeController {
    private final ResumeService resumeService;
}
