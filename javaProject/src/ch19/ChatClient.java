package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
	public static void main(String[] args) throws Exception {
		Socket socket=null;
		PrintWriter writer=null;
		BufferedReader reader=null;
		try {
			socket=new Socket("127.0.0.1", 5555);
			writer=new PrintWriter(socket.getOutputStream(), true);
			reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		String receive="";
		String send;
		Scanner sc=new Scanner(System.in);
		while (true) {
			receive=reader.readLine();//메시지 읽음
			System.out.println("[server] " + receive);
			if(receive.equals("quit")) break;
			System.out.println("클라이언트님 입력하세요(종료:quit):");
			send=sc.nextLine();//키보드 입력
			if(send.equals("quit")) {
				System.out.println("종료되었습니다.");
				break;
			}
			if(send != null) {
				writer.println(send);//메시지 보내기
			}
		}
		//리소스 정리
		sc.close();
		writer.close();
		reader.close();
		socket.close();
	}
}
