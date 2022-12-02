package com.techelevator.services;

import com.techelevator.model.Address;
import com.techelevator.model.AddressValidationRequest;
import com.techelevator.model.AddressValidationResponse;
import com.techelevator.model.AddressValidationResult;
import org.springframework.web.client.RestTemplate;

public class AddressValidationService {

    private RestTemplate restTemplate = new RestTemplate();
    private static final String URL = "https://addressvalidation.googleapis.com/v1:validateAddress?key=AIzaSyATmnIBWRAd39cfy1AIebH50NlDT0Qchvk";

    public AddressValidationResponse verifyAddress(String city, String state, String zip, String[] addressLines){

        Address address = new Address();
        address.setRegionCode("US");
        address.setLocality(city);
        address.setAdministrativeArea(state);
        address.setPostalCode(zip);
        address.setAddressLines( addressLines);

        AddressValidationRequest request = new AddressValidationRequest();
        request.setAddress(address);
        request.setEnableUspsCass(true);

        AddressValidationResponse response = restTemplate.postForObject(URL, request, AddressValidationResponse.class);
        return response;

    }
}
