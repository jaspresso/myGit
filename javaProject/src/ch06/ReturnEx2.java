package ch06;

public class ReturnEx2 {
	public static void main(String[] args) {
		printScore(120);
	}

	public static void printScore(int score) {
		if(score <= 0 || score >= 100) {
			System.out.println("잘못된 점수 : " + score);
			return;//메소드 종료
		}
		System.out.println("점수 : " + score);
		
	}

}
