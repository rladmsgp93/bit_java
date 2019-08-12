package day21;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test04 {

	public static void main(String[] args) {

		new UI_4();
	}

}

class UI_4 extends JFrame implements ActionListener {
	// Frame f1;
	JButton red, blue, exit;
	Panel p1;

	public UI_4() {
		// f1 = new Frame("awt UI Test");
		super("awt UI Test");
		p1 = new Panel();
		p1.add(red = new JButton("RED"));

		p1.add(blue = new JButton("BLUE"));
		p1.add(exit = new JButton("종료"));
		add(p1, BorderLayout.SOUTH);
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
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
