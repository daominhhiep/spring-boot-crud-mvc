package com.example.javacrud.controller;

import com.example.javacrud.model.Customer;
import com.example.javacrud.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@CrossOrigin("*")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @GetMapping("/")
    public ResponseEntity<Iterable<Customer>> getAllCustomers() {
        return ResponseEntity.ok(customerService.findAll());
    }
}
