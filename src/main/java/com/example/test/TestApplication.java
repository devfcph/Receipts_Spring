package com.example.test;

import com.example.test.Storage.ReceiptStorage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        ReceiptStorage.ReceiptStorage();
        SpringApplication.run(TestApplication.class, args);
    }

}
