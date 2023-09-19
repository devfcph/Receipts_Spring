package com.example.test.service.repository;

import com.example.test.model.Receipt;
import com.example.test.rest.dto.ReceiptPoints;
import com.example.test.rest.dto.ReceiptUUID;

import java.util.List;

public interface IReceiptRepository {

    /**
     * Return ID from the new Receipt
     *
     * @param receipt
     * @return UUID
     * @throws Exception
     */
    ReceiptUUID addReceipt(Receipt receipt) throws Exception;

    /**
     * Return a list of Receipts
     *
     * @return
     * @throws Exception
     */
    List<Receipt> getReceipts() throws Exception;

    /**
     * Return an specific Receipt model
     *
     * @param id [String -UUID]
     * @return
     * @throws Exception
     */
    Receipt getReceiptById(String id) throws Exception;

    /**
     * Get the points by receipt
     *
     * @param receipt
     * @return
     * @throws Exception
     */
    ReceiptPoints getPointsByReceipt(String id) throws Exception;
}
