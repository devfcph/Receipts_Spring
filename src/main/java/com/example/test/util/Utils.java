package com.example.test.util;

import com.example.test.Storage.ReceiptStorage;
import com.example.test.constant.Constants;
import com.example.test.enums.ActionReceipt;
import com.example.test.model.Receipt;

public class Utils {
    public static final String getMessageFromAction(ActionReceipt actionReceipt, String strToReplace) {
        return switch (actionReceipt) {
            case ADD_RECEIPT -> Constants.RECEIPT_INVALID.replace(Constants.REPLACE, strToReplace);
            case SEARCH_BY_ID -> Constants.RECEIPT_NOT_FOUND;
            case GET_ALL -> Constants.DEFAULT;
        };
    }

    public static Receipt searchItem(String id) {
        try {
            return ReceiptStorage.storage.stream().filter(item -> item.getID().equals(id)).findFirst().get();
        } catch (Exception e) {
            throw e;
        }
    }
}
