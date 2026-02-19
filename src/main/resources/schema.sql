create table tb_auditoria(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome_moeda varchar(10) NOT NULL,
    tempo_resposta BIGINT NOT NULL,
    data_consulta TIMESTAMP NOT NULL,
    valor VARCHAR(20) NOT NULL
);