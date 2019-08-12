package day21;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test03 {

	public static void main(String[] args) {

		new UI_3();
	}

}

class UI_3 extends Frame implements ActionListener {
	// Frame f1;
	Button red, blue, exit;
	Panel p1;

	public UI_3() {
		// f1 = new Frame("awt UI Test");
		super("awt UI Test");
		p1 = new Panel();
		p1.add(red = new Button("RED"));

		p1.add(blue = new Button("BLUE"));
		p1.add(exit = new Button("종료"));
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
		addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				setVisible(false);
				dispose();
				System.exit(0);

			}
		});

	}

	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {

		case "RED":
			p1.setBackground(Color.RED);
			break;
		case "BLUE":
			p1.setBackground(Color.BLUE);
			break;
		case "종료":
			System.exit(0);
			break;
		default:
			break;
		}
	}

}
