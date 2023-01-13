package ch04;

import java.util.Scanner;

public class ControlEx {
	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		outer: //Label처리
		while(true) {
			System.out.println("(1) square(제곱)");
			System.out.println("(2) square root(제곱근)");
			System.out.println("(3) log(로그)");
			System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료:0) > ");
			String tmp = scanner.next();
			menu = Integer.parseInt(tmp);
			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(menu < 1 || menu > 3) {
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
				continue;
			}
			for(;;) {//for(;;)는 무한루프
				System.out.print("계산할 값을 입력하세요.(계산 종료:0, 전체 종료:99) > ");
				tmp = scanner.next();
				num = Integer.parseInt(tmp);
				if(num==0)
					break;
				if(num==99) break outer;//전체 종료. 바깥쪽 while문까지 모두 벗어남
				switch (menu) {
				case 1:
					System.out.println("result="+ num*num);//제곱
					break;
				case 2:
					System.out.println("result="+ Math.sqrt(num));//제곱근
					break;
				case 3:
					System.out.println("result="+ Math.log(num));//로그
					break;
				}
			}//end for(;;)
		}//end while
		System.out.println("프로그램을 모두 종료합니다.");
	}//end main

}
