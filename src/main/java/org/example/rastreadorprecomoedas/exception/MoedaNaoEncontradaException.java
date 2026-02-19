package org.example.rastreadorprecomoedas.exception;

public class MoedaNaoEncontradaException extends RuntimeException{
    public MoedaNaoEncontradaException(String message){
        super(message);
    }
}
