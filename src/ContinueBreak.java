/*�������: break, continue
 * �ܵ����� ����� �� ����.
 * ����� �Բ� ����Ѵ�.(���ǹ�, �ݺ��� �� �Բ� ���)
 * */

public class ContinueBreak {

	public static void main(String[] args) {
		//Break�� -- ������ �����!!
		for(int i = 0;i<5; i++){
			if(i==3)break;
			System.out.println("i="+i);
		}
		//continue�� -- ����ؼ� �ݺ����� �����϶�!!
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
