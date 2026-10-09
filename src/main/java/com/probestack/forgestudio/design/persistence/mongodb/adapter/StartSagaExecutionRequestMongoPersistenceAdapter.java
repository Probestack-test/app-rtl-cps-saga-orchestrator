package com.probestack.forgestudio.design.persistence.mongodb.adapter;

import com.probestack.forgestudio.design.domain.repository.StartSagaExecutionRequestDomainRepository;
import com.probestack.forgestudio.design.model.StartSagaExecutionRequest;
import com.probestack.forgestudio.design.persistence.mongodb.document.StartSagaExecutionRequestDocument;
import com.probestack.forgestudio.design.persistence.mongodb.repository.StartSagaExecutionRequestMongoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class StartSagaExecutionRequestMongoPersistenceAdapter implements StartSagaExecutionRequestDomainRepository {
    private final StartSagaExecutionRequestMongoRepository repository;

    public StartSagaExecutionRequestMongoPersistenceAdapter(
            StartSagaExecutionRequestMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public StartSagaExecutionRequest save(StartSagaExecutionRequest startSagaExecutionRequest) {
        StartSagaExecutionRequestDocument document = toDocument(startSagaExecutionRequest);
        return toDomain(repository.save(document));
    }

    @Override
    public Optional<StartSagaExecutionRequest> findById(String id) {
        return repository.findById(id).map(this::toDomain);
    }

    @Override
    public List<StartSagaExecutionRequest> findAll() {
        return repository.findAll().stream().map(this::toDomain).toList();
    }

    @Override
    public boolean existsById(String id) {
        return repository.existsById(id);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    @Override
    public long count() {
        return repository.count();
    }

    private StartSagaExecutionRequestDocument toDocument(
            StartSagaExecutionRequest startSagaExecutionRequest) {
        StartSagaExecutionRequestDocument document = new StartSagaExecutionRequestDocument();
        BeanUtils.copyProperties(startSagaExecutionRequest, document);
        return document;
    }

    private StartSagaExecutionRequest toDomain(StartSagaExecutionRequestDocument document) {
        StartSagaExecutionRequest domain = new StartSagaExecutionRequest();
        BeanUtils.copyProperties(document, domain);
        return domain;
    }
}
