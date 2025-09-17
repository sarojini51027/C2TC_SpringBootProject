package com.tnsif.customerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.customerservice.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
