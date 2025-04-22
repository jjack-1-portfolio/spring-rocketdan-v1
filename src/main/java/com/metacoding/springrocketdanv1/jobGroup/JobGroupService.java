package com.metacoding.springrocketdanv1.jobGroup;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JobGroupService {
    private final JobGroupRepository jobGroupRepository;
}
