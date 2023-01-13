package ch10;

public class FinalVar {
	//final을 변수에 적용하면 상수가 된다.
	final static int MAX_NUM=500;//상수처리
	
	
	public static void main(String[] args) {
		int max=100;
		System.out.println(max);
		System.out.println(MAX_NUM);
		//MAX_NUM = 200;//final 변수는 수정할 수 없음
	}
}
