package com.ntd.aritmetic.calculator.common.request;

import com.ntd.aritmetic.calculator.common.enums.OperationType;
import lombok.Data;

@Data
public class OperationRequest {
    private Double firstOperand;
    private Double secondOperand;
    private OperationType operationType;
}
