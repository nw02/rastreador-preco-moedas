package org.example.rastreadorprecomoedas.exception;

import feign.Response;
import feign.codec.ErrorDecoder;

public class FeignErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String methodKey, Response response){
        switch (response.status()){
            case 404:
                return new MoedaNaoEncontradaException("A moeda informada não foi encontrada na AwesomeAPI");
            case 400:
                return new MoedaNaoEncontradaException("Requisição inválida. Verifique o código da moeda");
            default:
                return new ErrorDecoder.Default().decode(methodKey, response);
        }
    }
}
