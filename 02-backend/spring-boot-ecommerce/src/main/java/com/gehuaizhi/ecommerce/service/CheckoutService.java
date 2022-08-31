package com.gehuaizhi.ecommerce.service;

import com.gehuaizhi.ecommerce.dto.PaymentInfo;
import com.gehuaizhi.ecommerce.dto.Purchase;
import com.gehuaizhi.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
