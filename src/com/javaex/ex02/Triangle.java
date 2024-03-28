package com.javaex.ex02;

public class Triangle extends Shape{
	// 필드
	private int width;
	private int heigth;
	
	public Triangle() {
		super(); // 이 기본생성자를 넣어줘야하는데 안넣어줘서 자바가 자동으로 생성해줌
		System.out.println("생성자 Triangle (0)호출");
	}
	public Triangle(int width, int heigth) {
		super("검정", "검정");
	    this.width = width;
	    this.heigth = heigth;
	    System.out.println("생성자 Triangle (2)호출");
	}
	public Triangle(String fillColor, String lineColor, int width, int heigth) {
		super(fillColor, lineColor); // 부모인 Shape을 초기화해주는 코드
		this.width = width;
	    this.heigth = heigth;
	    System.out.println("생성자 Triangle (4)호출");	
	}
}


