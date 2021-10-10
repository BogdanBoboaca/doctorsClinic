package org.bogdanBoboaca;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PointE {

    public void storeDoctors() throws IOException {
        PointA pointA = new PointA();

        BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/bogdanboboaca/Programming/CursJava/finalProject/doctorsClinic/Doctors.txt"));
        writer.write(pointA.generateDoctors().toString());
        writer.close();
    }
}
