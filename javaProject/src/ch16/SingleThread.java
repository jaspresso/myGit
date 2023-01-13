package ch16;

//Single Thread : 작업단위가 1개(main 스레드만 존재)
//순차적으로 처리됨
public class SingleThread {
	void print() {
		//현재 실행중인 스레드(currentThread)의 이름
		System.out.println(Thread.currentThread().getName());
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		//main도 스레드였다.(싱글스레드)
		SingleThread t=new SingleThread();
		t.print();
		t.print();
	}
}
