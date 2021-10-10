package org.bogdanBoboaca;

import lombok.Data;

import javax.validation.constraints.Size;
import java.util.Random;

@Data
public class Patient {

    @Size(max = 5)
    String firstName;
    @Size(max = 4)
    String lastName;
    @Size(min = 0, max = 85)
    int age;
    String reason;

}
