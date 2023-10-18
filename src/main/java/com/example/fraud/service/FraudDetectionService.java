package com.example.fraud.service;

import com.example.fraud.model.TransactionEvent;
import org.springframework.stereotype.Service;

@Service
public class FraudDetectionService implements IFraudDetectionService{
    @Override
    public void analyzeTransaction(TransactionEvent transactionEvent) {

    }
}
