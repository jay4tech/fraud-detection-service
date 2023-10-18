package com.example.fraud.controller;

import com.example.fraud.model.TransactionEvent;
import com.example.fraud.service.IFraudDetectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fraudDetection")
public class FraudDetectionController {


    @Autowired
    IFraudDetectionService fraudDetectionService;
    @PostMapping("/analyzeTransaction")
    public void analyzeTransaction(@RequestBody TransactionEvent transactionEvent) {
        fraudDetectionService.analyzeTransaction(transactionEvent);
    }
}
