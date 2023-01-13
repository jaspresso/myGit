package ch04;

import java.util.Scanner;

public class Do_while_Ex4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int month;
		do {//정확한 값을 입력받고자할때 사용
			System.out.print("올바른 월을 입력하세요 [1-12] : ");
			month = input.nextInt();
		} while (month < 1 || month > 12);
		input.close();
		System.out.println("사용자가 입력한 월은 " + month);
	}

}
