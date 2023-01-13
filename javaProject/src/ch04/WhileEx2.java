package ch04;

public class WhileEx2 {
	public static void main(String[] args) {
		int i=1;//초기식
		int num=10;
		int sum=0;
		while(i <= num) {
			sum = sum + i;
			i++;
		}
		System.out.println("1~"+num+"까지의 합계 : "+sum);
	}

}
