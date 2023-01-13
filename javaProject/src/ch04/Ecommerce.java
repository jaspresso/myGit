package ch04;

import java.util.Scanner;

public class Ecommerce {
	public static void main(String[] args) {
		//변수 선언
		String name="";
		int price=0; //구매금액
		int point=0; //포인트
		int point_use = 0; //포인트 사용액
		int fee = 0; //배송료
		int pay; //실제 결제금액
		//자료 입력
		Scanner scan=new Scanner(System.in);
		System.out.print("이름 : ");
		name = scan.next();//문자열을 입력받게하는 함수
		System.out.print("구매금액 : ");
		price = scan.nextInt();//정수를 입력받게하는 함수
		System.out.print("보유포인트 : ");
		point = scan.nextInt();
		scan.close();
		//계산
		if(price < 20000 ) {//구매금액이 2만원 미만이면
			fee = 2500;//배송료 2500원
		}
		if(point >= 10000) {//point가 1만점 이상이면
			point_use = point;//포인트 사용
			pay = price + fee - point;
		}else {
			pay = price + fee;
		}
		//출력
		System.out.println("이름\t구매금액\t배송료\t포인트사용\t결제금액");
		System.out.println(name+"\t"+price+"\t"+fee+"\t"+point_use+"\t"+pay);
	}
}
