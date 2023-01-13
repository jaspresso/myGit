package ch16;

public class MusicBox {//공유객체
	//모니터링 락(객체의 사용권)
	public synchronized void playMusicA() {
		for(int i=0; i<10; i++) {
			System.out.println("가요 음악!!!");
			try {
				Thread.sleep((int)(Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void playMusicB() {
		for(int i=0; i<10; i++) {
			System.out.println("팝송 음악!!!");
			try {
				Thread.sleep((int)(Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void playMusicC() {
		for(int i=0; i<10; i++) {
			//메소드의 코드가 길어지면, 마지막에 대기하는 스레드가 너무 오래 기다리는것을 막기 위해서
			//메소드 헤드에 synchronized를 처리 안하고 필요한 부분만 synchronized 블록을 사용할 수 있다.
			synchronized (this) {//(this)는 MusicBox객체 자신을 가리킴
				System.out.println("클래식 음악!!!");
			}
			try {
				Thread.sleep((int)(Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
