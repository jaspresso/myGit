package ch04;

public class Sum {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;//sum=sum+i; 와 같음 0=0+1, 3=1+2, 6=3+3,.....
			System.out.printf("1부터 10까지의 정수의 합 = %d\n", sum);
		}
	}

}
