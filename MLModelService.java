package com.fraudDetection.service;

import org.springframework.stereotype.Service;
import com.fraudDetection.model.Transaction;

@Service
public class MLModelService {

    public String predictFraud(Transaction transaction) {
        // Simulated AI Fraud Detection Logic (Replace with real AI model)
        if (transaction.getAmount() > 5000) {
            return "Fraudulent Transaction Detected!";
        }
        return "Transaction is Safe.";
    }
}