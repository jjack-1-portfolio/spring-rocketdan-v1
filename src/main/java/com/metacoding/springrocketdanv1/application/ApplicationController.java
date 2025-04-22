package com.metacoding.springrocketdanv1.application;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class ApplicationController {
    private final ApplicationService applicationService;
}
