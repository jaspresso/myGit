package ch05;

public class SkewedArray {
	public static void main(String[] args) {
		//비정방형 배열 (3행 n열)
		int[][] num = {{10,20,30},{40,50},{60}};
		
		for(int i=0; i<num.length; i++) {//행
			for(int j=0; j<num[i].length; j++) {//열
				System.out.println(num[i][j]);
			}
		}
	}

}
