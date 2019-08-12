package day15;

import javax.swing.JOptionPane;

public class Test05 {

	public static void main(String[] args) {
		String msg = JOptionPane.showInputDialog("1.LIST 2. UPDATE 3.DELETE 4.INSERT");
		Command list = new Command() {

			@Override
			public void exec() {
				System.out.println("*** list ***");

			}

		};

		Command update = new Command() {

			@Override
			public void exec() {
				System.out.println("*** update ***");

			}

		};

		Command delete = new Command() {

			@Override
			public void exec() {
				System.out.println("*** delete ***");

			}

		};

		Command insert = new Command() {

			@Override
			public void exec() {
				System.out.println("*** insert ***");

			}

		};

		switch (msg) {
		case "1":
			list.exec();
			break;
		case "2":
			update.exec();
			break;
		case "3":
			delete.exec();
			break;
		case "4":
			insert.exec();
			break;
		case "q":
			System.exit(0);
		default:
			break;

		}

	}

}
