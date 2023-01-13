package ch11;

public class TV implements Controllable, RemoteContrallable {

	@Override
	public void remoteOn() {
		System.out.println("리모콘으로 TV를 켠다.");
	}

	@Override
	public void remoteOf() {
		System.out.println("리모콘으로 TV를 끈다.");

	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켠다");

	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끈다.");

	}

}
