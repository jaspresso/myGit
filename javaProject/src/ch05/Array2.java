package ch05;

public class Array2 {
	public static void main(String[] args) {
		//[] 배열첨자, 배열첨자가 2개=>2차원 배열
		// 3행 3열(데이터)의 2차원 배열
		//int[][] num = {{10,20,30},{40,50,60},{70,80,90}};
		int[][] num;
		num=new int[3][3];
		num[0][0]=10;
		num[0][1]=20;
		num[0][2]=30;
		num[1][0]=40;
		num[1][1]=50;
		num[1][2]=60;
		num[2][0]=70;
		num[2][1]=80;
		num[2][2]=90;
		
		for(int i=0; i<3; i++) {//행
			for(int j=0; j<3; j++) {//열
				System.out.println(num[i][j]);
			}
		}
	}
}
