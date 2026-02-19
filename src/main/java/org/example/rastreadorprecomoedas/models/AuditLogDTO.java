package org.example.rastreadorprecomoedas.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Table("TB_AUDITORIA")
public class AuditLogDTO {
    @Id
    private Long id;

    @Column("NOME_MOEDA")
    private String moeda;

    @Column("TEMPO_RESPOSTA")
    private long tempoResposta;

    @Column("DATA_CONSULTA")
    private LocalDateTime dataConsulta;

    private String valor;

    public String getValor() { return valor; }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public long getTempoResposta() {
        return tempoResposta;
    }

    public void setTempoResposta(long tempoResposta) {
        this.tempoResposta = tempoResposta;
    }

    public LocalDateTime getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDateTime dataConsulta) {
        this.dataConsulta = dataConsulta;
    }
}
