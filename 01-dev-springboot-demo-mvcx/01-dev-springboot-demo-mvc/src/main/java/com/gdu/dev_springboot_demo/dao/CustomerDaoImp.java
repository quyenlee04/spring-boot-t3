package com.gdu.dev_springboot_demo.dao;

import com.gdu.dev_springboot_demo.dao.CustomerDao;
import com.gdu.dev_springboot_demo.Model.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CustomerDaoImp implements CustomerDao {
    @PersistenceContext
    private EntityManager em;

    @Autowired
    public CustomerDaoImp(EntityManager em) {
        this.em = em;
    }

    @Override
    @Transactional
    public List<Customer> getCustomers() {
        TypedQuery<Customer> query = em.createQuery("from Customer", Customer.class);
        return query.getResultList();
    }

    @Override
    @Transactional
    public Customer findCustomerById(int id) {
        return em.find(Customer.class, id);
    }

    @Override
    @Transactional
    public void saveCustomer(Customer customer) {
        em.persist(customer);
    }

    @Override
    @Transactional
    public void updateCustomer(Customer customer) {
        em.merge(customer);
    }

    @Override
    @Transactional
    public void deleteCustomerById(int id) {
        Customer customer = em.find(Customer.class, id);
        if (customer != null) {
            em.remove(customer);
        }
    }
}
