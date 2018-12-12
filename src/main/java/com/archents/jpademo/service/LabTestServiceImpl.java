package com.archents.jpademo.service;

import com.archents.jpademo.data.LabTest;
import com.archents.jpademo.repository.LabTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Godwin Stanislaus
 * @version 1.0
 * @date 12/7/18
 */
@Service
public class LabTestServiceImpl implements LabTestService {

    @Autowired
    LabTestRepository labTestRepository;

    public List<LabTest> getLabTests(){
        return labTestRepository.findAll();
    }

    public Optional<LabTest> findLabTestById(Long labTestId) {
        return labTestRepository.findById(labTestId);
    }

    public LabTest save(LabTest labTest){
        return labTestRepository.save(labTest);
    }

    public LabTest findLabTestByName(String name){
        return labTestRepository.findByName(name);
    }
}
