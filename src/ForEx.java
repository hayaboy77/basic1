
public class ForEx {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello Java!!");	
		} //���� i(��������)�� for ������ ����� �״´�.(�������.) 
		
		int i=5;
		for(;i>0;i--)
		{
			System.out.println("Hello World!!");	
		}
		System.out.println("i="+i);
		
//		for(;;){
//			System.out.println("���ѹݺ�");
//		}
		//1���� 10������ ��
		int sum=0;
	    for(int j=1;j<=10;j++){
	    	sum +=j; //sum=sum+j	    	
	    }
	    System.out.println(sum);
	    
	    //0~100������ ������ ¦���� ���� ���غ���!!
	    int sum2=0;
	    
	    for(int j=0;j<=100;j++){
	    	if(j%2==0){
	    		System.out.println(sum2+"+"+j);
	    		sum2=sum2+j;
	    	}
	    }	    
	    
	    System.out.println("1���� 100������ ��:"+sum2);
	}// i�� ������ �������

}
