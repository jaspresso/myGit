package ch19;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class UrlEncodeExam {
	public static void main(String[] args) {
		try {
			String str="김철수";
			//URLEncoder.encode(인코딩할 문자열, 인코딩형식) ==> 암호화
			System.out.println(URLEncoder.encode(str, "utf-8"));
			
			//URLDecoder.decode("문자열", 인코딩형식) ==> 복호화
			System.out.println(URLDecoder.decode("%EA%B9%80%EC%B2%A0%EC%88%98", "utf-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
