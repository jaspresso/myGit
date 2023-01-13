package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class DataClient {
	public static void main(String[] args) throws Exception {
		//new Socket("ip주소", 서버쪽에서 설정한 port번호);
		Socket s=new Socket("localhost", 8000);
		BufferedReader input=new BufferedReader(new InputStreamReader(s.getInputStream()));
		//서버에서 보낸 메시지를 받음
		String res=input.readLine();
		System.out.println(res);
		s.close();//소켓 닫기
		System.exit(0);//프로그램 종료
	}
}
