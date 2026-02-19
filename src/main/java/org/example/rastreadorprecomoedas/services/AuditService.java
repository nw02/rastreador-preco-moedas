package org.example.rastreadorprecomoedas.services;

import org.example.rastreadorprecomoedas.Repositories.AuditLogRepository;
import org.example.rastreadorprecomoedas.models.AuditLogDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditService {
    private final AuditLogRepository auditLogRepository;

    public AuditService(AuditLogRepository auditLogRepository) {
        this.auditLogRepository = auditLogRepository;
    }

    public List<AuditLogDTO> mostrarLogs(){
        return auditLogRepository.findAll();
    }
}
