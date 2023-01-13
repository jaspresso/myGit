package ch03;

public class CastEx2 {
	public static void main(String[] args) {
		int a = 500;
		float b = 200.2f;
		int c = 127;
		
		double d = a;//자동형변환
		System.out.println("int a => double : " + d);
		
		int e = (int)b; //명시적형변환
		System.out.println("float b => int : " + e);
		
		byte f = (byte)c; 
		System.out.println("int c => byte : " + f);
	}

}
