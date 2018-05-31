package contracts;

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method'PUT'
        url '/fraudcheck'
        body([
                "client.id": $(regex('[0-9]{10}')),
                loanAmount: 99999
        ])
        headers {
            contentType 'application/json'
        }
    }
    response {
        status 200
        body([
                fraudCheckStatus: "FRAUD",
                "rejection.reason": "Loan amount too high."
        ])
        headers {
            contentType('application/json')
        }
    }
}