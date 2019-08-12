package day23;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Date;

public class Test04 {

	public static void main(String[] args) {
		String fileName = "data.obj";
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(fileName);
			ois = new ObjectInputStream(fis);
	
			Date date = new Date();
			System.out.println("data object read");
			String name = (String)ois.readObject();
			
			date= (Date)ois.readObject();
		
			System.out.println("read "+name);
			System.out.println("read "+date);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (ois != null)
					ois.close();
				if (fis != null)
					fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		System.out.println("main end");
	}

}
