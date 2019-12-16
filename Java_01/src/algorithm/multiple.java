package algorithm;

public class multiple {

	public static void main(String[] args) {
		int n=3;
		int a=0;
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<=i;j++) {
				a+=i;
			}
		}
		System.out.println(a);

	}

}
