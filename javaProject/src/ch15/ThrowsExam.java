package ch15;

public class ThrowsExam {
	//예외처리방법
	//1)try ~ catch 직접 처리
	//2)throws 예외처리 클래스에 처리 위임
	
	//try~catch절 대신 throws 뒤에 지정한 예외처리클래스에 처리를 위임
	public static void main(String[] args) throws InterruptedException {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			Thread.sleep(1000);//Interrupt(cpu 간섭)
		}
	}

}
