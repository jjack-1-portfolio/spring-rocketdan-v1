package com.metacoding.springrocketdanv1.love;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class LoveController {
    private final LoveService loveService;
}
