package ch02;

public class PrintfEx {
	public static void main(String[] args) {
		int i = 97;
		int d = 3000;
		String s = "Java";
		double f = 3.14;
		
		System.out.printf("%d\n", i);// \n은 줄바꿈처리
		System.out.printf("%o\n", i);
		System.out.printf("%x\n", i);
		System.out.printf("%c\n", i);
		System.out.printf("%5d\n", d);
		System.out.printf("%-5d\n", d);
		System.out.printf("%05d\n", d);
		System.out.printf("%,d\n", d);//3자리마다 콤마
		System.out.printf("%,7d\n", d);//7은 콤마를 포함한 전체자리수를 의미
		System.out.printf("%s\n", s);
		System.out.printf("%5s\n", s);
		System.out.printf("%-5s\n", s);
		System.out.printf("%f\n", f);
		System.out.printf("%e\n", f);
		System.out.printf("%4.1f\n", f);
		System.out.println(String.format("%4.1f", f));//println문에서 format형식을 취할때
		System.out.printf("%.1f\n", f);
		System.out.printf("%04.1f\n", f);
		System.out.printf("%-4.1f\n", f);
		
		int a=3, b=5;
		// %를 표현하고자 할때는 a%%b처럼 %를2개 씀
		System.out.printf("a%%b=%d\n", a%b);
	}

}
