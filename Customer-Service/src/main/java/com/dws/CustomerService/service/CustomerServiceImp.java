package com.dws.CustomerService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dws.CustomerService.dto.Customer;
import com.dws.CustomerService.dto.RespuestaApi;
import com.dws.CustomerService.repository.CustomerRepository;

@Service
public class CustomerServiceImp implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public List<Customer> getCustomers() {
		return customerRepository.getCustomers();
	}

	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return customerRepository.getCustomer(id);
	}

	@Override
	public RespuestaApi createCustomer(Customer customer) {
		return customerRepository.createCustomer(customer);
	}

	@Override
	public RespuestaApi updateCustomer(Customer customer, int id) {
		return customerRepository.updateCustomer(customer, id);
	}

	@Override
	public RespuestaApi deleteCustomer(int id) {
		return customerRepository.deleteCustomer(id);
	}

}
