package org.example.rastreadorprecomoedas.proxies;

import org.example.rastreadorprecomoedas.exception.FeignErrorDecoder;
import org.example.rastreadorprecomoedas.models.CurrencyDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@FeignClient(name = "awesome-api", url = "${name.service.url}", configuration = FeignErrorDecoder.class)
public interface MoedaProxy {

    @GetMapping("last/{pair}")
    Map<String, CurrencyDTO> getCurrency(@PathVariable("pair") String moeda);
}
