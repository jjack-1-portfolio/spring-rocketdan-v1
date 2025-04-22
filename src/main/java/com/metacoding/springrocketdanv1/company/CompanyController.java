package com.metacoding.springrocketdanv1.company;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class CompanyController {
    private final CompanyService companyService;
}
