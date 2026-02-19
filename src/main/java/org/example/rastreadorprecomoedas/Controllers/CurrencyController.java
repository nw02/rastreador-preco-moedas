package org.example.rastreadorprecomoedas.Controllers;

import org.example.rastreadorprecomoedas.models.CurrencyDTO;
import org.example.rastreadorprecomoedas.services.CurrencyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {
    private final CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @GetMapping("preco/{moeda}")
    public CurrencyDTO buscarMoeda(@PathVariable("moeda") String moeda){
        return currencyService.getCurrencyPrice(moeda);
    }

}