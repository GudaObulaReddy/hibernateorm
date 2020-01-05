package com.hibernateorm;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("HE")
public class HEmployee extends Employee
{
private int wh;

public HEmployee() {
	super();
}


public HEmployee(int id, String name, String email, int salary, int wh) {
	super(id, name, email, salary);
	this.wh = wh;
}


public int getWh() {
	return wh;
}

public void setWh(int wh) {
	this.wh = wh;
}

}
