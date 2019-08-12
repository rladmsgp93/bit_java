package day09;

public class Test02_String {

	public static void main(String[] args) {
		String msg = "java programming/23000";
		String d1 = msg.substring(0,msg.indexOf("/"));
		String d2 = msg.substring(msg.indexOf("/")+1);
		System.out.println(d1);
		System.out.println(d2);   
		
		String url = "http://127.0.0.1:8000/web1/list.do";
		url.substring(url.lastIndexOf('/'));
		System.out.println(url.contains("web1"));
		String data = "2019001/홍길동/99/98/97";
		
		

	}

}
