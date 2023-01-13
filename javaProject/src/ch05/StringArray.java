package ch05;

public class StringArray {
	public static void main(String[] args) {
		String[] str= {"Java","DB","JSP","HTML"};
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		
		System.out.println();
		//확장for문(for~each문,향상된 for문) ==> jdk1.5부터 사용가능
		//for(개별값 저장 변수 : 집합변수) { }
		for(String ss : str) {
			System.out.println(ss);
		}
		
	}

}
