package ch03;
//쉬프트 연산자
public class ShiftEx {
	public static void main(String[] args) {
		int a = 2;//이진수 0010
		//a값을 좌측으로 2비트씩 쉬프트(밀어내기)
		int b = a << 2;//이진수 1000
		System.out.println(b);
	}

}
