//�θ�Ŭ����(Super Class-����Ŭ����)
class Human{
	String name;
	int age;
	
	public Human(){
		this("ȫ�浿", 22);
	}
	//���ڻ�����
	public Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void getInfo(){
		System.out.println("�̸� :"+name+"\n���� :"+age);	
	}
}

// super(����): �θ�Ŭ������ ��ü�� �ǹ� super.���� --> �θ�Ŭ������ ������ ����
// this : �ڽ��� ��ü�� �ǹ� this.���� ---> �ڽ�Ŭ������ ������ ����
// super() �޼ҵ� : �θ�Ŭ����(super class)�� �����ڸ� ȣ���ϱ����� �޼���
// this() �޼ҵ� : �ڽ��� �����ڸ� ȣ���ϱ����� �޼���

// super(): �����ھȿ����� ȣ���� �� �ִ�. �׻� �������� ù�ٿ� �;��Ѵ�.
// static �޼ҵ� �ȿ����� ����� �� ����.
// ������ �����ڸ� �ۼ����� ������쿡�� ����Ŭ������ �����ڿ��� �ڹ������Ϸ��� �ڵ����� ȣ���Ѵ�. 

//�ڽ�Ŭ����(subClass - ����Ŭ����)
class Employee extends Human{
	
	int salary;
//	public Employee(){
//		super();
//	}
	public Employee(String name, int age, int salary){
		super(name, age);
		this.salary = salary;
	}
	
	
	//�޼ҵ� �������̵�(Overridding) : ������
	
	//ȣ���ϰ��� �ϴ� �޼ҵ�� �θ�Ŭ������ ����
	//�޼ҵ���� �����ؾ��Ѵ�
	//�Ű������� Ÿ���� ����
	//��ȯŸ�Ե� ����.
	//���������ڴ� �θ�Ŭ�������� �аų� ����
	//������ ����� �޶�� �Ѵ�.
	
	public void getInfo(){
		System.out.println("�̸� :"+name+"\n���� :"+age+"\n���� :"+salary);
	}
	
}
//�ڽ�Ŭ����(subClass - ����Ŭ����)
class Student1 extends Human{
	
}

public class InheritanceEx {
	public static void main(String[] args) {
		 Employee em = new Employee("��ȣ��", 40, 500);
		 em.getInfo();
		 
		 Student1 stu = new Student1();
		 stu.getInfo();
	
	}

}
