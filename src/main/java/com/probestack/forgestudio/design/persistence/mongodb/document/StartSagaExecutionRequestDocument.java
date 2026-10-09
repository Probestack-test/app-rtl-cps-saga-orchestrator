package com.probestack.forgestudio.design.persistence.mongodb.document;

import com.probestack.forgestudio.design.model.StartSagaExecutionRequest;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(
        collection = "saga_orchestrator_executions"
)
public class StartSagaExecutionRequestDocument extends StartSagaExecutionRequest {
    @Id
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
