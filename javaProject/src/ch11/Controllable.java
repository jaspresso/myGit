package ch11;

public interface Controllable {
	default void repair() {//인터페이스에서 명시적 default 메소드로의 구현은 jdk8부터 가능
		System.out.println("장비를 수리한다.");
	}
	static void reset() {//인터페이스에서 static 메소드로의 구현도 jdk8부터 가능
		System.out.println("장비를 초기화한다.");
	}
	//참고 : private 메소드로의 구현은 jdk9부터 가능
	//실무에서는 아직 인터페이스에서 위와같은 구현메소드를 사용안함.
	
	void turnOn();
	void turnOff();

}
