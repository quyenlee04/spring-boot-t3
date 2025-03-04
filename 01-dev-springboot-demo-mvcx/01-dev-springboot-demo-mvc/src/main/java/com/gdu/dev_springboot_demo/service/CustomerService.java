package com.gdu.dev_springboot_demo.service;

import com.gdu.dev_springboot_demo.Model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getCustomers();
    Customer findCustomerById(int id);
    void saveCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomerById(int id);

}
