package com.company;

public class Hospital {
    private static Hospital hospital = new Hospital();

    private Hospital() {
    }

    public static Hospital getInstance() {
        return hospital;
    }

    public void printMenu() {
        System.out.println("WELCOME TO HOSPITAL MANAGEMENT SYSTEM\n Select an option");
        System.out.println("1. Add Patient");
        System.out.println("2. Add Receptionist");
        System.out.println("3. Generate bills");
        System.out.println("4. Exit");
    }

    public void addPatient(String type) {
        PatientFactory patientFactory = new PatientFactory();
        PatientType patientType = patientFactory.getInstance(type);
        patientType.addPatient();
    }

    public void generateBill(String type) {
        BillGenerator billGenerator = new BillGenerator();
        if (type.equals("surgery")) {
            billGenerator.generateSurgeryBill();
        } else {
            billGenerator.generateCheckupBill();
        }
    }

    public void addReceptionist(String user, String pass){
        AddReceptionistProxy addReceptionistProxy = new AddReceptionistProxy(user,pass);
        addReceptionistProxy.addReceptionist();
    }
}
