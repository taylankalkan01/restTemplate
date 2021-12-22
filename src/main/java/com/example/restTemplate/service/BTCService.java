package com.example.restTemplate.service;

import com.example.restTemplate.dto.AveragePriceDto;
import com.example.restTemplate.dto.converter.AveragePriceDtoConverter;
import com.example.restTemplate.model.AveragePrice;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BTCService {

    private final RestTemplate restTemplate;
    private final AveragePriceDtoConverter averagePriceDtoConverter;

    public BTCService(RestTemplate restTemplate, AveragePriceDtoConverter averagePriceDtoConverter) {
        this.restTemplate = restTemplate;
        this.averagePriceDtoConverter = averagePriceDtoConverter;
    }

    public AveragePriceDto getAveragePrice(String symbol){
        AveragePrice averagePrice = restTemplate.getForObject("https://api.binance.com/api/v3/avgPrice?symbol="+symbol, AveragePrice.class);
        averagePrice.setSymbol(symbol);
        return averagePriceDtoConverter.convert(averagePrice);
    }
}
