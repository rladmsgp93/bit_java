package day19;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test06_Command_Map {

	public static void main(String[] args) {
		Map<String, Command> map = new HashMap<String, Command>();
		map.put("delete", new DeleteCommand());
		map.put("update", new UpdateCommand());
		map.put("select", new SelectCommand());
		map.put("insert", new InsertCommand());
		map.put("new", new Command() {

			@Override
			public void exec() {
				System.out.println("기능 추가");

			}

		});
		Scanner sc = new Scanner(System.in);
		System.out.println("delete,insert,select,update 중 입력하세용");
		String cmd = sc.nextLine();// delete update select insert
		Command command = map.get(cmd);
		if (command != null)
			command.exec();

	}

}
