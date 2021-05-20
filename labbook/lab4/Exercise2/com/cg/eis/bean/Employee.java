/**
 * 
 */
package com.capgemini.labbook.lab4.Exercise2.com.cg.eis.bean;

/**
 * @author DIBYENDU
 *
 */
public class Employee {
	protected int id;
	protected String name;
	protected int salary;
	protected String designation;
	protected String insuranceScheme;
	protected int nextId=0;
	public int getId() {
		return id;
	}
	public void setId() {
		this.id = ++nextId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	

}
