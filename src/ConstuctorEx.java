// 생성자 오버로딩

// 생성자 : 인스턴스(객체)를 생성할 때(최초로 실행되는 메서드) 호출하는 메서드의 일종

class TextBook {
	String title;
	String author;
	int grade;
	
	//생성자의 역할 : 멤버변수를 초기화 할때 사용
	
	//인자 생성자
	public TextBook(String title){
		this(title,"남길동",4); //this();
	//	this.title = title;
	}
	//this: 자기 클래스의 인스턴스변수를 접근할때 사용
	//this.인스턴스변수,  this.인스턴스메서드
	//this는 static 메소드에서는 사용할 수 없다.
	
	// this()는 생성자를 호출하는 메소드
	// this()는 생성자 안에서만 사용한다.
	// this()는 반드시 생성자안에서 첫줄에 써야한다.
	
	
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
		System.out.println("과목 :"+this.title);
		System.out.println("저자 :"+author);
		System.out.println("학년 :"+grade);
	}

	
} // End of Class

public class ConstuctorEx {

	public static void main(String[] args) {
		TextBook tb = new TextBook("국어");
		tb.getBook();
		
		TextBook tb1 = new TextBook("영어","황석영");
		tb1.getBook();
		
		TextBook tb2 = new TextBook("수학","아무개",5);
		tb2.getBook();		

	}

}
