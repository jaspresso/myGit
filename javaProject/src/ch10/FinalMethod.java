package ch10;

class A2 {
	final void print() {//메소드에 final을 붙이면 상속관계에 있어 오버라이딩이 안된다.
		System.out.println("a");
	}
}

class B2 extends A2{
//	@Override
//	void print() {//오버라이딩 X
//		System.out.println("b");
//	}
	
}

public class FinalMethod {
	public static void main(String[] args) {
		B2 b=new B2();
		b.print();
		
	}

}
