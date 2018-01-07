
public class ArrayEx3 {
	public static void main(String[] args) {
		// 가변 배열
		
		// 행의 크기만 먼저 정해놓고, 열의 크기는 가변적으로 할당
		
		char ch [][] = new char[3][]; //3행
		
	    System.out.println("ch배열의 크기 :"+ch.length);
	    ch[0] = new char[3]; //3열
	    System.out.println("ch[0]배열의 크기 :"+ch[0].length);
	    ch[1] = new char[2]; // 2열
	    System.out.println("ch[1]배열의 크기 :"+ch[1].length);
	    ch[2] = new char[1]; // 1열
	    
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
	    
	    String str[][] = {{"안녕하세요"},{"방가방가", "^^"},{"고맙습니다.!!", "감사","땡큐"}};
	    for (int i=0;i<str.length;i++){
	    	for(int j=0;j<str[i].length;j++){
	    		System.out.print(str[i][j]+" ");
	    	}
	    	System.out.print(" ");
	    }	    
	}

}
