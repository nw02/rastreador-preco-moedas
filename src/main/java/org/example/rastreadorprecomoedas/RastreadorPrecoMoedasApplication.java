package org.example.rastreadorprecomoedas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableFeignClients(basePackages = "org.example.rastreadorprecomoedas")
@EnableAspectJAutoProxy
public class RastreadorPrecoMoedasApplication {

    public static void main(String[] args) {
        SpringApplication.run(RastreadorPrecoMoedasApplication.class, args);
    }

}
