


public class Hello{
	
	
	public static void main(String args[]){
		
		System.out.println("break ���̺�");
		out://���̺��
		
		for(int i = 0;i<3;i++){
			for(int k=0; k<3;k++){
				if(k==1) break out;
				// out�� ���� ����� �ݺ����� �����!!
				System.out.println("i="+i+",k="+k);
			}			
		}// end of for
		System.out.println("continue ���̺�");
		out:
		for(int i = 0;i<3;i++){
			for(int k=0; k<3;k++){
				if(k==1) continue out;
				// out�� ���� ����� �ݺ����� �����!!
				System.out.println("i="+i+",k="+k);
			}			
		}// end of for
	}
	
	
}