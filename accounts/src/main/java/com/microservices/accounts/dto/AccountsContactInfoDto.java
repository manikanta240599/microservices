package com.microservices.accounts.dto;

import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "accounts")
@Getter
@Setter
public class AccountsContactInfoDto{
    String message;
    Map<String, String> contacDetails;
    List<String> onCallSupport;
}
