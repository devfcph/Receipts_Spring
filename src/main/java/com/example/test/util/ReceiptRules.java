package com.example.test.util;

import com.example.test.model.Receipt;

public class ReceiptRules {


    public static Integer CalculatePoints(Receipt receipt) {
        Integer points = 0;
        points += CalculatePointsByRetailerName(receipt.getRetailer());
        points += CalculatePointsByTotal(String.valueOf(receipt.getTotal()));
        points += CalculatePointsByItems(receipt);
        points += CalculatePointsByPurchaseInfo(receipt.getPurchaseDate(), receipt.getPurchaseTime());
        return points;
    }

    private static Integer CalculatePointsByRetailerName(String retailerName) {
        return 0;
    }

    private static Integer CalculatePointsByTotal(String total) {
        return 0;
    }

    private static Integer CalculatePointsByItems(Receipt receipt) {
        return 0;
    }

    private static Integer CalculatePointsByPurchaseInfo(String date, String time) {
        return 0;
    }
}
