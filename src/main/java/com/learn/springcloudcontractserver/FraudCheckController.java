package com.learn.springcloudcontractserver;

import org.springframework.web.bind.annotation.*;

import static com.learn.springcloudcontractserver.RejectionReason.HIGH_LOAN_AMOUNT;
import static com.learn.springcloudcontractserver.RejectionReason.NO_REASON;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@RestController
public class FraudCheckController {
    @RequestMapping(value = "/fraudcheck", method = PUT)
    public FraudCheckResponse fraudCheck(@RequestBody FraudCheckRequest fraudCheckRequest){
        if(fraudCheckRequest.getLoanAmount() == 99999){
            return new FraudCheckResponse(FraudStatus.FRAUD, HIGH_LOAN_AMOUNT);
        }
        return new FraudCheckResponse(FraudStatus.OK, NO_REASON);
    }
}
