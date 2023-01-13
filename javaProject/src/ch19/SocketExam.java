package ch19;

import java.net.ServerSocket;

//서버소켓 : 서버에서 서비스를 위한 목적으로 만드는 소켓
//소켓 : 일반클라이언트에서 사용되는 소켓
//포트번호 : 0~65535 내에서 배정이 가능하고 중복되지 않아야 함.
//1port 1service
//well known port number(자주 사용되어지는 포트 번호)
// 80:웹서비스, 21:FTP서비스, 445:파일공유, 3389:원격접속...
public class SocketExam {
	public static void main(String[] args) {
		ServerSocket socket=null;
		for(int i=0; i<=65535; i++) {
			try {
				socket=new ServerSocket(i);//서버소켓생성
				socket.close();//소켓 서비스 종료
			} catch (Exception e) {
				System.out.println(i+"번 포트는 사용중입니다.");
			}
		}
		System.out.println("포트 검사를 마쳤습니다.");
	}
}
