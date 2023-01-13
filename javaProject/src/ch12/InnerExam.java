package ch12;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class InnerExam extends Frame {
	public InnerExam() {
		super("내부 클래스 테스트");
		setSize(300,400);//프레임크기인 가로,세로 초기사이즈 설정
		setVisible(true);
	}
	public static void main(String[] args) {
		InnerExam e=new InnerExam();
		//이벤트 처리 : 사용자의 요청(request)에 시스템이 응답(response)
		//이벤트 3대 요소
		//1) 이벤트 소스 : 이벤트의 대상
		//2) 이벤트 리스너 : 이벤트 관찰자, 감시자
		//3) 이벤트 핸들러 : 이벤트 처리기
		
//		e.addWindowListener(new WindowListener() {//무명클래스
//			@Override
//			public void windowOpened(WindowEvent e) {
//			}
//			@Override
//			public void windowIconified(WindowEvent e) {
//			}
//			@Override
//			public void windowDeiconified(WindowEvent e) {
//			}
//			@Override
//			public void windowDeactivated(WindowEvent e) {
//			}
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.exit(0);//프로그램종료 코드
//			}
//			@Override
//			public void windowClosed(WindowEvent e) {
//			}
//			@Override
//			public void windowActivated(WindowEvent e) {
//			}
//		});
		
		e.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
