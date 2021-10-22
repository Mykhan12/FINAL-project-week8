package com.company;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testing {

    @Test
    public void singletonPatternTest() {
        Hospital hospital = Hospital.getInstance();
        Hospital hospital1 = Hospital.getInstance();

        assertEquals(hospital, hospital1);
    }

    @Test
    public void factoryPatternTest() {
        boolean answer;
        PatientFactory factory = new PatientFactory();
        PatientType patient = factory.getInstance("Ward");
        if (patient instanceof WardPatient) {
            answer = true;
        } else
            answer = false;

        assertEquals(true, answer);
    }


}