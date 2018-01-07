//부모클래스(Super Class-상위클래스)
class Human{
	String name;
	int age;
	
	public Human(){
		this("홍길동", 22);
	}
	//인자생성자
	public Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void getInfo(){
		System.out.println("이름 :"+name+"\n나이 :"+age);	
	}
}

// super(변수): 부모클래스의 객체를 의미 super.변수 --> 부모클래스의 변수를 접근
// this : 자신의 객체를 의미 this.변수 ---> 자신클래스의 변수를 접근
// super() 메소드 : 부모클래스(super class)의 생성자를 호출하기위한 메서드
// this() 메소드 : 자신의 생성자를 호출하기위한 메서드

// super(): 생성자안에서만 호출할 수 있다. 항상 생성자의 첫줄에 와야한다.
// static 메소드 안에서는 사용할 수 없다.
// 유저가 생성자를 작성하지 않은경우에는 하위클래스의 생성자에서 자바컴파일러가 자동으로 호출한다. 

//자식클래스(subClass - 하위클래스)
class Employee extends Human{
	
	int salary;
//	public Employee(){
//		super();
//	}
	public Employee(String name, int age, int salary){
		super(name, age);
		this.salary = salary;
	}
	
	
	//메소드 오버라이딩(Overridding) : 재정의
	
	//호출하고자 하는 메소드는 부모클래스에 존재
	//메소드명은 동일해야한다
	//매개변수와 타입이 같고
	//반환타입도 같다.
	//접근제어자는 부모클래스보다 넓거나 같다
	//수행할 명령은 달라야 한다.
	
	public void getInfo(){
		System.out.println("이름 :"+name+"\n나이 :"+age+"\n월급 :"+salary);
	}
	
}
//자식클래스(subClass - 하위클래스)
class Student1 extends Human{
	
}

public class InheritanceEx {
	public static void main(String[] args) {
		 Employee em = new Employee("강호동", 40, 500);
		 em.getInfo();
		 
		 Student1 stu = new Student1();
		 stu.getInfo();
	
	}

}
