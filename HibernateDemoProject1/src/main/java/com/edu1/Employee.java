package com.edu1;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employee {
	@Id
	private int Empid;
	private String Empname;
	private float Empsalary;
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public float getEmpsalary() {
		return Empsalary;
	}
	public void setEmpsalary(float empsalary) {
		Empsalary = empsalary;
	}
	@Override
	public String toString() {
		return "Employee [Empid=" + Empid + ", Empname=" + Empname + ", Empsalary=" + Empsalary + "]";
	}
	
}
