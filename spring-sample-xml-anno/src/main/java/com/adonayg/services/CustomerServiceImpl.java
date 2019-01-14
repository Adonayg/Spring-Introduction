package com.adonayg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adonayg.model.Customer;
import com.adonayg.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
//  Using stereotypes	
//	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository=customerRepository;
		System.out.println("Using Consturctor");
	}
	
//	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("Using setter injection");
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
