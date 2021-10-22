package com.company;

public class AddReceptionistProxy implements AddReceptionist {
    boolean isAdmin;
    AddReceptionistImplementation addReceptionistImplementation;

    public AddReceptionistProxy(String name, String password) {
        if (name.equals("Admin") && password.equals("123")) {
            isAdmin = true;
            addReceptionistImplementation = new AddReceptionistImplementation();
        }
    }

    @Override
    public void addReceptionist() {
        if (isAdmin) {
            addReceptionistImplementation.addReceptionist();
        } else {
            System.out.println("You can only add new receptionist as an Admin!");
        }
    }
}
