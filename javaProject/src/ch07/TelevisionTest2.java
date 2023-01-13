package ch07;

public class TelevisionTest2 {
	public static void main(String[] args) {
		Television myTv = new Television();//객체생성=>메모리에 로딩
		System.out.println(myTv);//메모리의 주소값(해쉬코드)
		myTv.channel = 7;
		myTv.volume = 10;
		myTv.onOff = true;
		System.out.println("나의 텔레비전의 채널은 " + myTv.channel + "이고 볼륨은 " 
		+ myTv.volume + "입니다.");
		
		Television yourTv = new Television();//객체생성
		System.out.println(yourTv);
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		System.out.println("너의 텔레비전의 채널은 " + yourTv.channel + "이고 볼륨은 " 
				+ yourTv.volume + "입니다.");
		
	}

}
