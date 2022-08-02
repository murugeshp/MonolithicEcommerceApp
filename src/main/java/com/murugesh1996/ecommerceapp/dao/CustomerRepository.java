package com.murugesh1996.ecommerceapp.dao;

import com.murugesh1996.ecommerceapp.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByEmail(String theEmail);
}
