package com.learn.springcloudcontractserver;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;

@JsonAutoDetect(fieldVisibility = ANY)
public class FraudCheckRequest {
    @JsonProperty(value = "client.id")
    private String clientId;

    private int loanAmount;

    public int getLoanAmount() {
        return loanAmount;
    }
}
