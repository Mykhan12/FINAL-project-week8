package com.company;

public class BillGenerator {
    private SurgeryBill surgeryBill;
    private CheckupBill checkupBill;

    public BillGenerator() {
        surgeryBill = new SurgeryBill();
        checkupBill = new CheckupBill();
    }

    public void generateSurgeryBill() {
        surgeryBill.generateBill();
    }

    public void generateCheckupBill() {
        checkupBill.generateBill();
    }
}
