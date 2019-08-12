package day24;

public class BookTest {

	public static void main(String[] args) {
		BookMgr bookMgr = new BookMgr();

		bookMgr.add(new Book("java", 900));
		bookMgr.add(new Book("jsp", 2900));
		bookMgr.add(new Book("dbp", 200));
		//bookMgr.getBookList().forEach(i -> System.out.print(i));
		//bookMgr.save();
		bookMgr.load(bookMgr.fileName);

	}

}
