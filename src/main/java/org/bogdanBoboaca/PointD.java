package org.bogdanBoboaca;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PointD {

    public void storePatients() throws IOException {
        PointB pointB = new PointB();

        BufferedWriter writer = new BufferedWriter(
                new FileWriter("/Users/bogdanboboaca/Programming/CursJava/finalProject/doctorsClinic/Patients.txt"));
        writer.write(pointB.generatePatients().toString());
        writer.close();
    }
}
