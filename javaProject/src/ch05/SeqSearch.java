package ch05;

import java.util.Scanner;

//해당값의 index위치를 찾는 탐색예제
public class SeqSearch {
	public static void main(String[] args) {
		int s[] = {0,10,20,30,40,50,60,70,80,90,100};
		int value, index = -1;
		Scanner scan = new Scanner(System.in);
		System.out.println("(보기 : 0 10 20 30 40 50 60 70 80 90 100)");
		System.out.print("위 숫자 중 탐색할 값을 입력하시오 : ");
		value = scan.nextInt();
		scan.close();
		for(int i=0; i<s.length; i++) {
			if(s[i] == value)
				index = i;
		}
		if(index < s.length && index >= 0)  // true && true => true
			System.out.println(""+value+"값은 index "+index+"의 위치에 있습니다.");
		
	}
}
