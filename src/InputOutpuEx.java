//IO 입출력
public class InputOutpuEx {
	public static void main(String[] args) {
		
//		for(int i = 0; i<args.length; i++){
//			System.out.println(args[i]);
//		}
		
		//for Each 배열과 함께 사용할 때 유용한 반복문
		//for(변수 : 배열변수){}
		
		for(String str : args){
			System.out.println(str);
		}		
	}
}
