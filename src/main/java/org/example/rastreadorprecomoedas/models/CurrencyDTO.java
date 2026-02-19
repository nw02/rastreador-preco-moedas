package org.example.rastreadorprecomoedas.models;

public class CurrencyDTO {
    private String code;
    private String bid;
    private String create_date;

    public String getBid() {
        return bid;
    }

    public String getCode() {
        return code;
    }

    public String getCreate_date() {
        return create_date;
    }
}
