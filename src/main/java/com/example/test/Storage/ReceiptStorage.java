package com.example.test.Storage;

import com.example.test.model.Receipt;

import java.util.ArrayList;
import java.util.List;

public class ReceiptStorage {
    public static List<Receipt> storage;

    public static void ReceiptStorage() {
        storage = new ArrayList<>();
    }
}
