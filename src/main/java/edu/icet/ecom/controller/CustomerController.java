package edu.icet.ecom.controller;

import edu.icet.ecom.dto.CustomerDTO;
import edu.icet.ecom.service.impl.CustomerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/customer")
public class CustomerController {

    final CustomerServiceImpl customerService;

    @GetMapping("/add")
    public boolean addCustomers(CustomerDTO customerDTO) {
        return customerService.addCustomers(customerDTO);
    }


    public boolean updateCustomer(CustomerDTO customerDTO) {
        return false;
    }


    public boolean deleteCustomer(String id) {
        return false;
    }

    public java.util.List<edu.icet.ecom.dto.CustomerDTO> getAll() {
        return null;
    }
}
