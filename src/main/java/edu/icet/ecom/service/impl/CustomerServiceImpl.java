package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.CustomerDTO;
import edu.icet.ecom.repository.CustomerRepository;
import edu.icet.ecom.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {
    final CustomerRepository customerRepository;

    @Override
    public boolean addCustomers(CustomerDTO customerDTO) {
        return customerRepository.addCustomers(customerDTO);
    }

    @Override
    public boolean updateCustomer(CustomerDTO customerDTO) {
        return false;
    }

    @Override
    public boolean deleteCustomer(String id) {
        return false;
    }

    @Override
    public List<CustomerDTO> getAll() {
        return List.of();
    }
}
