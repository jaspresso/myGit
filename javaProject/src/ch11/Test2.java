package ch11;

public class Test2 extends Test {

	@Override
	public void print() {//구현부만 있으면 된다.
		System.out.println("추상클래스 구현");
	}
	public static void main(String[] args) {
		//Test a=new Test();//추상클래스인 부모클래스는 생성 안된다.
		//추상클래스는 생성이 안된다.
		
		Test2 t=new Test2();
		t.print();
		
	}

}
