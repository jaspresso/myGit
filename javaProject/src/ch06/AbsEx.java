package ch06;

public class AbsEx {
	
	public static int abs(int num) {
		return num>0 ? num : -num;//3항연산식 조건식? true : false 
	}
	
	public static void main(String[] args) {
		int a = -15;
		System.out.println(a);
		System.out.println(abs(a));
		System.out.println(Math.abs(a));
	}

}
