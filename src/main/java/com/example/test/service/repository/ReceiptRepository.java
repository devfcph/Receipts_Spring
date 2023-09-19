package com.example.test.service.repository;

import com.example.test.Storage.ReceiptStorage;
import com.example.test.model.Receipt;
import com.example.test.rest.dto.ReceiptPoints;
import com.example.test.rest.dto.ReceiptUUID;
import com.example.test.util.ReceiptRules;
import com.example.test.util.Utils;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class ReceiptRepository implements IReceiptRepository {

    @Override
    public ReceiptUUID addReceipt(Receipt receipt) throws Exception {
        try {
            String uuid = String.valueOf(UUID.randomUUID());
            receipt.setID(uuid);
            receipt.setPoints(ReceiptRules.CalculatePoints(receipt));
            ReceiptStorage.storage.add(receipt);

            return ReceiptUUID.builder()
                    .uuid(uuid)
                    .build();

        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public List<Receipt> getReceipts() throws Exception {
        return ReceiptStorage.storage;
    }

    @Override
    public Receipt getReceiptById(String id) throws Exception {
        return Utils.searchItem(id);
    }

    @Override
    public ReceiptPoints getPointsByReceipt(String id) throws Exception {
        return ReceiptPoints.builder()
                .Points(Utils.searchItem(id).getPoints())
                .build();
    }

}
