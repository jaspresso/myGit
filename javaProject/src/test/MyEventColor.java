package test;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Locale;

import javax.swing.JFrame;

public class MyEventColor implements ActionListener {
    private Color c;
    private Frame f;
    private Container con;

    MyEventColor(JFrame f, Color c){
        this.f = f;
        this.c = c;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        f.setBackground(c);
    }
}

class Event extends JFrame{
    Button[] btn = new Button[4];
    String[] str = {"north","east","south","west"};

    public Event(){
        setTitle("MyEventColor 과제");
        setSize(300,200);

        for (int i = 0 ; i<btn.length ; i++){
            btn[i] = new Button(str[i]);
            add(btn[i],str[i].replace(str[i].substring(0,1),str[i].substring(0,1).toUpperCase(Locale.ROOT)));
        }
        setVisible(true);
        btn[0].addActionListener(new MyEventColor(this, Color.red));
        btn[1].addActionListener(new MyEventColor(this, Color.green));
        btn[2].addActionListener(new MyEventColor(this, Color.blue));
        btn[3].addActionListener(new MyEventColor(this, Color.yellow));

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new Event();
    }
}