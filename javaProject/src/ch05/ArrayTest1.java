package ch05;

public class ArrayTest1 {
	public static void main(String[] args) {
		int[] s = new int[10];//10개의 배열크기 지정
		for(int i=0; i<s.length; i++) {
			s[i] = i;//s[0]=0
			System.out.print(s[i] + " ");
		}
	}
}
