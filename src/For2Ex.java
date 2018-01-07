
public class For2Ex {

	public static void main(String[] args) {
		for(int i=1;i<4;i++){			
			for(int k = 0;k<2;k++){
				System.out.println("i="+i+",k="+k);
			}//end of for
			System.out.println("+++++++");
		}// end of for2	

		// * 출력해보기
		//		  *****
		//		  *****
		//		  *****
		
		for(int i=1;i<4;i++){
			for(int j=1;j<6;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 아래와 같이 구구단을 출력해보자!!!
		//		   2*1=2 3*1=3 .....
		//		   2*2=4 3*2=6 .....		   
		//		   .....
		  
		
		for(int i =1;i<=9;i++){
			for(int j=2;j<=9;j++){
				System.out.print(j+"*"+i+"="+(j*i)+"\t");
			}//end of for1
			System.out.println();
		}//end of for2
		

		
		
		
		
		
	}// end of main()

}// end of class
