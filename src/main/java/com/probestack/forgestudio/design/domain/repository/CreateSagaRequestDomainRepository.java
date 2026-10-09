package com.probestack.forgestudio.design.domain.repository;

import com.probestack.forgestudio.design.model.CreateSagaRequest;
import java.util.List;
import java.util.Optional;

/**
 * Persistence-neutral repository port for CreateSagaRequest domain operations.
 */
public interface CreateSagaRequestDomainRepository {
    CreateSagaRequest save(CreateSagaRequest createSagaRequest);

    Optional<CreateSagaRequest> findById(String id);

    List<CreateSagaRequest> findAll();

    boolean existsById(String id);

    void deleteById(String id);

    long count();
}
