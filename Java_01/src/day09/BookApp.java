package day09;

import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		BookMgr mgr = new BookMgr(10);
		while (true) {
			System.out.println("******* 명령 선택 *******");
			System.out.println("1. insert(등록)");
			System.out.println("2. delete(삭제)");
			System.out.println("3. 목록 출력");
			System.out.println("4. 검색");
			System.out.println("q. quit(종료)");
			System.out.println("****************************");
			System.out.println("수행할 명령을 선택하세요!");
			System.out.print("1 2 3 4 중 하나를 선택하세요.. _");
			Scanner sc = new Scanner(System.in);
			String choose = sc.nextLine();
			// choose=sc.nextLine().trim();
			switch (choose.trim()) {
			case "1":
				System.out.println("등록 작업을 수행중");
				System.out.println("book의 title을 입력하세요");
				String title = sc.nextLine();
				System.out.println("book의 price를 입력하세요");
				int price = sc.nextInt();
				sc.nextLine();
				mgr.addBook(new Book(title, price));
				break;
			case "2":
				System.out.println("삭제할 책 이름을 입력하세요:");
				String str = sc.nextLine();
				mgr.deleteBook(str);
				break;
			case "3":
				System.out.println("목록 출력 작업을 수행중");
				mgr.bookListPrint();
				break;
			case "4":
				System.out.println("검색어를 입력하세요:");
				String str_ = sc.nextLine();
				System.out.println("=====검색 목록입니다.=====");
				mgr.searchBook(str_.trim());
				break;
			case "q":
				System.out.println("종료합니다.");
				sc.close();
				sc=null;
				System.exit(0);

			default:
				System.out.println("원하시는 명령이 없습니다.");
				break;
			}

		}
	}

}
