package ch10;

public class StaticVar2 {
	static int total;//3
	String model;//소나타(100번지), 모닝(200번지), 아반떼(300번지)
	public StaticVar2(String model) {//생성자
		this.model=model;
		total++;//3
	}
}
