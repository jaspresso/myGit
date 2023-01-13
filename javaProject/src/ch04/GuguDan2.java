package ch04;

public class GuguDan2 {
	public static void main(String[] args) {
		for(int dan=2; dan<=9; dan++) {//2, 3, 4....9
			System.out.println("** " + dan + " 단 **");//타이틀 용도
			for(int n=1; n<=9; n++) {//1, 2,....9
				System.out.println(dan + " * " + n + " = " + dan*n);
			}//inner for
		}//outer for
	}
}
