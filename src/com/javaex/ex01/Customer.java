package com.javaex.ex01;

public class Customer extends Person{
	// 필드 
	private int cNo;
	private int point; // name이랑 hp는 Person에게 상속받았기에 작성해줄필요없음

	// 생성자
	public Customer() {
		System.out.println("Customer 생성자(0) 호출");
	}
	
	public Customer(String name, String hp,
			int cNo, int point) {
		// name과 hp는 Customer의 생성자가 아니고 부모인 Person의 것이기에 불러준다.
		super(name, hp);
		this.cNo = cNo;
		this.point = point;
		System.out.println("Customer 생성자(4) 호출");
	}
	
	// getters/ setters
	public int getcNo(){
	     return cNo;	
	}
	public void setcNo(int cNo) {
		this.cNo = cNo;
	}
	public int getPoint(){
	     return point;	
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	public void showInfo() {
		System.out.println("#이름: " + super.getName()+
		", #핸드폰: "+ super.getHp()+
		", #고객번호: "+ this.cNo +
		", #포인트 점수: "+ this.point);
	}
	
}
