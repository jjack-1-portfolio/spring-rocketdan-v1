package com.metacoding.springrocketdanv1.career;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class CareerController {
    private final CareerService careerService;
}
