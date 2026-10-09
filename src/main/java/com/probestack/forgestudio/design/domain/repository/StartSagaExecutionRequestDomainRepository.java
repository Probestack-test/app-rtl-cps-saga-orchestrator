package com.probestack.forgestudio.design.domain.repository;

import com.probestack.forgestudio.design.model.StartSagaExecutionRequest;
import java.util.List;
import java.util.Optional;

/**
 * Persistence-neutral repository port for StartSagaExecutionRequest domain operations.
 */
public interface StartSagaExecutionRequestDomainRepository {
    StartSagaExecutionRequest save(StartSagaExecutionRequest startSagaExecutionRequest);

    Optional<StartSagaExecutionRequest> findById(String id);

    List<StartSagaExecutionRequest> findAll();

    boolean existsById(String id);

    void deleteById(String id);

    long count();
}
