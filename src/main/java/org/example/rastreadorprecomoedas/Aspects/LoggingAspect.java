package org.example.rastreadorprecomoedas.Aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.example.rastreadorprecomoedas.Repositories.AuditLogRepository;
import org.example.rastreadorprecomoedas.models.AuditLogDTO;
import org.example.rastreadorprecomoedas.models.CurrencyDTO;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
    private final AuditLogRepository auditLogRepository;

    public LoggingAspect(AuditLogRepository auditLogRepository) {
        this.auditLogRepository = auditLogRepository;
    }

    @Around("@annotation(LogExecutionTime)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable{
        long inicio = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long fim = System.currentTimeMillis();
        logger.info("Time to execute: "+ (fim - inicio)+ "ms");

        if(result instanceof CurrencyDTO dto){
            AuditLogDTO audit = new AuditLogDTO();
            audit.setMoeda(dto.getCode()); // nome da moeda
            audit.setValor(dto.getBid()); // valor da moeda
            audit.setTempoResposta(fim - inicio);
            audit.setDataConsulta(LocalDateTime.now());
            auditLogRepository.save(audit);
        }
        return result;
    }
}
