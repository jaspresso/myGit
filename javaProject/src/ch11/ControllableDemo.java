package ch11;

public class ControllableDemo {
	public static void main(String[] args) {
		TV tv=new TV();
		tv.turnOn();
		tv.turnOff();
		tv.remoteOn();
		tv.remoteOf();
		tv.repair();
		
		Controllable.reset();//static 메소드는 클래스이름.메소드로 접근가능하다.
		
		Computer com=new Computer();
		com.turnOn();
		com.turnOff();
		com.repair();
		Controllable.reset();
		
	}

}
