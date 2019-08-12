package day15;

import javax.swing.JOptionPane;

public class Test06 {
	public static void main(String[] args) {
		String msg = JOptionPane.showInputDialog("1.LIST 2. UPDATE 3.DELETE 4.INSERT");
		Command list = ()-> 
				System.out.println("*** list ***");
		

		Command update = new Command() {

			@Override
			public void exec() {
				System.out.println("*** update ***");

			}

		};

		Command delete =()-> {//인터페이스에 추상 메서드가 하나만 있어야 람다 가능
				System.out.println("*** delete ***");//람다=>변수에 함수 바인딩

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
