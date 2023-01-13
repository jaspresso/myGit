package ch08;

public class PersonUse {
	public static void main(String[] args) {
		Person p1=new Person();//객체생성겸 기본생성자 호출
		p1.showInfo();
		
		Person p2=new Person("추신수");//Person(String )형태의 생성자 호출
		p2.showInfo();
		
		Person p3=new Person("류현진", 191);//Person(String, in) 생성자 호출
		p3.showInfo();
		
		Person p4=new Person("이정후", 185, 88);
		p4.showInfo();
	}

}
