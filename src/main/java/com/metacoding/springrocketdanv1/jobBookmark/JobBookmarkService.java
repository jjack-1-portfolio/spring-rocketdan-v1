package com.metacoding.springrocketdanv1.jobBookmark;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JobBookmarkService {
    private final JobBookmarkRepository jobBookmarkRepository;
}
