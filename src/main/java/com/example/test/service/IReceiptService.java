package com.example.test.service;

import com.example.test.model.Receipt;
import org.springframework.http.ResponseEntity;

public interface IReceiptService {

    ResponseEntity addReceipt(Receipt receipt);

    ResponseEntity getPointsByReceipt(String id);

    ResponseEntity getAll();
}
