package ch17;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridEx2 extends JFrame {
	public GridEx2() {
		super("GridLayout 예제2");
		setLayout(new GridLayout(3,3));
		for(int i=1; i<=9; i++) {
			JButton button = new JButton("button"+i);
			add(button);
		}
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new GridEx2();
	}

}
