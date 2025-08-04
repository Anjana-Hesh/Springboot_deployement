package lk.ijse.gdse72.springboot_deployement.service;

import lk.ijse.gdse72.springboot_deployement.dto.CustomerDTO;

import java.util.List;


public interface CustomerService {

    void saveCustomer(CustomerDTO customerDTO);
    void updateCustomer(CustomerDTO customerDTO);
    List<CustomerDTO> getAllCustomer();

}
