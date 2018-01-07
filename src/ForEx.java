
public class ForEx {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello Java!!");	
		} //변수 i(지역변수)는 for 루프를 벗어나면 죽는다.(사라진다.) 
		
		int i=5;
		for(;i>0;i--)
		{
			System.out.println("Hello World!!");	
		}
		System.out.println("i="+i);
		
//		for(;;){
//			System.out.println("무한반복");
//		}
		//1부터 10까지의 합
		int sum=0;
	    for(int j=1;j<=10;j++){
	    	sum +=j; //sum=sum+j	    	
	    }
	    System.out.println(sum);
	    
	    //0~100까지의 수에서 짝수의 합을 구해보자!!
	    int sum2=0;
	    
	    for(int j=0;j<=100;j++){
	    	if(j%2==0){
	    		System.out.println(sum2+"+"+j);
	    		sum2=sum2+j;
	    	}
	    }	    
	    
	    System.out.println("1부터 100까지의 합:"+sum2);
	}// i의 생명은 여기까지

}
