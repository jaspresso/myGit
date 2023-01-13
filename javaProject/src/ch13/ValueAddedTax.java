package ch13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValueAddedTax {
	public static double valueOfSupply;//공급가액 0.0
	public static int vatRate = 10;//부가세율
	public static double getVat() {//부가세계산
		return valueOfSupply / vatRate;
	}
	public static double getTotal() {//부가세포함합계
		return valueOfSupply + getVat();
	}
	public static void main(String[] args) {
		DecimalFormat decFormat = new DecimalFormat("###,###");
		Scanner sc = new Scanner(System.in);
		System.out.print("공급가액을 입력하세요 : ");
		ValueAddedTax.valueOfSupply = Double.parseDouble(sc.nextLine());
		System.out.println("***********************");
		System.out.println("공급가액 : " + decFormat.format((int)valueOfSupply) + "원");
		System.out.println("부가가치세율 : " + vatRate + "%");
		System.out.println("부가가치세 : " + decFormat.format((int)getVat())+ "원");
		System.out.println("합계 : " + decFormat.format((int)getTotal())+ "원");
		System.out.println("******************************");
		sc.close();
	}

}
