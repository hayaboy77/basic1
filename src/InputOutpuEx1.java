import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutpuEx1 {

	
	public static void main(String[] args) throws IOException {
		
		
//		System.out.println("0~9 ������ �������� �Է��Ͻÿ�...");
//		
//		
//		int n=System.in.read()-'0';// ��ȯ���� ASCII ������ ��ȯ�� �Ѵ�.
//		
//		System.out.println(n);
		
		
		System.out.println("�Է��Ͻÿ�...");
		
		
		InputStreamReader id = new InputStreamReader(System.in);
		
		
		while(true) {
		
			int c=id.read();
			if(c == -1) // ASCII���� -1�ΰ��� Ctrl+z
				break;
			
			
			System.out.println((char)c);
			
		}
		
		
	}
	

}