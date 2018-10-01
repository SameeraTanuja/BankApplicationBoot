package com.capgemini.bankapplication;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.capgemini.bankapplication.controller.CustomerController;
import com.capgemini.bankapplication.model.BankAccount;
import com.capgemini.bankapplication.model.Customer;
import com.capgemini.bankapplication.repository.CustomerRepository;

public class BankapplicationTests {
	
		@InjectMocks
		CustomerController customerController;

		@Mock
		CustomerRepository customerRepository;

		@Before
		public void init() {
			MockitoAnnotations.initMocks(this);
		}

	

		@Test
		public void testAuthenticate() {
			Customer customer = new Customer();
			customer.setCustomerId(1234);
			customer.setPassword("tanu123");

			Customer customer1 = new Customer("Sameera", 1234, "sameera@gmail.com", "hyderabad", "tanu123",
					LocalDate.of(1996, 07, 26), new BankAccount(221700, 808, "SAVINGS"));

			//when(customerRepository.authenticateCustomer(customer)).thenReturn(customer1);

			//CustomerController sc= customerController.checking(null, null, null, 0, null);
			
			//assertEquals(customer1, customerRepository.authenticateCustomer(customer));

		}

	
	}


