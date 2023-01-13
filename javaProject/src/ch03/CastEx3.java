package ch03;

public class CastEx3 {
	public static void main(String[] args) {
		int x = 8;
		int y = 5;
		System.out.println("x/y=" + x/y);
		System.out.printf("x/y=%.1f", (double)x/y);
		//위 println()문과는 달리 printf에서는 결과값을 %.1f로 실수형식으로 지정해놓은 경우는
		//반드시 연산결과가 실수값으로 나와야 하기 때문에 형변환 연산자인(double)을 명시적으로
		//적어 실수형으로 맞춰 줘야한다.
	}

}
