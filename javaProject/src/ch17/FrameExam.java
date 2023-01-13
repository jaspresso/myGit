package ch17;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//awt : java + c 개발 (점차 없어지는 추세) 
//swing : awt를 향상시킨 버전, java로만 개발, 플랫폼에 동일한 UI를 제공

public class FrameExam {
	public static void main(String[] args) {
		Frame f=new Frame("프레임 테스트");//프레임 생성
		f.setSize(200, 300);//프레임 사이즈 설정
		f.setLocation(300, 200);//프레임의 위치 지정
		f.setVisible(true);//프레임을 화면에 표시
		
//		f.addWindowListener(new WindowListener() {//익명함수
//			
//			@Override
//			public void windowOpened(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowIconified(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowDeiconified(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowDeactivated(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowClosing(WindowEvent e) {
//				// 프로그램 종료
//				// 정상종료 : 0, 비정상종료 : -1
//				System.exit(0);
//			}
//			
//			@Override
//			public void windowClosed(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowActivated(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
		
		//위보다 Adapter를 사용하면 코드가 간략해진다.
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}

}
