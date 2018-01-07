
public class ArrayEx2 {

	public static void main(String[] args) {
		//다차원 배열 (2차원)
		
		//선언
		
		int a[][];
		//생성
		a =new int [2][3];
		//초기화
		a[0][0] = 11;
		a[0][1] = 12;
		a[0][2] = 13;
		a[1][0] = 14;
		a[1][1] = 15;
		a[1][2] = 16;
		
		// System.out.println("a[0][0] ="+a[0][0]);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		int b [][] = {{1,2,3},{4,5,6}};
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++){
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}

	}

}
