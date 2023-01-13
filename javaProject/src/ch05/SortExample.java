package ch05;

import java.util.Arrays;
import java.util.Collections;

public class SortExample {
	public static void main(String[] args) {
		int num[] = {29,1,81,70,13,92,36};
		Arrays.sort(num);//오름차순 정렬 함수
		for(int i : num) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("=====================");
		//내림차순 정렬은 Integer라는 Wrapper Class타입으로 데이터 처리가 되어야하고
		//Collections.reverseOrder()라는 메소드를 써서 처리해야한다.
		Integer rev[] = {29,1,81,70,13,92,36};
		Arrays.sort(rev, Collections.reverseOrder());
		for(int i : rev) {
			System.out.print(i + " ");
		}
	}
}
