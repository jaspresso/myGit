package ch07;

public class Television {
	//멤버변수(전역변수)
	int channel; //channel=0이 자동으로 초기화되어 있음. ,channel=11
	int volume;//volume = 9 
	boolean onOff; //전원상태 boolean은 기본적으로 false로 초기화됨. onOff=false; onOff = true
	
	//멤버메소드
	void print() {
		System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
	}
	int getChannel() {
		return channel;//11
	}
	void setChannel(int ch) {//ch=11
		channel = ch;
	}
}
