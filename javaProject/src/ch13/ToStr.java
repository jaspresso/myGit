package ch13;

public class ToStr {
	public static void main(String[] args) {
		Object obj = new Object();
		obj=new Integer(20);//참조변수에는 원래 주소값이 들어가지만
		//1.5ver부터는 value가 들어갈 수 있도록 내부처리(intValue())하도록 했다.=>Auto Boxing처리
		System.out.println(obj);//Auto Unboxing
		obj=new Double(20.5);
		System.out.println(obj);
		//obj=new String("hello");
		obj="hello";
		System.out.println(obj);
	}
}
