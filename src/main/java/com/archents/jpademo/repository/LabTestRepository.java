package com.archents.jpademo.repository;

import com.archents.jpademo.data.LabTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @author Godwin Stanislaus
 * @version 1.0
 * @date 12/7/18
 */
@Repository
public interface LabTestRepository extends JpaRepository<LabTest, Long> {

    @Query("select l from LabTest l where l.name = ?1")
    LabTest findByName(String name);

}
