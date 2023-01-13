package ch04;

public class While_GuguDan {
	public static void main(String[] args) {
		int dan=2;
		int j=1;
		while(dan<=9) {
			System.out.println("** "+dan+" 단 **");
			while(j<=9) {
				System.out.println(dan+" x "+j+" = "+(dan*j));
				j++;
			}//inner while
			j=1;//j를 1로 초기화 시켜주지 않으면 2단 연산 후의 while문이 안돌아간다.
			dan++;
		}//outer while
	}

}
