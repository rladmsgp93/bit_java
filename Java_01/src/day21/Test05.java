package day21;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test05 {

	public static void main(String[] args) {

		new UI_5();
	}

}

class UI_5 extends JFrame implements ActionListener {
	// Frame f1;
	JButton red, blue, exit;
	Panel p1, p2;
	TextField msg;
	TextArea output;

	public UI_5() {
		// f1 = new Frame("awt UI Test");
		super("awt UI Test");
		p1 = new Panel();
		p2 = new Panel();
		p2.setLayout(new GridLayout(1, 2));
		p2.add(new JLabel("메시지창"));
		p2.add(msg = new TextField(20));
		add(p2, BorderLayout.NORTH);
		p1.add(red = new JButton("RED"));

		p1.add(blue = new JButton("BLUE"));
		p1.add(exit = new JButton("종료"));
		add(p1, BorderLayout.SOUTH);
		add(output = new TextArea(15, 40));
		output.setFont(new Font(null, 1, 20));
		setSize(300, 300);
		setVisible(true);

		red.addActionListener(this);
		blue.addActionListener(this);
		exit.addActionListener(this);

//		red.setBackground(Color.RED);
//		blue.setBackground(Color.BLUE);
//		exit.setBackground(Color.GREEN);
		red.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				p1.setBackground(Color.RED);

			}
		});
		blue.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				p1.setBackground(Color.BLUE);

			}
		});
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// p1.setBackground(Color.GREEN);
				System.exit(0);

			}
		});
		// f1.addWindowListener(new WindowEventP());
//		addWindowListener(new WindowAdapter() {
//
//			public void windowClosing(WindowEvent e) {
//				setVisible(false);
//				dispose();
//				System.exit(0);
//
//			}
//		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		msg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.append(msg.getText() + "\n");
				msg.setText("");
			}
		});

	}

	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {

		case "red":
			p1.setBackground(Color.RED);
			break;
		case "blue":
			p1.setBackground(Color.BLUE);
			break;
		case "exit":
			System.exit(0);
			break;
		default:
			break;
		}
	}

}
