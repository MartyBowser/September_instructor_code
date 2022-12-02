package com.techelevator.model;

public class AddressValidationResponse {

    private AddressValidationResult result;
    private String responseId;

    public AddressValidationResult getResult() {
        return result;
    }

    public void setResult(AddressValidationResult result) {
        this.result = result;
    }

    public String getResponseId() {
        return responseId;
    }

    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }
}
