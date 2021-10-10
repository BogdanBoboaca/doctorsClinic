package org.bogdanBoboaca;

public class Clinic {

    private void examine () {

        PointB pointB = new PointB();
        pointB.generatePatients();

        PointA pointA = new PointA();
        pointA.generateDoctors();
    }


}
