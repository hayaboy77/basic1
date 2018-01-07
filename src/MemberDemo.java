
public class MemberDemo {
	//클래스의 구성요소 : 속성(필드) + 메서드(생성자)
	
	static int aa; //static 변수
	String str; // 인스턴스 변수
	
	//생성자 : static이 붙지않는다.
	
	// 기본생성자는 자바 컴파일러가 자동으로 생성해주기때문에 생략해도 무방.
	//public MemberDemo(){
		
	//}
	
//	public MemberDemo(){		
//		System.out.println("Constructor");
//	}
//	
	
	
	public static void yy(){
		System.out.println("클래스메소드");
	}
	
	public static String yyy(){
		System.out.println("반환값이 있는 클래스메소드");
		return "반환값";
	}
	
	public void xx(){
		System.out.println("인스턴스 메소드1");		
	}
	
	public int xxx(){
		System.out.println("반환값이 있는 인스턴스 메소드");
		return 1000;
	}
	
	public void zz(String str1){
		System.out.println("매개변수가 있는 메소드 :"+str1);
	}
		
	
	public static void main(String[] args) {
		//생성자를 호출하자. 이의미는 객체를 생성한다는 의미가 된다.
		MemberDemo md = new MemberDemo();
		md.xx();
		yy();
		
		md.zz("파라미터");
		
		String str2 = yyy();
		
		System.out.println(str2);
		
		int aa1 = md.xxx();
		System.out.println(aa1);

	}

}
