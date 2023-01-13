package ch04;

public class Nested_If_Score {
	public static void main(String[] args) {
		int score = 87;
		char grade = ' ';
		char lev = '0';//A0, B0...처리 ex)94~97점 이면 A0로 표시됨
		
		if(score > 90) {
			grade = 'A';
			if(score > 97) {//98점 이상 A+
				lev = '+';
			}else if(score < 94) {//91~93점 A-
				lev = '-';
			}
		}else if(score > 80) {
			grade = 'B';
			if(score > 87) {
				lev = '+';
			}else if(score < 84) {
				lev = '-';
			}
		}else {
			grade ='F';
			System.out.println("재수강 대상입니다.");
		}
		
		System.out.println("당신의 점수는 " + score + "이고 등급은 " + grade + lev + " 입니다.");
	}

}
