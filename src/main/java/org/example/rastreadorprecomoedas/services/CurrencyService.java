package org.example.rastreadorprecomoedas.services;

import org.example.rastreadorprecomoedas.models.CurrencyDTO;
import org.example.rastreadorprecomoedas.Aspects.LogExecutionTime;
import org.example.rastreadorprecomoedas.proxies.MoedaProxy;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CurrencyService {
    private final MoedaProxy moedaProxy;

    public CurrencyService(MoedaProxy moedaProxy) {
        this.moedaProxy = moedaProxy;
    }

    @LogExecutionTime
    public CurrencyDTO getCurrencyPrice (String moeda){
        Map<String, CurrencyDTO> response= moedaProxy.getCurrency(moeda+"-BRL");
        String key = moeda.toUpperCase() + "BRL";
        CurrencyDTO result = response.get(key);
        return result;
    }
}
