// ������ �����ε�

// ������ : �ν��Ͻ�(��ü)�� ������ ��(���ʷ� ����Ǵ� �޼���) ȣ���ϴ� �޼����� ����

class TextBook {
	String title;
	String author;
	int grade;
	
	//�������� ���� : ��������� �ʱ�ȭ �Ҷ� ���
	
	//���� ������
	public TextBook(String title){
		this(title,"���浿",4); //this();
	//	this.title = title;
	}
	//this: �ڱ� Ŭ������ �ν��Ͻ������� �����Ҷ� ���
	//this.�ν��Ͻ�����,  this.�ν��Ͻ��޼���
	//this�� static �޼ҵ忡���� ����� �� ����.
	
	// this()�� �����ڸ� ȣ���ϴ� �޼ҵ�
	// this()�� ������ �ȿ����� ����Ѵ�.
	// this()�� �ݵ�� �����ھȿ��� ù�ٿ� ����Ѵ�.
	
	
	public TextBook(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	public TextBook(String title, String author, int grade){
		this.title = title;
		this.author = author;
		this.grade = grade;
	}
	
	public void getBook(){
		System.out.println("----------------");
		System.out.println("���� :"+this.title);
		System.out.println("���� :"+author);
		System.out.println("�г� :"+grade);
	}

	
} // End of Class

public class ConstuctorEx {

	public static void main(String[] args) {
		TextBook tb = new TextBook("����");
		tb.getBook();
		
		TextBook tb1 = new TextBook("����","Ȳ����");
		tb1.getBook();
		
		TextBook tb2 = new TextBook("����","�ƹ���",5);
		tb2.getBook();		

	}

}
