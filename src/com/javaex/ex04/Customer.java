package com.javaex.ex04;

public class Customer extends User { // User에게 받는 Customer
    // 필드
	private int point;
	
	// 생성자
	// 기본생성자
	public Customer() {
		
	}
	// id,password,name, point 설정하는 생성자
	public Customer(String id, String password, String name, int point) {
		// id,password,name은 부모의것이니까 부모먼저 초기화
		super (id,password, name);
		this.point = point;
	}
	// getters/ setters
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	@Override // User에서 이미 선언해줬기때문에 선언했던것을 무시하는 역할을 한다.
	public void showInfo() {
		System.out.println("#아이디: " + id +
				", #비밀번호: " + password +
				", #이름: " + name + // 직접 접근이 가능한 이유는 protected로 선언해줬기 때문이다.
				", #포인트: " + point);
	}
	

}
