package ch04;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
	public static void main(String[] args) {
		Random generator = new Random();//난수를 발생시키는 랜덤함수 생성
		Scanner scan = new Scanner(System.in);
		System.out.print("난수의 개수 : ");
		
		int count = scan.nextInt();
		int sum = 0;
		scan.close();
		
		for(int i=0; i<count; i++) {
			int number = generator.nextInt(100);//0~99사이의 난수발생
			System.out.println("생성된 난수 : " + number);
			sum += number;//sum=sum+number;
		}
		System.out.println("난수 " + count + "개의 합은 " + sum);
	}
}
