package com.javaex.ex05;

public class Depart extends Employee{

	 //필드 작성
	private String department;
	
	//생성자
	//기본 생성자
	public Depart() {
		
	}
    //name, salary, department의 생성자
	public Depart(String name, int salary, String department) {
		super(name,salary);
		this.department = department;
	}
	
	// getters/setters
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public void showInformation() {
		System.out.println("이름: " + super.getName() +
				" 연봉: " + super.getSalary() + 
				// name과 salary는 Employee에 있기에 부모의 것을 다운캐스팅해준다.
	            " 부서: " + department);
		super.showInformation(); // Employee에 대한 showInformation 작성
	}
}
