package ch17;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DialogEx extends JFrame {
	public DialogEx() {
		super("피자 메뉴");
		setSize(500, 85);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		panel.setBackground(Color.GRAY);
		panel1.setBackground(Color.LIGHT_GRAY);
		panel2.setBackground(Color.ORANGE);
		
		JLabel label = new JLabel("피자 종류를 선택하세요.");
		panel1.add(label);
		
		JButton button1 = new JButton("치즈");
		JButton button2 = new JButton("불고기");
		JButton button3 = new JButton("포테이토");
		JButton button4 = new JButton("종료");
		
		//panel2에 버튼추가
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		
		//panel에 다른패널 추가
		panel.add(panel1);
		panel.add(panel2);
		
		add(panel, "North");
		setVisible(true);
		
		ActionListener handler=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("치즈")) {
					JOptionPane.showMessageDialog(null, 
							"치즈피자를 선택하셨습니다. \n가격:23,000원", "치즈피자", 
							JOptionPane.INFORMATION_MESSAGE);
				}else if(e.getActionCommand().equals("불고기")) {
					JOptionPane.showMessageDialog(null, 
							"불고기피자를 선택하셨습니다. \n가격:25,000원", "불고기피자", 
							JOptionPane.WARNING_MESSAGE);
				}else if(e.getActionCommand().equals("포테이토")) {
					JOptionPane.showMessageDialog(null, 
							"포테이토피자를 선택하셨습니다. \n가격:20,000원", "포테이토피자", 
							JOptionPane.DEFAULT_OPTION);
				}else if(e.getActionCommand().equals("종료")) {
					JOptionPane.showMessageDialog(null, 
							"프로그램을 정말 종료하시겠습니까?", "종료", 
							JOptionPane.OK_CANCEL_OPTION);
					System.exit(0);
				}
			}
		};
		
		//버튼에 리스너 부착
		button1.addActionListener(handler);
		button2.addActionListener(handler);
		button3.addActionListener(handler);
		button4.addActionListener(handler);
	}
	
	public static void main(String[] args) {
		new DialogEx();
	}

}
