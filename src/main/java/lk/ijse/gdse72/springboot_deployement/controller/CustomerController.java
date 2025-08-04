package lk.ijse.gdse72.springboot_deployement.controller;

import lk.ijse.gdse72.springboot_deployement.dto.APIResponse;
import lk.ijse.gdse72.springboot_deployement.dto.CustomerDTO;
import lk.ijse.gdse72.springboot_deployement.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor

public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("create")
    public ResponseEntity<APIResponse<String>> getCustomer(@RequestBody CustomerDTO customerDTO) {
        customerService.saveCustomer(customerDTO);
//        return "Job Created";
        return new ResponseEntity(new APIResponse<>(
                200,
                "Job Created Successfully",
                null
        ), HttpStatus.CREATED);
    }

    @PutMapping("update")
    public ResponseEntity<APIResponse<String>> updateCustomer(@RequestBody CustomerDTO customerDTO) {
        customerService.updateCustomer(customerDTO);
        return new ResponseEntity(new APIResponse<>(
                200,
                "Job Updated Successfully",
                null
        ), HttpStatus.OK);
    }

    @GetMapping("getall")
    public ResponseEntity<APIResponse<List<CustomerDTO>>> getAllCustomer() {
        List<CustomerDTO> allCustomers = customerService.getAllCustomer();
        if (allCustomers.isEmpty()) {
            return new ResponseEntity<>(new APIResponse<>(
                    404,
                    "No Customers Found",
                    null
            ), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(new APIResponse<>(
                200,
                "Customers Retrieved Successfully",
                allCustomers
        ), HttpStatus.OK);
    }
}
