package com.probestack.forgestudio.design.persistence.mongodb.repository;

import com.probestack.forgestudio.design.persistence.mongodb.document.CreateSagaRequestDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for CreateSagaRequest documents.
 */
public interface CreateSagaRequestMongoRepository extends MongoRepository<CreateSagaRequestDocument, String> {
}
