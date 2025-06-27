package com.microservices.accounts.dto;

import com.microservices.accounts.entity.Customer;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.io.Serializable;
import lombok.Data;

/** DTO for {@link Customer} */
@Data
public class CustomerDto implements Serializable {
  @Schema(description = "Name of the customer", example = "Mani")
  @Size(message = "The length of the customer name should be between 5 and 30", min = 5, max = 30)
  @NotEmpty(message = "Name can not be a null or empty")
  private String name;

  @Schema(description = "Email address of the customer", example = "mani@gmail.com")
  @NotEmpty(message = "Email address can not be a null or empty")
  @Email(message = "Email address should be a valid value")
  @Email
  private String email;

  @Schema(description = "Mobile Number of the customer", example = "9345432123")
  @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
  private String mobileNumber;

  private AccountsDto accountsDto;
}
