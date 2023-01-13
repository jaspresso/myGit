package ch13;

public class WrapperEx {
	public static void main(String[] args) {
		Integer i1=10;
		Integer i2=new Integer(20);
		int num1=i1.intValue();
		int num2=i2;//auto unboxing(객체로 포장된 value를 꺼내는 작업)
		int sum=num1+num2;
		System.out.println(sum);
		//2진수 문자열로
		System.out.println(Integer.toBinaryString(sum));
		//8진수 문자열로
		System.out.println(Integer.toOctalString(sum));
		//16진수 문자열로
		System.out.println(Integer.toHexString(sum));
		System.out.println(Integer.MAX_VALUE);//정수의 최대값
		System.out.println(Integer.MIN_VALUE);//정수의 최소값
		System.out.println(Integer.parseInt("100"));//문자를 숫자로
		System.out.println(Integer.toString(100));//숫자를 문자로
		System.out.println(100+"");//숫자를 문자로
		
	}

}
