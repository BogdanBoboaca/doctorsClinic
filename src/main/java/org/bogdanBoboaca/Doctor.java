package org.bogdanBoboaca;

import lombok.Data;
//import org.springframework.data.annotation.Id;

import javax.persistence.Id;
import javax.validation.constraints.Size;

@Data
public class Doctor {

    @Id
    int identificationNumber;
    @Size(min=3, max=3)
    String firstName;
    @Size(min=2, max=2)
    String lastName;
    @Size(min=30, max=65)
    int age;
    boolean inConsultation;
    @Size(max=7)
    int timeWorked;



}
