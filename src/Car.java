
// Ŭ���� : �Ӽ�(�������) + ���
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
		
		Car myCar = new Car(); //Ŭ������ ��üȭ �Ҷ��� -->Ŭ������ �������� = new Ŭ������();
		Car yourCar = new Car();
		myCar.number = 1;
		myCar.speed=10;
		myCar.color = "Black";
		
		System.out.println("myCar�� speed: " +myCar.speed);
		myCar.speedUp();
		System.out.println(myCar.speed);
		System.out.println(myCar.number);
		System.out.println(myCar.color);
		
		yourCar.speed=50;
		System.out.println("yourCar �� speed: "+yourCar.speed);
		yourCar.speedUp();
		yourCar.speedDown();
		System.out.println(yourCar.speed);
	}
}
