
class CarDemo{
	
	
	String kind;
	int number;
	int speed;
	String color;
	
	
	
	
	public CarDemo(){
		kind = "������";
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
		myCar.color="���";
		CarDemo yourCar = new CarDemo();
		
		myCar.kind="hdjfks";
		yourCar.kind="fgvhbkjnl;";
		//Ŭ�������� ȣ��: Ŭ������.������
	  // System.out.println("Ŭ�������� kind: " +CarDemo.kind);
	// ���� Ŭ�������� �ִ� Ŭ���������� ȣ���ϴ� ��쿡�� Ŭ�������� ������ �� �ִ�.
			System.out.println(kind1);
			
			// �ν��Ͻ� ������ ȣ�� : �ν��Ͻ��� ������ �Ŀ� ȣ���� ��  �ִ�.
			// �ν��Ͻ���(��ü��).����
			System.out.println("�ν��Ͻ����� color: "+myCar.color);
			System.out.println("�ν��ͽ����� color: "+yourCar.color);
			
			System.out.println("myCar�� ������ : "+myCar.kind);
			System.out.println("yourCar�� ������ : "+yourCar.kind);	
			
			
			
	}
	
	
	
	
	
	
	
	
	
	

}
