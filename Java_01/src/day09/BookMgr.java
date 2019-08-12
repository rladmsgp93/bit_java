package day09;

public class BookMgr {
	private Book[] bookList;
	int count = 0;
	int sum = 0;

	public BookMgr() {
		this(10);// bookList = new Book[10];
	}

	public BookMgr(int size) {
		bookList = new Book[size];
	}
//	public Book[] getBookList() {
//		return bookList;
//	}

	public void setBookList(Book[] bookList) {
		this.bookList = bookList;
	}

	public void addBook(Book book) {
		if (count == bookList.length) {
			Book[] copy = new Book[bookList.length * 2];
			System.arraycopy(bookList, 0, copy, 0, bookList.length);
			bookList = copy;
		}
		bookList[count] = book;
		count++;
	}

	public void searchBook(String str) {
		for (int i = 0; i < count; i++) {
			if (bookList[i].getTitle().substring(0,2).equals(str.substring(0, 2))) {
				System.out.println(bookList[i].getTitle());
			}
			else {
				System.out.println("찾으시는 목록이 없습니다.");
			}
		}
	}

	public void deleteBook(String a) {
		for (int i = 0; i < count; i++) {
			if (bookList[i].getTitle().equals(a)) {
				bookList[i] = null;
				for (int j = i + 1; j < count; j++) {
					bookList[j - 1] = bookList[j];
				}
				count--;
				break;
			}
		}
		//강사님 코드
		//System.Arraycopy(c,i+1,c,,i,3)
	}

	public void bookListPrint() {
		System.out.println("========bookList============");
		for (int i = 0; i < count; i++) {
			bookList[i].print();
		}
		System.out.println("총 " + count + "권 ");
	}

	public void booktotalPrice() {
		for (int i = 0; i < count; i++) {
			sum += bookList[i].getPrice();
		}
		System.out.println(sum);

	}

}
