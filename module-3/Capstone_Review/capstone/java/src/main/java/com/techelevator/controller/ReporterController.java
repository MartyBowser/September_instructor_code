package com.techelevator.controller;

import com.techelevator.dao.ReporterDao;
import com.techelevator.model.AddressValidationResponse;
import com.techelevator.model.Reporter;
import com.techelevator.model.VerifyAddressDTO;
import com.techelevator.services.AddressValidationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class ReporterController {

    ReporterDao dao = null;

    public ReporterController(ReporterDao dao) {

        this.dao = dao;
    }

    @RequestMapping(path="/reporters", method = RequestMethod.GET)
    public List<Reporter> getReporters() {

        return dao.getReporters();

    }

    @RequestMapping(path="/reporters", method = RequestMethod.POST)
    public Reporter createReporter(@RequestBody Reporter reporter){
        return dao.createReporter(reporter);
    }

    @RequestMapping(path="/verifyAddress", method = RequestMethod.POST)
    public AddressValidationResponse verifyAddress(@RequestBody VerifyAddressDTO address){

        AddressValidationService service = new AddressValidationService();


        return service.verifyAddress(address.getCity(), address.getState(),
                address.getZip(),address.getAddressLines());

    }
}

