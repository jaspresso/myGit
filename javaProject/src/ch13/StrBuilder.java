package ch13;

public class StrBuilder {
	public static void main(String[] args) {
		//String 불변
		//StringBuilder 가변

		//StringBuffer str1=new StringBuffer();//초기버전용
		StringBuilder str1=new StringBuilder();//최신버전용
		//StringBuilder는 일반객체이기 때문에 String과는 달리 new해서 사용해야 함.
		str1.append("java");//append()는 문자열 내용 추가, 메모리 절약
		System.out.println(str1);
		str1.append(" programming");
		System.out.println(str1);
		//메소드 체이닝(Method Chaining) : 여러메소드를 이어서 호출하는 문법으로 하나의 라인에 처리하여
		//코드를 간결하게 처리할 수 있으나 잘못하면 너무 많은 일이 한라인에 일어나 디버깅이 어려울 수 있다.
		String chain = new StringBuilder().append("DB").append(" & ").append("Program").toString();
		System.out.println(chain);

		str1.replace(0, 4, "jsp");//0~3 인덱스 내용을 변경(java->jsp)
		//참고로 replace()메소드는 주로 String객체의 replace()를 많이 쓰는 편이다.
		System.out.println(str1);
		String str2=str1.substring(3);//인덱스 3~ 끝까지
		System.out.println(str1);
		System.out.println(str2);

		//StringBuilder를 String으로 바꿀 때는 toString()을 사용해야 한다.
		String str3=str1.toString();
		System.out.println("StringBuilder(str1) -> String(str3)에 저장 :" + str3);
		//str1 = str3
		//String을 StringBuilder에 저장할 때
		str1 = new StringBuilder(str3);
		System.out.println("String(str3) -> StringBuilder(str1)에 저장" + str1);
	}
}
