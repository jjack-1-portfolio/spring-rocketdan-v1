package com.metacoding.springrocketdanv1.techStack;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class TechStackController {
    private final TechStackService techStackService;
}