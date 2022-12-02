package com.techelevator.model;

public class AddressValidationResultVerdict {

    private boolean addressComplete;
    private boolean hasInferredComponents;
    private boolean hasUnconfirmedComponents;

    public boolean isAddressComplete() {
        return addressComplete;
    }

    public void setAddressComplete(boolean addressComplete) {
        this.addressComplete = addressComplete;
    }

    public boolean isHasInferredComponents() {
        return hasInferredComponents;
    }

    public void setHasInferredComponents(boolean hasInferredComponents) {
        this.hasInferredComponents = hasInferredComponents;
    }

    public boolean isHasUnconfirmedComponents() {
        return hasUnconfirmedComponents;
    }

    public void setHasUnconfirmedComponents(boolean hasUnconfirmedComponents) {
        this.hasUnconfirmedComponents = hasUnconfirmedComponents;
    }
}
