package ch04;

public class Mulit {
	public static void main(String[] args) {
		long num = 10;
		long sum = 1;//합계를 저장할 변수
		for(int i=1; i<=num; i++) {
			sum = sum * i;//  1=1*1, 2=1*2, 6=2*3, 24=6*4,....
		}
		System.out.println("1~"+num+"까지의 곱 : "+ sum);
	}

}
