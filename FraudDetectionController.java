package com.fraudDetection.controller;

import org.springframework.web.bind.annotation.*;
import com.fraudDetection.service.FraudDetectionService;
import com.fraudDetection.model.Transaction;

@RestController
@RequestMapping("/api/fraud")
public class FraudDetectionController {

    private final FraudDetectionService fraudDetectionService;

    public FraudDetectionController(FraudDetectionService fraudDetectionService) {
        this.fraudDetectionService = fraudDetectionService;
    }

    @PostMapping("/detect")
    public String detectFraud(@RequestBody Transaction transaction) {
        return fraudDetectionService.analyzeTransaction(transaction);
    }
}