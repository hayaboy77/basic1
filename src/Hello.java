


public class Hello{
	
	
	public static void main(String args[]){
		
		System.out.println("break 레이블");
		out://레이블명
		
		for(int i = 0;i<3;i++){
			for(int k=0; k<3;k++){
				if(k==1) break out;
				// out과 가장 가까운 반복문을 벗어나라!!
				System.out.println("i="+i+",k="+k);
			}			
		}// end of for
		System.out.println("continue 레이블");
		out:
		for(int i = 0;i<3;i++){
			for(int k=0; k<3;k++){
				if(k==1) continue out;
				// out과 가장 가까운 반복문을 벗어나라!!
				System.out.println("i="+i+",k="+k);
			}			
		}// end of for
	}
	
	
}