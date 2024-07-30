package com.ntd.aritmetic.calculator.core.usecase;

import com.ntd.aritmetic.calculator.common.request.OperationRequest;
import com.ntd.aritmetic.calculator.common.response.OperationResult;

public interface OperationUseCase {
    OperationResult executeOperation(OperationRequest operationRequest);

    OperationResult randomString();
}
