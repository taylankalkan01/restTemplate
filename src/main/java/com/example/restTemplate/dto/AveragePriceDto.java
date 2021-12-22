package com.example.restTemplate.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AveragePriceDto {
    private int mins;
    private BigDecimal price;
    private String symbol;


}
