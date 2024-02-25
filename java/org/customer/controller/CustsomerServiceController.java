package org.customer.controller;

import org.customer.dto.CustomerRequest;
import org.customer.dto.CustomerResponse;
import org.customer.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class CustsomerServiceController {

	@Autowired
	CustomerServiceImpl CustomerServiceImpl;

	@PostMapping(path = "/api/v1/customer/add", consumes = { "application/json", "application/xml" }, produces = {
			"application/json", "application/xml" })
	public CustomerResponse addCustomerDetails(@Valid @RequestBody CustomerRequest request) {
		return CustomerServiceImpl.addCustomerDetails(request);
	}

	@PostMapping(path = "/api/v1/customer/update/{id}", consumes = { "application/json",
			"application/xml" }, produces = { "application/json", "application/xml" })
	public CustomerResponse update(@PathVariable long id, @RequestBody CustomerRequest request) {
		return CustomerServiceImpl.updateCustomerDetails(id, request);
	}

	@GetMapping(path = "/api/v1/customer/search/{mobile_number}")
	public CustomerResponse searchCustomerByMobileNumber(String mobile_number) {
		return CustomerServiceImpl.findByMobileNumber(mobile_number);
	}

}
