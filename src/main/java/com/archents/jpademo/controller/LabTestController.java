package com.archents.jpademo.controller;

import com.archents.jpademo.service.LabTestService;
import com.archents.jpademo.data.LabTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

/**
 * @author Godwin Stanislaus
 * @version 1.0
 * @date 12/7/18
 */
@RestController
@RequestMapping(path = "/labtest")
public class LabTestController {

    @Autowired
    LabTestService labTestService;

    @GetMapping("/test")
    public String sayHello() {
        return "hello, welcome to Spring Boot!";
    }


    @RequestMapping( method = RequestMethod.GET, path="/findByName")
    public LabTest findByName(@RequestHeader (name = "testName") String testName){
        return labTestService.findLabTestByName(testName);
    }

    /**
     * returns all the LabTests as an array of JSON objects
     * @return List of LabTest
     */
    @GetMapping("/findAll")
    public List<LabTest> findAll(){
        return labTestService.getLabTests();
    }

    /**
     * retrieves a particular LabTest for the given labtest Id
     * @param labTestId
     * @return
     */
    @RequestMapping(method = RequestMethod.GET,
                    path = "/{labTestId}",
                    produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<LabTest> findById(@Valid @PathVariable Long labTestId) {
        return labTestService.findLabTestById(labTestId);
    }


    /**
     * Persist the lab test - Save or Update based on Id.
     * If Id is not set, new record is created else existing record is updated.
     * @param labTest
     * @return
     */
    @RequestMapping( method = RequestMethod.POST,
            path="/save",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public LabTest save(@RequestBody  LabTest labTest){
        System.out.println( labTest );
        return labTestService.save(labTest);
    }
}
