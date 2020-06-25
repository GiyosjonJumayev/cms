package com.example.cms.service;

import com.example.cms.DAO.CustomerDAO;
import com.example.cms.exception.CustomerNotFoundException;
import com.example.cms.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
//import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by Smart on 19.06.2020.
 */

@Component
public class CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

//    private int customerIdCount = 1;
//    private List<Customer> customerList = new CopyOnWriteArrayList<>();

    public Customer addCustomer(Customer customer) {
//        customer.setCustomerId(customerIdCount);
//        customerList.add(customer);
//        customerIdCount++;
//        return customer;

        return customerDAO.save(customer);
    }

    public List<Customer> getCustomers() {
        //return customerList;

        return customerDAO.findAll();
    }

    public Customer getCustomer(int customerId) {
//        return customerList
//                .stream()
//                .filter(c -> c.getCustomerId() == customerId)
//                .findFirst()
//                .get();

       Optional<Customer> optionalCustomer = customerDAO.findById(customerId);

       if (!optionalCustomer.isPresent())
           throw new CustomerNotFoundException("Customer Record is not available...");

       return optionalCustomer.get();
    }

    public Customer updateCustomer(int customerId, Customer customer) {

        customer.setCustomerId(customerId);
//        customerList
//                .stream()
//                .forEach(c -> {
//                    if (c.getCustomerId() == customerId) {
//                        c.setCustomerFirstName(customer.getCustomerFirstName());
//                        c.setCustomerLastName(customer.getCustomerLastName());
//                        c.setCustomerEmail(customer.getCustomerEmail());
//                    }
//                });
//
//        return customerList
//                .stream()
//                .filter(c -> c.getCustomerId() == customerId)
//                .findFirst()
//                .get();
        return customerDAO.save(customer);
    }

    public void deleteCustomer(int customerId) {

//        customerList
//                .stream()
//                .forEach(c -> {
//                    if(c.getCustomerId() == customerId) {
//                        customerList.remove(c);
//                    }
//                });
        customerDAO.deleteById(customerId);
    }

}
