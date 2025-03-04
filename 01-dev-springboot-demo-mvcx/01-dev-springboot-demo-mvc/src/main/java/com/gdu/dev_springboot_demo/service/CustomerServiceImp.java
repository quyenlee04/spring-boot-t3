package com.gdu.dev_springboot_demo.service;

import com.gdu.dev_springboot_demo.dao.CustomerDao;
import com.gdu.dev_springboot_demo.Model.Customer;
import com.gdu.dev_springboot_demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class CustomerServiceImp implements CustomerService {
    private CustomerDao customerDao;

    @Autowired
    public CustomerServiceImp(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public List<Customer> getCustomers() {
        return customerDao.getCustomers();
    }

    @Override
    public Customer findCustomerById(int id) {
        return customerDao.findCustomerById(id);
    }

    @Override
    @Transactional
    public void saveCustomer(Customer customer) {
        customerDao.saveCustomer(customer);
    }

    @Override
    @Transactional
    public void updateCustomer(Customer customer) {
        customerDao.updateCustomer(customer);
    }

    @Override
    @Transactional
    public void deleteCustomerById(int id) {
        customerDao.deleteCustomerById(id);
    }

}
