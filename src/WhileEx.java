
public class WhileEx {
	public static void main(String[] args) {
//		while(���ǽ�){
//			�ݺ������ ����
//			������;
//		}
		
		int i = 1;
		while (i<5){
			System.out.println("i ="+i);
			i++;
		} //end of while
		
		//���ѷ��� --> for(;;)
		
//		while(true){
//			System.out.println("���ѷ���");
//		}
//		
		for(int j=1;j<=5;j++){
			System.out.println(j);
		}
		
		//���� for���� while������ �����غ���!!
		
		int j=1;
		while(j<=5){
			System.out.println(j);
			j++;
		}
		//do ~ while�� ����
//      do {
//		
//		}while();
		
		//���� while���� do~while�� ���� �����غ���!!!
		
		j=0;
		do{
			j++;
			System.out.println(j);
		}while(j<5);
		
		//a~z���� ����ϴ� do ~ while���� �ۼ��غ���!!!
		
		char a ='A';
		//ascii�� a+1=> 97+1 'A' =>65
					
		do{
			System.out.print(a);	
			a = (char)(a+1);
		}while(a<='Z');		
		System.out.println();
		System.out.print("Hi"+'\n');
		System.out.print("java");
	}
}
