package com.microservices.accounts.service;

import com.microservices.accounts.dto.CustomerDto;
import jakarta.validation.Valid;

public interface IAccountsService {
  /**
   * @param customerDto
   */
  void createAccount(CustomerDto customerDto);

  /**
   * @param mobileNumber
   * @return Accounts Details based on a given mobileNumber
   */
  CustomerDto fetchAccount(String mobileNumber);

  /**
   * @param customerDto
   * @return indicating if the update of Account details is successful or not
   */
  boolean updateAccount(@Valid CustomerDto customerDto);

  boolean deleteAccount(String mobileNumber);
}
