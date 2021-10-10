package org.bogdanBoboaca;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class PointB {

    public List generatePatients(){


        List patients = new ArrayList<>();
        for (int i = 0; i<100; i++){
            Patient patient = new Patient();
            Faker faker = new Faker();
            patient.setFirstName(faker.name().firstName());
            patient.setLastName(faker.name().lastName());
            patient.setAge(i);
            patient.setReason(faker.shakespeare().toString());

            patients.add(patient);

        }

        return patients;
    }
}
