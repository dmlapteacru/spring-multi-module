package com.endava.controller;


import com.endava.data.customer.Customer;
import com.endava.service.customer.CustomerService;
import com.endava.service.customer.SService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

//    @Resource(name = "customerService")
    @Autowired
    CustomerService customerService;

    @Autowired
    SService service;

    @GetMapping("/customer/{id}")
    public Customer getCustomer(@PathVariable String id){
        return customerService.getCustomerById(id);
    }
}
