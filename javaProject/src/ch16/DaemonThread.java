package ch16;

public class DaemonThread implements Runnable {
	public static void main(String[] args) {
		System.out.println("메인 스레드가 시작됩니다.");
		Thread th=new Thread(new DaemonThread());
		th.setDaemon(true);//데몬스레드 설정
		th.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("메인 스레드가 종료됩니다.");
	}

	@Override
	public void run() {
		while (true) {//while(true)지만 main 스레드가 종료되면 자동종료됨
			try {
				System.out.println("데몬 스레드가 무한반복문 안에서 실행중입니다.");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				//break; //Exeption발생시 while문 빠져나가도록
			}
		}//while
	}//run
}
