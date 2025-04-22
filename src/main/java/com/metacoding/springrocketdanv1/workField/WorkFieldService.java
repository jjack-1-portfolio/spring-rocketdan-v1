package com.metacoding.springrocketdanv1.workField;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WorkFieldService {
    private final WorkFieldRepository workFieldRepository;
}