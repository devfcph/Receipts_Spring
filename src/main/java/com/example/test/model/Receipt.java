package com.example.test.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Receipt {
    private String ID;
    private String Retailer;
    private String PurchaseDate;
    private String PurchaseTime;
    private Double Total;
    private Integer Points;
    private List<ReceiptItem> ReceiptItems;
}
