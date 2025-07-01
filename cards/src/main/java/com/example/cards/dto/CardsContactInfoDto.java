package com.example.cards.dto;

import java.util.List;
import java.util.Map;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "cards")
public record CardsContactInfoDto(String message, Map<String,String> contacDetails, List<String> onCallSupport) {}
