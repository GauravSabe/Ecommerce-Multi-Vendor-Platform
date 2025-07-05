package com.zosh.response;

import com.zosh.dto.OrderHistory;
import com.zosh.model.Cart;
import com.zosh.model.Order;
import com.zosh.model.Product;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FunctionResponse {
    private String functionName;
    private Cart userCart;
    private OrderHistory orderHistory;
    private Product product;

    private String textResponse; // ✅ added for non-function text replies

    // ✅ New constructor for text-only responses
    public FunctionResponse(String functionName, String textResponse) {
        this.functionName = functionName;
        this.textResponse = textResponse;
    }
}
