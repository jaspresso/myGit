package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPEchoClient {
	private String str;
	private BufferedReader file;
	private static final int SERVERPORT=3000;//서버측 포트번호 셋팅
	public UDPEchoClient(String ip, int port) {
		try {
			InetAddress ia = InetAddress.getByName(ip);
			DatagramSocket ds = new DatagramSocket(port);
			System.out.print("서버측에서 보내는 message : ");
			file = new BufferedReader(new InputStreamReader(System.in));
			str = file.readLine();
			byte buffer[] = str.getBytes();//스트링을 바이트배열로 변환(UDP통신에서는 바이트배열로 송수신)
			DatagramPacket dp=new DatagramPacket(buffer, buffer.length, ia, SERVERPORT);
			ds.send(dp);
			buffer = new byte[512];//서버에서 보낸 메시지를 저장하기 위한 바이트배열 처리
			dp = new DatagramPacket(buffer, buffer.length);
			ds.receive(dp);//서버에서 보낸 메시지를 수신
			ds.close();//소켓 연결 닫기
			System.out.println("server ip : "+dp.getAddress() 
			+ " , server port : "+dp.getPort());
			System.out.println("서버에서 보낸 메시지 : " + new String(dp.getData()).trim());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new UDPEchoClient("localhost", 2000);//(클라이언트 ip, 클라이언트 포트번호)
		//UDP는 클라이언트 포트번호와 서버측 포트번호가 달라야한다.
	}
}
