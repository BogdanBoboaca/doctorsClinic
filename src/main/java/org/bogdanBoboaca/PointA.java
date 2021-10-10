package org.bogdanBoboaca;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PointA {

    public List generateDoctors(){
        String [] firstNames = {"Tom", "Bob", "Rob", "Rom", "Ali", "Ade", "Jon", "Ion"};
        String [] lastNames = {"Ad", "De", "Me", "Eu", "Tu", "We", "Us", "Re"};
        int [] ages = {35, 42, 45, 41, 49, 55, 59, 60};

        List doctors = new ArrayList<>();
        for (int i = 0; i<8; i++){
            Random r = new Random();
            int low = 1000;
            int high = 9999;
            int result = r.nextInt(high-low) + low;

            Doctor doctor = new Doctor();
            doctor.setIdentificationNumber(result);
            doctor.setFirstName(firstNames[i]);
            doctor.setLastName(lastNames[i]);
            doctor.setAge(ages[i]);

            doctors.add(doctor);
        }

        return doctors;
    }
}
