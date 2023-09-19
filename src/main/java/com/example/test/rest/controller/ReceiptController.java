package com.example.test.rest.controller;

import com.example.test.model.Receipt;
import com.example.test.rest.config.Config;
import com.example.test.service.impl.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Configuration
@RequestMapping(Config.BASEPATH)
public class ReceiptController {

    @Autowired
    ReceiptService service;

    @GetMapping(Config.GET_ALL)
    public ResponseEntity getAllReceipts() {
        return service.getAll();
    }

    @GetMapping(Config.GET_POINTS)
    public ResponseEntity getPointsById(@PathVariable String id) {
        return service.getPointsByReceipt(id);
    }

    @PostMapping(Config.PROCESS)
    public ResponseEntity process(@RequestBody Receipt receipt) {
        return service.addReceipt(receipt);
    }
}
