package ch15;

public class ThrowExam {
	//throw : 예외를 직접 발생시키는 방법, 테스트용외에는 거의 쓸 일이 없다.
	//throws / throw 주의
	static void test(int n) {
		if(n == 0) {
			throw new NullPointerException();
			//throw new 예외클래스(); => 특정한 조건에 인위적 예외를 발생시킴
		}
	}
	public static void main(String[] args) {
		test(0);
	}

}
