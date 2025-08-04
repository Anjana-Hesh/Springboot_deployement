package lk.ijse.gdse72.springboot_deployement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customer")

public class CustomerController {

    @GetMapping
    public String getCustomer() {
        return "Customer data";
    }
}
