package com.murugesh1996.ecommerceapp.controller;

import com.murugesh1996.ecommerceapp.dto.Purchase;
import com.murugesh1996.ecommerceapp.dto.PurchaseResponse;
import com.murugesh1996.ecommerceapp.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;
    }
}
