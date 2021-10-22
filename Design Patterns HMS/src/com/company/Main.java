package com.company;

import java.util.Scanner;

//Singleton ✅
//Factory ✅
//Proxy ✅
//Facade ✅

public class Main {

    public static void main(String[] args) {
        Hospital hospital = Hospital.getInstance();
        int option = 0;
        Scanner sc = new Scanner(System.in);
        String input = "";
        while (option != 4) {
            hospital.printMenu();
            input = sc.nextLine();
            option = Integer.parseInt(input);
            if (option == 1) {
                //Add patient
                System.out.println("Select patient:");
                System.out.println("1. Ward patient");
                System.out.println("2. OPD patient");
                input = sc.nextLine();
                int selection = Integer.parseInt(input);
                if (selection == 1) {
                    hospital.addPatient("Ward");
                } else {
                    hospital.addPatient("OPD");
                }
            }
            if (option == 2) {
                //Add receptionist
                System.out.println("Want to login as as Admin ?");
                System.out.println("1. Yes\n2. No");

                input = sc.nextLine();
                int selection = Integer.parseInt(input);
                if (selection == 1) {
                    System.out.print("Enter name: ");
                    String user = sc.nextLine();
                    System.out.print("Enter password: ");
                    String pass = sc.nextLine();
                    hospital.addReceptionist(user, pass);
                } else {
                    hospital.addReceptionist("user", "123");
                }
            }
            if (option == 3) {
                //generate bills
                System.out.println("Which bill ?");
                System.out.println("1. Surgery bill");
                System.out.println("2. Checkup bill");
                input = sc.nextLine();
                int selection = Integer.parseInt(input);
                if (selection == 1) {
                    hospital.generateBill("surgery");
                } else {
                    hospital.generateBill("checkup");
                }
            }
        }

    }
}
