/**
 * 
 */
package com.capgemini.dailyassignments.day8.PolymorphisomCaseStudy1;

/**
 * @author DIBYENDU
 *
 */
public class Academic extends Payroll{
	private String name;
    private int salary;

    Academic() {}

    public Academic(String name, int salary) {
        this.name = name;
        this.salary = salary;
        super.adjustSalary(salary);
    }

    public void giveLecture() {
        System.out.println("Giving lecture");
    }

}
