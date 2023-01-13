package ch04;

public class For_If_Else {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=10; i++) {//10번 반복
			sum += i;//sum=sum+i,  1=0+1, 3=1+2, 6=3+3,....
			System.out.print(i);//더하는 수 출력
			if(i<=9) {//1~9까지는 '+' 출력
				System.out.print("+");
			}else {// i가 10인 경우
				System.out.print("=");
				System.out.print(sum);
			}
		}
	}
}
