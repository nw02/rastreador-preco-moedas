package org.example.rastreadorprecomoedas.Controllers;

import org.example.rastreadorprecomoedas.models.AuditLogDTO;
import org.example.rastreadorprecomoedas.services.AuditService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuditController {
    private final AuditService auditService;

    public AuditController(AuditService auditService) {
        this.auditService = auditService;
    }

    @GetMapping
    public List<AuditLogDTO> mostrarLogs(){
        return auditService.mostrarLogs();
    }
}
