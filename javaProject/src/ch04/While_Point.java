package ch04;

import java.util.Scanner;

public class While_Point {
	public static void main(String[] args) {
		int total = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("더할 값을 입력 하세요 : ");
		int num = input.nextInt();
		
		while(num != 0) {//0이 입력되지 않는 이상 무한반복
			total += num;//total=total+num
			System.out.println("현재 누적된 값 : "+total);
			System.out.println("계속 입력하세요.(종료를 원하면 0을 입력)");
			num = input.nextInt();//조건식의 무한루프를 빠져나갈 용도
		}
		
		System.out.println("총 누적합 : " + total);
		System.out.println("프로그램을 종료합니다.");
		input.close();
	}
}
