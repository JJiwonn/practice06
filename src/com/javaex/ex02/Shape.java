package com.javaex.ex02;

public class Shape {
	// 필드
	private String fillColor;
	private String lineColor;
	
	public Shape() {
		System.out.println("생성자 Shape (0)호출");
	}
	public Shape(String fillColor, String lineColor) {
	    this.fillColor = fillColor;
	    this.lineColor = lineColor;
	    System.out.println("생성자 Shape (2)호출");
	}
}

