import java.io.*;

public class InputOutputEx1 {
	
	public static void main(String[] args) throws IOException{
		
		System.out.println("0~9 ������ ������ �Է��Ͻÿ�...");
		
		int n;
		n = System.in.read()-48; // n = System.in.read()-'0'; //read�� int�� ASCII������ ��ȯ
		
		System.out.println(n);
		
		System.out.println("�Է��Ͻÿ�");
		
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		
		while(true) {
			int c = isr.read();
					if(c==-1) {
						break;
					}
					System.out.println((char)c);
		}
		
	}

}
