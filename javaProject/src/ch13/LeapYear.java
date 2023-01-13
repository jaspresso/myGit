package ch13;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("연도를 입력하세요 : ");
		int year=scan.nextInt();
		GregorianCalendar cal=new GregorianCalendar();
		if(cal.isLeapYear(year)) {//isLeapYear():윤년계산 메소드
			System.out.println("윤년입니다.");
		}else {
			System.out.println("평년입니다.");
		}
	}

}
