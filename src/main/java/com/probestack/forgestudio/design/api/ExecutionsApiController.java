package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.CancelSagaExecutionRequest;
import com.probestack.forgestudio.design.model.SagaExecution;
import com.probestack.forgestudio.design.model.StartSagaExecutionRequest;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.validation.constraints.*;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.ExecutionsService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-09T10:08:57.456057167Z[GMT]")
@Controller
@RequestMapping("${openapi.sagaOrchestrator.base-path:/v1}")
public class ExecutionsApiController implements ExecutionsApi {

    private static final Logger log = LoggerFactory.getLogger(ExecutionsApiController.class);

    private final ExecutionsService executionsService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public ExecutionsApiController(ExecutionsService executionsService, GeneratedRequestValidator generatedRequestValidator) {
        this.executionsService = executionsService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<SagaExecution> cancelSagaExecution(@PathVariable() UUID executionId, @RequestBody() CancelSagaExecutionRequest cancelSagaExecutionRequest) {
        log.info("Processing cancelSagaExecution request");
        try {
            generatedRequestValidator.validate("cancelSagaExecution", cancelSagaExecutionRequest);
            var response = executionsService.cancelSagaExecution(executionId, cancelSagaExecutionRequest);
            log.info("cancelSagaExecution completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process cancelSagaExecution: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<SagaExecution> getSagaExecution(@PathVariable() UUID executionId, @RequestParam(value = "includeStepOutputs", required = false, defaultValue = "true") Boolean includeStepOutputs) {
        log.info("Processing getSagaExecution request");
        try {
            var response = executionsService.getSagaExecution(executionId, includeStepOutputs);
            log.info("getSagaExecution completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process getSagaExecution: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<SagaExecution> startSagaExecution(@RequestBody() StartSagaExecutionRequest startSagaExecutionRequest) {
        log.info("Processing startSagaExecution request");
        try {
            generatedRequestValidator.validate("startSagaExecution", startSagaExecutionRequest);
            var response = executionsService.startSagaExecution(startSagaExecutionRequest);
            log.info("startSagaExecution completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process startSagaExecution: {}", e.getMessage(), e);
            throw e;
        }
    }
}
