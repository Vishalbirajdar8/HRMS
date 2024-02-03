package com.HRMS.HRMS.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Trainer {
	@Id
	private int id;
	private String training_employee;
	private int training_registration;
	private String training_name;
	private String training_type;
	private int training_year;
	private String training_description;

private int training_employeeid;
public int getTraining_employeeid() {
	return training_employeeid;
}
public void setTraining_employeeid(int training_employeeid) {
	this.training_employeeid = training_employeeid;
}
public String getTraining_employee() {
	return training_employee;
}
public void setTraining_employee(String training_employee) {
	this.training_employee = training_employee;
}
public int getTraining_registration() {
	return training_registration;
}
public void setTraining_registration(int training_registration) {
	this.training_registration = training_registration;
}
public String getTraining_name() {
	return training_name;
}
public void setTraining_name(String training_name) {
	this.training_name = training_name;
}
public String getTraining_type() {
	return training_type;
}
public void setTraining_type(String training_type) {
	this.training_type = training_type;
}
public int getTraining_year() {
	return training_year;
}
public void setTraining_year(int training_year) {
	this.training_year = training_year;
}
public String getTraining_description() {
	return training_description;
}
public void setTraining_description(String training_description) {
	this.training_description = training_description;
}
}

