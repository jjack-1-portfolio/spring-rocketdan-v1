package com.metacoding.springrocketdanv1.certification;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CertificationService {
    private final CertificationRepository certificationRepository;
}
