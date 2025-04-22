package com.metacoding.springrocketdanv1.career;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CareerService {
    private final CareerRepository careerRepository;
}
