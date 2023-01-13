package ch06;

public class OverloadEx3 {
	public static void main(String[] args) {
		print("홍길동","hong@gmail.com","010-1234-5678");
		print("이순신", 99, 87, 76);
		print("김과장", 560);
		
	}
	
	static void print(String name, int sal) {
		// TODO Auto-generated method stub
		
	}

	static void print(String name, String email, String hp) {
		System.out.println("====================================");
		System.out.println("이름\t이메일\t\t전화");
		System.out.println(name+"\t"+email+"\t"+hp);
	}
	
	static void print(String name, int kor, int eng, int mat) {
		System.out.println("====================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+(kor+eng+mat)
				+"\t"+String.format("%.1f", (double)(kor+eng+mat)/3));
	}

}
