//Overloading : ���� ����
public class MethodOverloadingEx {
	
	public void getAdd(){
		System.out.println("�����ε�");
	}	
	public int getAdd(int i, int j){
		return i+j;
	}	
	public int getAdd(int i, int j, int k){
		return i+j+k;
	}
	public int getAdd(float i, int j, int k){
		return (int)(i+j+k);
	}	
	public int getAdd(int i, float j, int k){
		return (int)(i+j+k);
	}	
	//�����ε� ������ �ȵȴ�. (���� ����Ÿ���� �Ű������� ���� ���� ������...)
//	public int getAdd(int ii, int jj){
//		return ii+jj;
//	}	
	public double getAdd(double i, int j, int k){
		return (double)(i+j+k);
	}	
	
	public static void main(String[] args) {
		MethodOverloadingEx mOver = new MethodOverloadingEx();
		
		mOver.getAdd();
		int a = mOver.getAdd(1,2);
		int b = mOver.getAdd(1, 2,3);
		int c = mOver.getAdd(1.2F, 2, 4);
		int d = mOver.getAdd(1, 1.2F, 3);
		double e = mOver.getAdd(1.3, 2, 3);
		
		System.out.println(a+","+b+","+c+","+d+","+e);
		
		
		
	}

}
