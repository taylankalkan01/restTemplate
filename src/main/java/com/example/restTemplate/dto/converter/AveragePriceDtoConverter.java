package com.example.restTemplate.dto.converter;

import com.example.restTemplate.dto.AveragePriceDto;
import com.example.restTemplate.model.AveragePrice;
import org.springframework.stereotype.Component;

@Component
public class AveragePriceDtoConverter {
    public AveragePriceDto convert(AveragePrice from){
        return new AveragePriceDto(from.getMins(), from.getPrice(), from.getSymbol());
    }

}
