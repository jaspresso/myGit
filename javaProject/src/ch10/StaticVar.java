package ch10;

public class StaticVar {
	static int a=10;
	int b=20;
	
	public static void main(String[] args) {
		System.out.println(StaticVar.a);//static멤버는 클래스이름.멤버로도 접근가능하다.
		
		StaticVar s=new StaticVar();
		System.out.println(s.b);
	}

}
