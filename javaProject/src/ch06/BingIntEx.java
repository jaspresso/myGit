package ch06;

import java.math.BigInteger;

public class BingIntEx {
	
	static BigInteger factorial(int n) {
		BigInteger fac=BigInteger.ONE;//ONE은 1임
		for(int i=1; i<=n; i++) {
			fac = fac.multiply(BigInteger.valueOf(i));//객체로 바꿔주는 작업
		}
		return fac;
	}
	
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			System.out.println(i+"팩토리얼="+factorial(i));
			System.out.println();//줄바꿈용도
		}
	}
}
