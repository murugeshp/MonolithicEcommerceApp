package com.murugesh1996.ecommerceapp.service;

import com.murugesh1996.ecommerceapp.dto.Purchase;
import com.murugesh1996.ecommerceapp.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
