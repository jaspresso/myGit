package ch10;

public class Test {
	static int a;//static member
	int b;//non-static member
	void print() {//non-static member
		//non-static 메소드에서는 static, non-static멤버변수를 모두 쓸 수 있다.
		System.out.println(a);//a는 이미 메모리에 올라와 있기 때문에 문제없다.
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		
		Test t=new Test();
		System.out.println(t.b);//new를 해야만 non-static인 b를 쓸 수 있다.
		t=null;//객체의 주소값을 지워버림
		//System.out.println(t.b);
		System.out.println(Math.PI);//대표적인 static 멤버
	}

}
