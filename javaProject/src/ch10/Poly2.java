package ch10;

class Pa{
	String name="홍길동";
	public void print() {
		System.out.println("이름 : "+name);
	}
}

class Ch extends Pa{
	int age=30;
	@Override
	public void print() {
		super.print();
		System.out.println("나이 : " + age);
	}
}

public class Poly2 {
	public static void main(String[] args) {
		String tel = "010-1234-5678";
		Pa c = new Ch();//다형성
		c.print();//자식쪽 print()호출
		System.out.println("전화번호 : " + tel);
	}

}
