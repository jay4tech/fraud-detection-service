package com.example.fraud.service;

import com.example.fraud.model.TransactionEvent;

public interface IFraudDetectionService {
    void analyzeTransaction(TransactionEvent transactionEvent);
}
