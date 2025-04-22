package com.metacoding.springrocketdanv1.workField;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class WorkFieldController {
    private final WorkFieldService workFieldService;
}