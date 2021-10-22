package com.company;

public class PatientFactory {
    public PatientType getInstance(String type) {
        if (type.equals("Ward")) {
            return new WardPatient();
        } else {
            return new OPDPatient();
        }
    }
}
