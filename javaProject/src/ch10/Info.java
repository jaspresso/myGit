package ch10;

public class Info {//만약 회사정보가 Info파일로 여러군데 사용된다면 편리하다.
	public static void main(String[] args) {
		//클래스이름.상수변수
		System.out.println("회사명 : " + Constants.COMPANY_NAME);
		System.out.println("전화번호 : "+Constants.TEL);
		System.out.println("주소 : "+Constants.ADDRESS);
	}

}
