
// 클래스 : 속성(멤버변수) + 기능
public class Car {
	int number;
	int speed;
	String color;
	
	public void speedUp(){
		speed +=10;
	}
	
	public void speedDown(){
		speed -=5;
	}	
	
	public static void main(String [] args){
		
		Car myCar = new Car(); //클래스를 객체화 할때는 -->클래스명 참조변수 = new 클래스명();
		Car yourCar = new Car();
		myCar.number = 1;
		myCar.speed=10;
		myCar.color = "Black";
		
		System.out.println("myCar의 speed: " +myCar.speed);
		myCar.speedUp();
		System.out.println(myCar.speed);
		System.out.println(myCar.number);
		System.out.println(myCar.color);
		
		yourCar.speed=50;
		System.out.println("yourCar 의 speed: "+yourCar.speed);
		yourCar.speedUp();
		yourCar.speedDown();
		System.out.println(yourCar.speed);
	}
}
