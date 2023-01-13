package ch13;

public class Change {
	public static void main(String[] args) {
		int a=10;//콜라 컵
		int b=20;//사이다 컵
		int temp;//b의 값을 a에 바로 넣기 전 미리 백업해서 거쳐가는 임시변수처럼 활용
		temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
	}

}
