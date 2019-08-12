package day24;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import day24.Book;

public class BookMgr {
//Book[] 관리
	List<Book> list = new ArrayList<Book>();
	String fileName;

	BookMgr() {
		this("book.dat");
	}

	BookMgr(String fileName) {
		this.fileName = fileName;
		list = (List<Book>) MyFile.load(fileName);
		if (list == null) {
			list = new ArrayList<Book>();
		}

	}

	public void add(Book data) {
		list.add(data);
	}

	public List<Book> selectBookList(String bookname) {
		Iterator<Book> it = list.iterator();
		List<Book> slist = new ArrayList<Book>();
		while (it.hasNext()) {
			Book b = it.next();
			String data = b.getTitle();
			if (data.toUpperCase().contains(bookname.toUpperCase())) {
				System.out.println(b);
			}

		}

		return slist;
	}

	public boolean deleteBookList(String bookname) {

		Iterator<Book> it = list.iterator();
		while (it.hasNext()) {
			Book b = it.next();

			if (b.getTitle().equals(bookname)) {
				it.remove();
				System.out.println(bookname + "삭제되었습니다.");
				return true;
			}
		}
		return false;

	}

	public List<Book> getBookList() {
		return list;
	}

	public void save() {
		MyFile.save(fileName, list);
	}

	public List<Book> load(String fileName) {

		return list = (List<Book>) MyFile.load(fileName);
	}
}
