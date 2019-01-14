package com.adonayg.repository;

import java.util.ArrayList;
import java.util.List;

import com.adonayg.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	/* (non-Javadoc)
	 * @see com.adonayg.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setFirstName("Adonay");
		customer.setLastName("G");
		customers.add(customer);
		return customers;
	}
}
