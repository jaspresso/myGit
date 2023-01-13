package ch18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx2 {
	public static void main(String[] args) {
		//new BufferedReader(new Reader객체(System.in));
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자열 한줄을 입력하세요 : ");
		
		try {
			String str=reader.readLine();
			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
}
