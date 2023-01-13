package ch04;

public class For_Sum {
	public static void main(String[] args) {
		int total=0;
		for(int i=1; i<=100; i++) {//반복문
			total=total+i;
			if( i%10 == 0) {//if문
				System.out.println("  1부터 " + i + "까지의 자연수 합계는 " + total);
			}
		}
	}

}
