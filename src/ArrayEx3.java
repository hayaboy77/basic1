
public class ArrayEx3 {
	public static void main(String[] args) {
		// ���� �迭
		
		// ���� ũ�⸸ ���� ���س���, ���� ũ��� ���������� �Ҵ�
		
		char ch [][] = new char[3][]; //3��
		
	    System.out.println("ch�迭�� ũ�� :"+ch.length);
	    ch[0] = new char[3]; //3��
	    System.out.println("ch[0]�迭�� ũ�� :"+ch[0].length);
	    ch[1] = new char[2]; // 2��
	    System.out.println("ch[1]�迭�� ũ�� :"+ch[1].length);
	    ch[2] = new char[1]; // 1��
	    
	    ch[0][0] = 'A';
	    ch[0][1] = 'B';
	    ch[0][2] = 'C';
	    ch[1][0] = 'D';
	    ch[1][1] = 'E';
	    ch[2][0] = 'F';
	    
	    for (int i=0;i<ch.length;i++){
	    	for(int j=0;j<ch[i].length;j++){
	    		System.out.print(ch[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	    
	    String str[][] = {{"�ȳ��ϼ���"},{"�氡�氡", "^^"},{"�����ϴ�.!!", "����","��ť"}};
	    for (int i=0;i<str.length;i++){
	    	for(int j=0;j<str[i].length;j++){
	    		System.out.print(str[i][j]+" ");
	    	}
	    	System.out.print(" ");
	    }	    
	}

}
