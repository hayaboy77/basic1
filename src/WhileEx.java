
public class WhileEx {
	public static void main(String[] args) {
//		while(조건식){
//			반복실행될 문장
//			증감식;
//		}
		
		int i = 1;
		while (i<5){
			System.out.println("i ="+i);
			i++;
		} //end of while
		
		//무한루프 --> for(;;)
		
//		while(true){
//			System.out.println("무한루프");
//		}
//		
		for(int j=1;j<=5;j++){
			System.out.println(j);
		}
		
		//위의 for문을 while문으로 변경해보자!!
		
		int j=1;
		while(j<=5){
			System.out.println(j);
			j++;
		}
		//do ~ while문 형식
//      do {
//		
//		}while();
		
		//위의 while문을 do~while문 으로 변경해보자!!!
		
		j=0;
		do{
			j++;
			System.out.println(j);
		}while(j<5);
		
		//a~z까지 출력하는 do ~ while문을 작성해보자!!!
		
		char a ='A';
		//ascii값 a+1=> 97+1 'A' =>65
					
		do{
			System.out.print(a);	
			a = (char)(a+1);
		}while(a<='Z');		
		System.out.println();
		System.out.print("Hi"+'\n');
		System.out.print("java");
	}
}
