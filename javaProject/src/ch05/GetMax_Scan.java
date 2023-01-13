package ch05;

import java.util.Scanner;

public class GetMax_Scan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int intArray[] = new int[5];//배열 생성
		int max=0;
		System.out.println("양수 5개를 입력하세요.");
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = scanner.nextInt();
			if(intArray[i] > max) {
				max = intArray[i];
			}
		}
		System.out.print("가장큰 수는 "+ max + "입니다.");
		scanner.close();
	}

}
