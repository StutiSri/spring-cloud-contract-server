package com.example.fraud;

import com.learn.springcloudcontractserver.FraudCheckController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.*;

public class FraudBase {
    @Before
    public void setup() {
        standaloneSetup(new FraudCheckController());
    }

    public void assertThatRejectionReasonIsNull(Object rejectionReason) {
        assert rejectionReason == null;
    }

}
