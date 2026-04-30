package edu.icet.ecom.repository.impl;

import edu.icet.ecom.dto.CustomerDTO;
import edu.icet.ecom.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    final private JdbcTemplate jdbcTemplate;

    @Override
    public boolean addCustomers(CustomerDTO customerDTO) {
        String sql = "INSERT INTO customer (id, name, email, phone) VALUES (?, ?, ?, ?)";
        return jdbcTemplate.update(sql,
                customerDTO.getId(),
                customerDTO.getName(),
                customerDTO.getEmail(),
                customerDTO.getPhoneNumber()
        ) > 0;
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
