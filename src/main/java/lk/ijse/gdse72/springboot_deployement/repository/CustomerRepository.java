package lk.ijse.gdse72.springboot_deployement.repository;

import lk.ijse.gdse72.springboot_deployement.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
