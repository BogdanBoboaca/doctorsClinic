package org.bogdanBoboaca;

import java.io.IOException;

public class Clinic {

    public void examine () throws IOException {

        PointB pointB = new PointB();
        pointB.generatePatients();

        PointD pointD = new PointD();
        pointD.storePatients();

        PointA pointA = new PointA();
        pointA.generateDoctors();

        PointE pointE = new PointE();
        pointE.storeDoctors();

        PointC pointC = new PointC();
        pointC.printDoctorsAndPatients();
        System.out.print("Summary of Patients" + pointC.summary());

    }

}
