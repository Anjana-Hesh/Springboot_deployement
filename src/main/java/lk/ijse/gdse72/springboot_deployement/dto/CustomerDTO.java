package lk.ijse.gdse72.springboot_deployement.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CustomerDTO {

    private Long id;

    private String name;

    private String address;

    private Integer phoneNumber;

}
