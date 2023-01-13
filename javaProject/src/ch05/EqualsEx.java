package ch05;

import java.util.Scanner;

public class EqualsEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("문자열을 입력해주세요 : ");
			//String은 char를 배열화해서 만든 객체이다. 즉, [] = J,a,v,a 처리
			String str = sc.nextLine();//문자열을 라인단위로 읽는 함수
			if(str.equals("exit")) {//문자형참조변수.equals("비교할문자")
				//참고 : 값을 비교할때는 "=="
				break;
			}else {
				System.out.println(str.length() + "글자 입니다.");
				//length() : 문자열에 대한 글자 수 반환 메소드(배열의 길이값)
			}
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}

}
