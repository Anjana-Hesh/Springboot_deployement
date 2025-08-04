package lk.ijse.gdse72.springboot_deployement.service.impl;

import lk.ijse.gdse72.springboot_deployement.dto.CustomerDTO;
import lk.ijse.gdse72.springboot_deployement.entity.Customer;
import lk.ijse.gdse72.springboot_deployement.repository.CustomerRepository;
import lk.ijse.gdse72.springboot_deployement.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final ModelMapper modelMapper;
    @Override
    public void saveCustomer(CustomerDTO customerDTO) {

        customerRepository.save(modelMapper.map(customerDTO, Customer.class));

    }

    @Override
    public void updateCustomer(CustomerDTO jobDTO) {
        customerRepository.save(modelMapper.map(jobDTO, Customer.class));
    }

    @Override
    public List<CustomerDTO> getAllCustomer() {
        List<Customer> customers = customerRepository.findAll();
        if (customers.isEmpty()) {
            return List.of(); // Return an empty list if no customers found
        }
        return customers.stream()
                .map(customer -> modelMapper.map(customer, CustomerDTO.class))
                .toList();
    }
}
