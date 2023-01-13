package ch11;

public class B implements A {

	@Override
	public void input() {
		System.out.println("데이터 입력");
	}

	@Override
	public void print() {
		System.out.println("데이터 출력");
	}

}
