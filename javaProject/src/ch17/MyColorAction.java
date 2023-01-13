package ch17;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
//ActionEvent : 버튼 클릭, 메뉴 아이템 클릭
//ActionListener : ActionEvent를 호출하는 인터페이스
public class MyColorAction implements ActionListener {
	private JFrame f;
	private Color c;
	//Component : 화면구성요소(프레임,버튼,패널...)
	//Container : 다른 컴포넌트를 담을 수 있는 요소	
 //contentPane: 스윙에서는 contentPane에 컴포넌트들을 부착할 수 있는데, contentPane은 JFrame 객체가 처음 생길때 자동으로 생성되며, getContentPane()메소드를 사용해 얻을 수 있다.
	private Container con; 
	public MyColorAction(JFrame f, Color c) {
		this.f = f;
		con = f.getContentPane();//프레임의 컨텐츠 영역으로 활용
		this.c = c;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		con.setBackground(c); //배경색상 변경
	}
}
