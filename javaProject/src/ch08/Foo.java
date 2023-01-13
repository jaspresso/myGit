package ch08;

public class Foo {
	int a;
	double b;
	public Foo() {
		this(1);//다른생성자를 호출시 첫라인에서 호출해야 한다.
		System.out.println("기본생성자 호출");
	}
	public Foo(int x) {
		a=x;
		b=20.0;
	}
	public void print() {
		System.out.println("a="+a+"\t"+"b="+b);
	}
	public static void main(String[] args) {
		Foo f=new Foo();
		f.print();
	}
}
