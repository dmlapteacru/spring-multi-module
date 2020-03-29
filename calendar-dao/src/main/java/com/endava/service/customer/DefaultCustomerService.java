package com.endava.service.customer;

import com.endava.data.customer.Customer;
import org.springframework.stereotype.Service;

@Service("customerService")
public class DefaultCustomerService implements CustomerService {

    @Override
    public Customer getCustomerById(String id) {
        return new Customer("Test","Customer",id,"contact-us@javadevjournal.com");
    }
}
