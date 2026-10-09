package com.probestack.forgestudio.design.persistence.mongodb.adapter;

import com.probestack.forgestudio.design.domain.repository.CreateSagaRequestDomainRepository;
import com.probestack.forgestudio.design.model.CreateSagaRequest;
import com.probestack.forgestudio.design.persistence.mongodb.document.CreateSagaRequestDocument;
import com.probestack.forgestudio.design.persistence.mongodb.repository.CreateSagaRequestMongoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class CreateSagaRequestMongoPersistenceAdapter implements CreateSagaRequestDomainRepository {
    private final CreateSagaRequestMongoRepository repository;

    public CreateSagaRequestMongoPersistenceAdapter(CreateSagaRequestMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public CreateSagaRequest save(CreateSagaRequest createSagaRequest) {
        CreateSagaRequestDocument document = toDocument(createSagaRequest);
        return toDomain(repository.save(document));
    }

    @Override
    public Optional<CreateSagaRequest> findById(String id) {
        return repository.findById(id).map(this::toDomain);
    }

    @Override
    public List<CreateSagaRequest> findAll() {
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

    private CreateSagaRequestDocument toDocument(CreateSagaRequest createSagaRequest) {
        CreateSagaRequestDocument document = new CreateSagaRequestDocument();
        BeanUtils.copyProperties(createSagaRequest, document);
        return document;
    }

    private CreateSagaRequest toDomain(CreateSagaRequestDocument document) {
        CreateSagaRequest domain = new CreateSagaRequest();
        BeanUtils.copyProperties(document, domain);
        return domain;
    }
}
