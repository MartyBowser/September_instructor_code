package com.techelevator.model;

public class AddressValidationRequest {

    private Address address;
    private boolean enableUspsCass;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean isEnableUspsCass() {
        return enableUspsCass;
    }

    public void setEnableUspsCass(boolean enableUspsCass) {
        this.enableUspsCass = enableUspsCass;
    }
}
