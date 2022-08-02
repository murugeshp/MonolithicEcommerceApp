package com.murugesh1996.ecommerceapp.dto;

import com.murugesh1996.ecommerceapp.entity.Address;
import com.murugesh1996.ecommerceapp.entity.Customer;
import com.murugesh1996.ecommerceapp.entity.Order;
import com.murugesh1996.ecommerceapp.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;


}
