package com.gehuaizhi.ecommerce.service;

import com.gehuaizhi.ecommerce.dto.Purchase;
import com.gehuaizhi.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
