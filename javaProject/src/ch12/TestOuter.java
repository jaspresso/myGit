package ch12;

public class TestOuter {
	private int data=30;
	class Inner{//내부 클래스
		void msg() {
			System.out.println("data is "+data);
			//외부클래스의 private 멤버변수도 쓸 수 있다.
		}
	}
	
	public static void main(String[] args) {
		TestOuter obj=new TestOuter();
		TestOuter.Inner in=obj.new Inner();//내부 객체 생성
		in.msg();
	}
}
