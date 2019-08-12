package day19;

import java.util.Scanner;

public class Test05_Command {

	public static void main(String[] args) {
		Command delete = new DeleteCommand();
		Command update = new UpdateCommand();
		Command select = new SelectCommand();
		Command insert = new InsertCommand();
		Scanner sc = new Scanner(System.in);
		System.out.println("d,i,s,u 중 입력하세용");
		String cmd = sc.nextLine();// delete update select insert

		switch (cmd) {
		case "insert":
			insert.exec();
			break;
		case "update":
			update.exec();
			break;
		case "select":
			select.exec();
			break;
		case "delete":
			delete.exec();
			break;
		default:
			System.out.println("잘못입력했습니다.");
			break;
		}
	}

}
