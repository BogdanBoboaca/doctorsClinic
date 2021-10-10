package org.bogdanBoboaca;

import java.util.ArrayList;
import java.util.List;

public class PointC {

    public void printDoctorsAndPatients(){

        PointA pointA = new PointA();
        pointA.generateDoctors();
        System.out.println("Available Doctors" + pointA.generateDoctors());

        PointB pointB = new PointB();
        pointB.generatePatients();
        System.out.println("Available Patients" + pointB.generatePatients());


    }

    public String summary() {

        int childrenCounter = 0;
        int pupilCounter = 0;
        int studentCounter = 0;
        int adultsCounter = 0;

        PointB pointB = new PointB();
        List<Patient> patients = pointB.generatePatients();
        for (Patient patient : patients) {
            if (patient.getAge() <= 1) {
                childrenCounter++;
            } else if (patient.getAge() > 1 && patient.getAge() < 8) {
                pupilCounter++;
            } else if (patient.getAge() >= 8 && patient.getAge() < 19) {
                studentCounter++;
            } else if (patient.getAge() > 18) {
                adultsCounter++;
            }
        }

        return "\r\n" + "Children (" + childrenCounter + ")" + "\r\n" +
                "Pupil (" + pupilCounter + ")" + "\r\n" +
                "Student (" + studentCounter + ")" + "\r\n" +
                "Adult (" + adultsCounter + ")";

    }
}
