//Scanner 클래스 사용한 입출력
import java.util.*;

public class InputOutpuEx3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름과 나이를 입력하세요...");
		
		System.out.println("당신의 이름은 "+sc.next()+" 입니다.");
		System.out.println("당신의 나이는 "+sc.nextInt()+"살 입니다.");
	}
}
