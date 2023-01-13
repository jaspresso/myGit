package ch16;

public class ExternalThread {
	public static void main(String[] args) {
		MyThread t1=new MyThread("스레드1");
		MyThread t2=new MyThread("스레드2");
		MyThread t3=new MyThread("스레드3");
		t1.start();//run()메소드 호출
		t2.start();//위와 동시호출
		t3.start();//위와 동시호출
		System.out.println("메인스레드");//다른 스레드가 run하는 시점에 메인스레드의 내용도 있으면
		//메인스레드부터 시작되는 현상이 있다.
	}

}
