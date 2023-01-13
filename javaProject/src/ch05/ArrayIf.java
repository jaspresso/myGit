package ch05;

public class ArrayIf {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60,70,80,90,100};
		if(arr != null) {//arr이 주소번지가 null이아닌 조건
			for(int i=0; i<10; i++) {
				System.out.print(arr[i]+",");
			}
		}
	}

}
