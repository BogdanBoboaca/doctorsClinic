package org.bogdanBoboaca;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PointB {

    public List generatePatients() {

        String[] reason = {"Consultation", "Prescription", "Treatment"};
        Random random = new Random();
        Random random1 = new Random();


        List patients = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int index = random.nextInt(reason.length);
            int age = 85;
            int randomAge = random1.nextInt(age) + 1;

            Patient patient = new Patient();
            Faker faker = new Faker();
            String firstName = faker.name().firstName();
            if (firstName.length() > 5){
                patient.setFirstName(firstName.substring(0,5));
            }else {
                patient.setFirstName(firstName);
            }
            String lastName = faker.name().lastName();
            if (lastName.length() > 4){
                patient.setLastName(lastName.substring(0,4));
            }else {
                patient.setLastName(lastName);
            }
            patient.setAge(randomAge);
            patient.setReason(reason[index]);

            patients.add(patient);

        }

        return patients;
    }
}
