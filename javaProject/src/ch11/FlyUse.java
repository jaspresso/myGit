package ch11;

public class FlyUse {
	public static void main(String[] args) {
//		Bird bird=new Bird();
//		bird.takeOff();
//		bird.fly();
//		bird.land();
//		Airplane air=new Airplane();
//		air.takeOff();
//		air.fly();
//		air.land();
		
		//좌:부, 우:자 => 다형성
		Flyer f=new Bird();
		f.takeOff();
		f.fly();
		f.land();
		f=new Airplane();
		f.takeOff();
		f.fly();
		f.land();
	}

}
