package ch13;

import java.util.Arrays;
import java.util.Collections;

public class SortEx {
	public static void main(String[] args) {
		Integer arr[] = {3,29,46,15,89,-20};
		System.out.println("배열 데이터 : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		System.out.println("오름차순 정렬 : ");
		Arrays.sort(arr);//sort()는 자동 오름차순 정렬을 해주는 메소드
		for(int i : arr) {
			System.out.print(i+"\t");
		}
		System.out.println();
		
		//내림차순 정렬
		System.out.println("내림차순 정렬 : ");
		Arrays.sort(arr, Collections.reverseOrder());
		for(int i : arr) {
			System.out.print(i+"\t");
		}
	}

}
