package com.metacoding.springrocketdanv1.resumeTechStack;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class ResumeTechStackController {
    private final ResumeTechStackService resumeTechStackService;
}