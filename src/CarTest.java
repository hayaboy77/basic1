
class CarDemo{
	
	
	String kind;
	int number;
	int speed;
	String color;
	
	
	
	
	public CarDemo(){
		kind = "소형차";
	}
	
	public void speedUp(){
		speed +=10;
	}
	
	
	public void speedDown(){
		speed -=5;
	}
	
	
}


public class CarTest {
	
	static String kind1;
	
	public static void main(String[] args) {
		
		CarDemo myCar = new CarDemo();
		myCar.color="흰색";
		CarDemo yourCar = new CarDemo();
		
		myCar.kind="hdjfks";
		yourCar.kind="fgvhbkjnl;";
		//클래스변수 호출: 클래스명.변수명
	  // System.out.println("클래스변수 kind: " +CarDemo.kind);
	// 같은 클래스내에 있는 클래스변수를 호출하는 경우에는 클래스명을 생략할 수 있다.
			System.out.println(kind1);
			
			// 인스턴스 변수의 호출 : 인스턴스를 생성한 후에 호출할 수  있다.
			// 인스턴스명(객체명).변수
			System.out.println("인스턴스변수 color: "+myCar.color);
			System.out.println("인스터스변수 color: "+yourCar.color);
			
			System.out.println("myCar의 차종은 : "+myCar.kind);
			System.out.println("yourCar의 차종은 : "+yourCar.kind);	
			
			
			
	}
	
	
	
	
	
	
	
	
	
	

}
