package ch06;

public class SalaryEx {
	//전역변수(멤버변수)는 어디에서나 사용되어지며 값들이 기억되어진다.
	static String[] name = {"박과장","김과장","이대리","최주임","홍실장"};
	static int[] salary = {2800,3000,2500,2000,3500};//연봉
	static int[] bonus = {0,0,0,0,0};//보너스
	static int[] total = new int[5];//총액(연봉+보너스)
	static int[] tax = new int[5];//세금
	static int[] pay = new int[5];//실수령액
	static int pay_tot;//총지급액
	
	static void calc() {//계산용도
		for(int i=0; i<name.length; i++) {
			bonus[i] = (int)(salary[i] * 0.3);//연봉의 30%
			total[i] = salary[i] + bonus[i];//총액(연봉+보너스)
			tax[i] = (int)(total[i] * 0.03);//세금(총액의 3%)
			pay[i] = total[i] - tax[i];//실수령액
			pay_tot = pay_tot + pay[i];//지급총액
		}
	}
	
	static void print() {//출력용도
		System.out.println("이름\t연봉\t보너스\t총액\t세금\t실수령액");
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]+"\t"+salary[i]+"\t"+bonus[i]+"\t"
		+total[i]+"\t"+tax[i]+"\t"+pay[i]);
		}
		System.out.println("총지급액 합계 : " + pay_tot);
		System.out.println("총지급액 평균 : " + pay_tot/name.length);
	}
	
	public static void main(String[] args) {
		//main쪽 코딩량을 줄이도록 노력~
		calc();//계산할 기능의 메소드 호출
		print();//프린트용도 메소드 호출
	}

}
