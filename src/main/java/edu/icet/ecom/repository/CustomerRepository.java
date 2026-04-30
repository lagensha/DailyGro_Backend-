package edu.icet.ecom.repository;

import edu.icet.ecom.dto.CustomerDTO;

import java.util.List;

public interface CustomerRepository {
    boolean addCustomers(CustomerDTO customerDTO);
    boolean updateCustomer(CustomerDTO customerDTO);
    boolean deleteCustomer(String id);
    List<CustomerDTO> getAll();
}
