package com.metacoding.springrocketdanv1.companyTechStack;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompanyTechStackService {
    private final CompanyTechStackRepository companyTechStackRepository;
}
