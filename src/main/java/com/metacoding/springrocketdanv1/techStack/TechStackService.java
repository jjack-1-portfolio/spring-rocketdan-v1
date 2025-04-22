package com.metacoding.springrocketdanv1.techStack;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TechStackService {
    private final TechStackRepository techStackRepository;
}