package com.metacoding.springrocketdanv1.resumeBookmark;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class ResumeBookmarkController {
    private final ResumeBookmarkService resumeBookmarkService;
}