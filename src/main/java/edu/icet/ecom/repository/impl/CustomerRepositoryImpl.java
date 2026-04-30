package edu.icet.ecom.repository.impl;

import edu.icet.ecom.dto.CustomerDTO;
import edu.icet.ecom.repository.CustomerRepository;

import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public boolean addCustomers(CustomerDTO customerDTO) {
        return false;
    }

    @Override
    public boolean updateCustomer(CustomerDTO customerDTO) {
        return false;
    }

    @Override
    public boolean deleteCustomer() {
        return false;
    }

    @Override
    public List<CustomerDTO> getAll() {
        return List.of();
    }
}
