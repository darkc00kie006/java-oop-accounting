package com.cjc.accounting;

import com.vsm.enroller.Person;//import person ni metlop

public class Accountant extends Person { //extend person metlop
    private String employeeID;

    public Accountant(String employeeID, String name, Gender gender) { //gn call ang GENDER from person class ni metlop
        super(name, gender, 11, 11, 2002); //disregard other values sng constructor ni metlop.... inh
        this.employeeID = employeeID;
    }

    public void manageAccounts() {
        System.out.println("\n" + getName() + " is managing the school's accounts.");
    }
    										//nag butang getters
    public String getEmployeeID() {
        return employeeID;
    }

	@Override
	public void showRole() {
		// TODO Auto-generated method stub
		
	}
}
