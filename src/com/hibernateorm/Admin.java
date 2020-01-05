package com.hibernateorm;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("AD")
public class Admin extends Employee 
{
private String branchname;

public Admin() {
	super();
}

public Admin(int id, String name, String email, int salary, String branchname) {
	super(id, name, email, salary);
	this.branchname = branchname;
}

public String getBranchname()
{
	return branchname;
}
public void setBranchname(String branchname)
{
	this.branchname = branchname;
}

}
