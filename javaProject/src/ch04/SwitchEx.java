package ch04;

public class SwitchEx {
	public static void main(String[] args) {
		int n = 2;
		switch (n) {//조건
		case 1:
			System.out.println("1");
			break;
		case 2://값일치
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default:
			System.out.println("4이상");
		}
	}
}
