package com.adonayg.repository;

import java.util.List;

import com.adonayg.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}