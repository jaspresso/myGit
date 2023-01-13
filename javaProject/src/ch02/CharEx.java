package ch02;

public class CharEx {
	public static void main(String[] args) {
		char aValue = '\u0041';//유니코드
		System.out.println("char형('\u0041') : " + aValue);
		char bValue = '\u0041';
		System.out.println("char형(\'\\u0041\') : " + bValue);
		// \' => Single Quote 표현
		// \\ => Backslash를 표현
	}

}
