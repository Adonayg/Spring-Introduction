package com.adonayg.services;

import java.util.List;

import com.adonayg.model.Customer;
import com.adonayg.repository.CustomerRepository;
import com.adonayg.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.adonayg.services.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
