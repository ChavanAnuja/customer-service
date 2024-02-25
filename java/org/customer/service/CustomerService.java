package org.customer.service;

import org.customer.dto.CustomerRequest;
import org.customer.dto.CustomerResponse;
import org.customer.dto.SearchCustomerResponse;

public interface CustomerService {

	public CustomerResponse addCustomerDetails(CustomerRequest customerRequest);

	public CustomerResponse updateCustomerDetails(long id, CustomerRequest customerRequest) ;
	
	//public CustomerResponse findByEmailId(String email_id);
	
	public CustomerResponse findByMobileNumber(String mobile_number);
		
}
