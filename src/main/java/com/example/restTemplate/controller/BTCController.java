package com.example.restTemplate.controller;

import com.example.restTemplate.dto.AveragePriceDto;
import com.example.restTemplate.service.BTCService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/btc")
public class BTCController {
    private final BTCService btcService;

    public BTCController(BTCService btcService) {
        this.btcService = btcService;
    }

    @GetMapping("/averagePrice/{symbol}")
    public ResponseEntity<AveragePriceDto> getAveragePrice(@PathVariable String symbol){
        return ResponseEntity.ok(btcService.getAveragePrice(symbol));
    }
}
