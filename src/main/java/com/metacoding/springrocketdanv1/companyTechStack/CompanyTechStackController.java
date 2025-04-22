package com.metacoding.springrocketdanv1.companyTechStack;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class CompanyTechStackController {
    private final CompanyTechStackService companyTechStackService;
}
