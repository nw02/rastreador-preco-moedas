package org.example.rastreadorprecomoedas.Repositories;

import org.example.rastreadorprecomoedas.models.AuditLogDTO;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AuditLogRepository extends CrudRepository<AuditLogDTO,Long> {
    List<AuditLogDTO> findAll();
}
