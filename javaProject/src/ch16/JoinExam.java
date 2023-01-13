package ch16;

public class JoinExam {
	public static void main(String[] args) {//메인스레드는 우선권이 제일높다.
		MyThread3 thread = new MyThread3();
		thread.start();
		try {
			System.out.println("MyThread3 스레드가 종료될때까지 main스레드는 기다립니다.");
			thread.join();//해당 스레드가 실행종료될때까지 main스레드는 일시정지 상태로 전환됨.
			System.out.println("main스레드가 다시 재개되었습니다.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main스레드가 종료되었습니다.");
	}
}

class MyThread3 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			try {
				System.out.println("MyThread3 스레드가 시작");
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


