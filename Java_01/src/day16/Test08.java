package day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		
	
		try (FileInputStream fis = new FileInputStream("c://lib//sample.txt");) {
			System.out.println("file 처리~~");

		} catch (Exception e) {
//closeable 기능 자동으로 쓰이나? 알아보기
			e.printStackTrace();
		} finally {

		}
		System.out.println("--------------------------------------------------");
		try (Scanner sc = new Scanner(new File("c://lib//sample.txt"));){
			while(sc.hasNextLine()) {
				String[] data = sc.nextLine().replace('_','/').split("/");
				System.out.println(Arrays.toString(data));
				
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
