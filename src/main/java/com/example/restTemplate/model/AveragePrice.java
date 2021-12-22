package com.example.restTemplate.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AveragePrice {
    private int mins;
    private BigDecimal price;
    private String symbol;
}
