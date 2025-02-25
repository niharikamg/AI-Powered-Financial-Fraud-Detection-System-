package com.fraudDetection.service;

import org.springframework.stereotype.Service;
import com.fraudDetection.model.Transaction;
import com.fraudDetection.service.MLModelService;

@Service
public class FraudDetectionService {

    private final MLModelService mlModelService;

    public FraudDetectionService(MLModelService mlModelService) {
        this.mlModelService = mlModelService;
    }

    public String analyzeTransaction(Transaction transaction) {
        return mlModelService.predictFraud(transaction);
    }
}