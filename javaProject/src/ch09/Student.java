package ch09;

public class Student {
	//멤버 변수
	protected String name; //private 김철수
	protected String num;//학번 2201
	protected String major;//전공 컴공
	protected int year;//학년 1
	//생성자
	public Student() {

	}
	public Student(String name, String num, String major, int year) {
		super();
		this.name = name;
		this.num = num;
		this.major = major;
		this.year = year;
	}
	//상속관계의 클래스들에서는 생성보다는 메소드를 잘 활용한다.
	public void input(String name, String num, String major, int year) {
		this.name = name;
		this.num = num;
		this.major = major;
		this.year = year;
	}
}
