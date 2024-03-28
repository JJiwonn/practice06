package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		// User 클래스와 하위 클래스를 모두 담을 수 있는 배열
		User[] users = new User[3];
			
		User u01 = new Customer("jws","y1234", "정우성", 1000);
        User u02 = new Customer("yjs","y2345", "이효리", 2000);
        User u03 = new Employee("master","m7788", "운영자", 5_000_000);
        
        // 세 명의 사용자 배열에 등록
        // 참조 자료형의 배열은 참조객체의 주소가 할당되는 것이다.
        // 객체가 직접 들어가는 것은 아니다.
        users[0] = u01;
        users[1] = u02;
        users[2] = u03;
        
        for(int i = 0; i < users.length; i++) {
        	users[i].showInfo();
        }
        // 다운 캐스팅
        int salary = ((Employee)u03).getSalary();
        // get을 바로 사용할려고 했으나 불가능하다.
        //왜냐 salary 가 User에 들어가있기때문에 이때는 앞에 다운캐스팅을 해줘야 get을 사용할수있다.
        System.out.println("운영자의 월급은 " + salary + "원입니다.");
	}

}
