package ch04;
//continue(계속문)
public class ContinueEx1 {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			//5의 배수를 만나면 출력안함
			if(i%5 ==0) continue; //이하 코드 무시, 다음단계로..
			System.out.println(i);
		}
	}

}
