package com.example.loans;

import com.example.loans.dto.LoansContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableConfigurationProperties(value = {LoansContactInfoDto.class})
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
    info =
        @Info(
            title = "Loans microservice REST API Documentation",
            description = "Loans microservice REST API Documentation",
            version = "v1",
            contact = @Contact(name = "Mani", email = "mani@gmail.com", url = "https://localhost"),
            license = @License(name = "Apache 2.0", url = "https://localhost")),
    externalDocs =
        @ExternalDocumentation(
            description = "Cards microservice REST API Documentation",
            url = "http://localhost:8080/swagger-ui/index.html#/"))
public class LoansApplication {

  public static void main(String[] args) {
    SpringApplication.run(LoansApplication.class, args);
  }
}
