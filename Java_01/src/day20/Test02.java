package day20;

import java.util.Iterator;
import java.util.Properties;

public class Test02 {

	public static void main(String[] args) {
		Properties p = new Properties();
		p.setProperty("java01", "1234");
		p.setProperty("java03", "1224");
		p.setProperty("java02", "1444");
		p.setProperty("java04", "1554");
		p.setProperty("java05", "1664");
		System.out.println(p.getProperty("java01"));

		Iterator it = p.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(key + " : " + p.getProperty(key));
		}

	}

}
