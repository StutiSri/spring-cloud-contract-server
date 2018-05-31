package com.learn.springcloudcontractserver;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;

@JsonAutoDetect(fieldVisibility = ANY)
public class FraudCheckResponse {

    private final FraudStatus fraudCheckStatus;

    @JsonProperty("rejection.reason")
    private final String rejectionReason;

    public FraudCheckResponse(FraudStatus fraudCheckStatus, String rejectionReason) {

        this.fraudCheckStatus = fraudCheckStatus;
        this.rejectionReason = rejectionReason;
    }
}
