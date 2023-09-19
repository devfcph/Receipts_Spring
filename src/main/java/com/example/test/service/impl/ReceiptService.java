package com.example.test.service.impl;

import com.example.test.enums.ActionReceipt;
import com.example.test.model.Receipt;
import com.example.test.rest.dto.Default;
import com.example.test.service.IReceiptService;
import com.example.test.service.repository.IReceiptRepository;
import com.example.test.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ReceiptService implements IReceiptService {

    @Autowired
    private IReceiptRepository repository;


    private Default buildDefault(Exception ex, ActionReceipt action) {

        return Default.builder()
                .Code(HttpStatus.BAD_REQUEST.hashCode())
                .Message(Utils.getMessageFromAction(action, ex.getMessage()))
                .build();
    }

    @Override
    public ResponseEntity addReceipt(Receipt receipt) {
        try {
            return new ResponseEntity(repository.addReceipt(receipt), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(buildDefault(e, ActionReceipt.ADD_RECEIPT), HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity getPointsByReceipt(String id) {
        try {
            return new ResponseEntity(repository.getPointsByReceipt(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(buildDefault(e, ActionReceipt.SEARCH_BY_ID), HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity getAll() {
        try {
            return new ResponseEntity(repository.getReceipts(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(buildDefault(e, ActionReceipt.GET_ALL), HttpStatus.BAD_REQUEST);
        }
    }
}
