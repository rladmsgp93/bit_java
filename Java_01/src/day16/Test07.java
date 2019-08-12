package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		Scanner sc=null;
		try {
			sc = new Scanner(new File("c://lib//sample.txt"));
			while(sc.hasNextLine()) {
				String[] data = sc.nextLine().replace('_','/').split("/");
				System.out.println(Arrays.toString(data));
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}finally {
			
				if (sc != null) {
					sc.close();
					sc=null;
					System.out.println("자원 반남 ok");
				}
			
		}

	}

}
