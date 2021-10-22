package com.company;

public class WardPatient implements PatientType{
    @Override
    public void addPatient() {
        System.out.println("Ward patient has been added successfully! Thank you!");
    }
}
