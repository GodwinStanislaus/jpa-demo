package com.archents.jpademo.service;

import com.archents.jpademo.data.LabTest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Godwin Stanislaus
 * @version 1.0
 * @date 12/7/18
 */
@Service
public interface LabTestService {
    List<LabTest> getLabTests();
    Optional<LabTest> findLabTestById(Long id);
    LabTest save(LabTest labTest);
    LabTest findLabTestByName(String name);
}