/*보조제어문: break, continue
 * 단독으로 사용할 수 없다.
 * 제어문과 함께 사용한다.(조건문, 반복문 과 함께 사용)
 * */

public class ContinueBreak {

	public static void main(String[] args) {
		//Break문 -- 루프를 벗어나라!!
		for(int i = 0;i<5; i++){
			if(i==3)break;
			System.out.println("i="+i);
		}
		//continue문 -- 계속해서 반복문을 실행하라!!
		for(int i = 0;i<5; i++){
			if(i==3) continue;
			System.out.println("i="+i);
		}
		
		for(int i = 0;i<3;i++){
			for(int k=0; k<3;k++){
				if(k==1) break;
				System.out.println("i="+i+",k="+k);
			}			
		}// end of for
		
		
		for(int i = 0;i<3;i++){
			for(int k=0; k<3;k++){
				if(k==1) continue;
				System.out.println("i="+i+",k="+k);
			}			
		}// end of for
		
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
