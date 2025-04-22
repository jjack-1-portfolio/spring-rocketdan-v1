package com.metacoding.springrocketdanv1.resumeBookmark;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ResumeBookmarkService {
    private final ResumeBookmarkRepository resumeBookmarkRepository;
}