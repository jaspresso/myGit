package ch16;

public class YieldExam implements Runnable {
	public static void main(String[] args) {
		Thread t = new Thread(new YieldExam());
		t.start();
		for(int i=0; i<5; i++) {
			if(i==3) {
				Thread.yield();//실행대기상태로 전환되면서 다른 스레드에게 실행을 양보
			}
			System.out.println("main 스레드");
		}
	}

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("run()에서 실행되는 스레드");
		}
	}
}
