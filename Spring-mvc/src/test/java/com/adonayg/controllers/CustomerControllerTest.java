package com.adonayg.controllers;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.instanceOf;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.adonayg.domain.Customer;
import com.adonayg.services.CustomerService;

public class CustomerControllerTest {
	@Mock
	private CustomerService customerService;

	@InjectMocks
	private CustomerController customerController;

	private MockMvc mockMvc;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);

		mockMvc = MockMvcBuilders.standaloneSetup(customerController).build();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Test
	public void testList() throws Exception {
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer());
		customers.add(new Customer());

		when(customerService.listAll()).thenReturn((List) customers);

		mockMvc.perform(get("/customer/list")).andExpect(status().isOk()).andExpect(view().name("customer/list"))
				.andExpect(model().attribute("customers", hasSize(2)));
	}

	@Test
	public void testShow() throws Exception {
		Integer id = 1;

		when(customerService.getById(id)).thenReturn(new Customer());

		mockMvc.perform(get("/customer/show/1")).andExpect(status().isOk()).andExpect(view().name("customer/show"))
				.andExpect(model().attribute("customer", instanceOf(Customer.class)));
	}

	@Test
	public void testEdit() throws Exception {
		Integer id = 1;

		when(customerService.getById(id)).thenReturn(new Customer());

		mockMvc.perform(get("/customer/edit/1")).andExpect(status().isOk())
				.andExpect(view().name("customer/customerform"))
				.andExpect(model().attribute("customer", instanceOf(Customer.class)));
	}

	@Test
	public void testNewCustomer() throws Exception {
		verifyZeroInteractions(customerService);

		mockMvc.perform(get("/customer/new")).andExpect(status().isOk()).andExpect(view().name("customer/customerform"))
				.andExpect(model().attribute("customer", instanceOf(Customer.class)));
	}

}
