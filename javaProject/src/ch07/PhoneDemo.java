package ch07;

//한개의 파일에 2개이상의 class를 작성할때는 main메소드가 있는 public class를 클래스이름으로 저장해야함.
//다른 클래스는 접근제어지정자가 default(명시X)로 처리되어야 함.
class Phone{
	String model;//(예:100번지)갤럭시 S11,  (200번지)iPhone13
	int value;
	void print() {
		System.out.println(value + "만원 짜리 " + model + "스마트폰");
	}
}

public class PhoneDemo {//실행파일
	public static void main(String[] args) {
		Phone myPhone = new Phone();//객체생성
		myPhone.model = "갤럭시 S11";
		myPhone.value = 100;
		myPhone.print();
		
		Phone yourPhone = new Phone();//객체생성
		yourPhone.model = "iPhone13";
		yourPhone.value = 150;
		yourPhone.print();
	}
}
