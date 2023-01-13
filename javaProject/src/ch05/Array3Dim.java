package ch05;

//3차원 배열 : 배열명 = new 자료형[면][행][열]
public class Array3Dim {
	public static void main(String[] args) {
		//2면 3행 4열
		String[][][] subject = {
		{ //1면
		{"JS01","AL02","PY03","DS04"}//과목코드
		,{"JSP","알고리즘","파이썬","자료구조"}//과목명
		,{"홍길동","강감찬","이순신","이몽룡"}}, //지도교수 
								
		{ //2면
		{"CS01","CS02","CS03","CS04"}//과목코드
		,{"생활영어","경제학","생활체육","음악"}//과목명
		,{"김영철","정경제","최배달","조수민"}//지도교수
		}};
		//subject[0][0][0]="JS01", subject[0][0][1]="AL02"....
		
		for(int i=0; i<subject.length; i++) {//면
			for(int j=0; j<subject[i].length; j++) {//행
				for(int k=0; k<subject[i][j].length; k++) {//열
					System.out.println("["+i+"]["+j+"]["+k+"] : " + subject[i][j][k]);
				}
			}
			System.out.println("===================================");
		}//end outer for
	}
}
