package org.customer.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.customer.dto.CustomerData;
import org.customer.dto.CustomerRequest;
import org.customer.dto.CustomerResponse;
import org.customer.dto.SearchCustomerResponse;
import org.customer.entity.Customer;
import org.customer.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepo;

	@Autowired
	CustomerResponse customerResponse;

	@Autowired
	SearchCustomerResponse searchCustomerResponse;

	@Override
	public CustomerResponse addCustomerDetails(CustomerRequest customerRequest) {

		if (customerRepo.existsByEmail_id(customerRequest.getEmailID())) {
			customerResponse.setStatus("Error");
			customerResponse.setMessage("Email is already exist! Please enter valid emailID");
			customerResponse.setCustomerCode(0000);
		} else {

			Customer customerTable = Customer.getInstance().setFirst_name(customerRequest.getFirstName())
					.setMiddle_name(customerRequest.getMiddleName()).setLast_name(customerRequest.getLastName())
					.setDate_of_birth(customerRequest.getDateOfBirth())
					.setAddress_line1(customerRequest.getAddressLine1())
					.setAddress_line2(customerRequest.getAddressLine2()).setZip(customerRequest.getZip())
					.setCity(customerRequest.getCity()).setState(customerRequest.getState())
					.setCountry(customerRequest.getCountry()).setMobile_phone(customerRequest.getMobilePhone())
					.setHome_phone(customerRequest.getHomePhone()).setWork_phone(customerRequest.getWorkPhone())
					.setEmail_id(customerRequest.getEmailID()).setCustomer_id(customerRequest.getCustomerId())
					.setCreated_date(LocalDateTime.now()).setUpdated_date(LocalDateTime.now());

			try {
				customerTable = customerRepo.save(customerTable);
			} catch (Exception e) {
				e.printStackTrace();
			}

			customerResponse.setStatus("Success");
			customerResponse.setMessage("Customer added successfully!!");
			customerResponse.setCustomerCode(customerTable.getCustomer_code());

		}
		return customerResponse;
	}

	public CustomerResponse updateCustomerDetails(long id, CustomerRequest customerRequest) {

		Optional<Customer> customerTable = customerRepo.findById(id);
		if (customerTable.isEmpty()) {
			customerResponse.setStatus("Fail");
			customerResponse.setMessage("Customer not present");
			customerResponse.setCustomerCode(0000);
		} else {
			Customer customer = Customer.getInstance().setFirst_name(customerRequest.getFirstName())
					.setMiddle_name(customerRequest.getMiddleName()).setLast_name(customerRequest.getLastName())
					.setDate_of_birth(customerRequest.getDateOfBirth())
					.setAddress_line1(customerRequest.getAddressLine1())
					.setAddress_line2(customerRequest.getAddressLine2()).setZip(customerRequest.getZip())
					.setCity(customerRequest.getCity()).setState(customerRequest.getState())
					.setCountry(customerRequest.getCountry()).setMobile_phone(customerRequest.getMobilePhone())
					.setHome_phone(customerRequest.getHomePhone()).setWork_phone(customerRequest.getWorkPhone())
					.setEmail_id(customerRequest.getEmailID()).setCustomer_id(customerRequest.getCustomerId())
					.setCreated_date(LocalDateTime.now()).setUpdated_date(LocalDateTime.now());

		}

		return customerResponse;

	}

	public CustomerResponse findByMobileNumber(String mobile_number) {
	    List<Customer> customerTable = customerRepo.findByMobile(mobile_number);

	    if (customerTable.isEmpty()) {
	        customerResponse.setStatus("Fail");
	        customerResponse.setMessage("Customer not found!!");
	        customerResponse.setCustomerCode(0000);
	    } else {
	        Customer receivedData = customerTable.get(0);

	        searchCustomerResponse.setStatus("Success");
	        searchCustomerResponse.setMessage("Customer details are as follows:");
	        searchCustomerResponse.setCustomerCode(receivedData.getCustomer_code());

	        // Set individual customer data fields
	        CustomerData customerData = searchCustomerResponse.getCustomerData();
	        customerData.setFirstName(receivedData.getFirst_name());
	        customerData.setMiddleName(receivedData.getMiddle_name());
	        customerData.setLastName(receivedData.getLast_name());
	        customerData.setDateOfBirth(receivedData.getDate_of_birth());
	        customerData.setAddressLine1(receivedData.getAddress_line1());
	        customerData.setAddressLine2(receivedData.getAddress_line2());
	        customerData.setZip(receivedData.getZip());
	        customerData.setCity(receivedData.getCity());
	        customerData.setState(receivedData.getState());
	        customerData.setCountry(receivedData.getCountry());
	        customerData.setMobilePhone(receivedData.getMobile_phone());
	        customerData.setHomePhone(receivedData.getHome_phone());
	        customerData.setWorkPhone(receivedData.getWork_phone());
	        customerData.setEmailID(receivedData.getEmail_id());
	    }

	    return customerResponse;
	}


}
