package com.archents.jpademo.data;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Godwin Stanislaus
 * @version 1.0
 * @date 12/7/18
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "labtest")
public class LabTest implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String name;

}
