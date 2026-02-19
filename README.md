**Rastreador de Preço de Moedas (AwesomeAPI)**

Esta é uma API REST desenvolvida com **Spring Boot** para consulta de cotações de moedas, utilizando a AwesomeAPI. O projeto foca em **Programação Orientada a Aspectos (AOP)** para monitoramento de performance utilizando logs.
**Tecnologias Utilizadas:**

    Java 21

    Spring Boot

    Spring Cloud OpenFeign

    Spring Data JDBC

    H2 Database

    Spring AOP

    Maven

🛠️ **Destaques Técnicos**

**1. Programação Orientada a Aspectos (Spring AOP)**

Utilizei Aspectos para criar uma auditoria transparente. Através da anotação @LogExecutionTime, o sistema consegue:

    Calcular o tempo exato de resposta da API externa.

    Salvar automaticamente os logs no banco de dados (Moeda, Valor, Tempo de Resposta e Data).

**2. Comunicação Declarativa com OpenFeign**

Em vez de usar RestTemplate, usei o OpenFeign para fazer as requisições à AwesomeAPI. Isso torna o código mais limpo e fácil de manter.

**3. Tratamento de Erros**

Implementei um ErrorDecoder customizado para o Feign. Isso permite que a aplicação entenda erros específicos da API externa:

    **Erro 404: Mapeado para uma MoedaNaoEncontradaException com mensagem.**

    **Erro 400: Capturado para tratar requisições de códigos de moeda inválidos.**

**Como Executar o Projeto**

Clonar o repositório:
```Bash

git clone https://github.com/seu-usuario/rastreador-preco-moedas.git
```

Executar a aplicação:
```Bash
./mvnw spring-boot:run
```


🗺️ **Exemplos de Endpoints**

Consultar Preço de Moeda

GET /preco/{moeda}

    Exemplo: GET /preco/USD

Resposta:
```JSON

{
  "code": "USD",
  "bid": "4.95",
  "create_date": "2026-02-18 21:42:00"
}
```

Visualizar Logs de Auditoria (AOP)

```GET /

(Retorna todos os logs de execução e performance salvos).
```
