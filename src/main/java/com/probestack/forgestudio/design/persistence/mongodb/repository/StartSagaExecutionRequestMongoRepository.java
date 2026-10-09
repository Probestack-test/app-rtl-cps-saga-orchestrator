package com.probestack.forgestudio.design.persistence.mongodb.repository;

import com.probestack.forgestudio.design.persistence.mongodb.document.StartSagaExecutionRequestDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for StartSagaExecutionRequest documents.
 */
public interface StartSagaExecutionRequestMongoRepository extends MongoRepository<StartSagaExecutionRequestDocument, String> {
}
