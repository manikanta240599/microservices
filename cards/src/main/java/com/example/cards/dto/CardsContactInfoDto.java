package com.example.cards.dto;

import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "cards")
@Getter
@Setter
public class CardsContactInfoDto {
    private String message;
    private Map<String,String> contacDetails;
    private List<String> onCallSupport;
}
