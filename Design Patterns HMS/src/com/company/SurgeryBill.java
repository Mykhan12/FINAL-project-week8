package com.company;

public class SurgeryBill implements Bill{
    @Override
    public void generateBill() {
        System.out.println("Your surgery bill has been generated!");
    }
}
