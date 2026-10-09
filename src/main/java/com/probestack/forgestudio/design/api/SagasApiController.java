package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.CreateSagaRequest;
import com.probestack.forgestudio.design.model.Saga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.validation.constraints.*;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.SagasService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-09T10:08:57.456057167Z[GMT]")
@Controller
@RequestMapping("${openapi.sagaOrchestrator.base-path:/v1}")
public class SagasApiController implements SagasApi {

    private static final Logger log = LoggerFactory.getLogger(SagasApiController.class);

    private final SagasService sagasService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public SagasApiController(SagasService sagasService, GeneratedRequestValidator generatedRequestValidator) {
        this.sagasService = sagasService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<Saga> createSaga(@RequestBody() CreateSagaRequest createSagaRequest) {
        log.info("Processing createSaga request");
        try {
            generatedRequestValidator.validate("createSaga", createSagaRequest);
            var response = sagasService.createSaga(createSagaRequest);
            log.info("createSaga completed successfully");
            return ResponseEntity.status(HttpStatus.CREATED).body(response.getBody());
        } catch (Exception e) {
            log.error("Failed to process createSaga: {}", e.getMessage(), e);
            throw e;
        }
    }
}
