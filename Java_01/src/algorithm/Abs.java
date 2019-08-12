package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Abs {

	public static void main(String[] args) {
		System.out.println("배열 수를 입력하세요:");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int ans =0;
		do {
			int temp=caculation(a);
			//ans = Math.max(ans, temp);
		if(temp>ans) {
				ans=temp;
				for(int i=0;i<a.length;i++) {
					System.out.print(a[i]+" ");
					}
	
		}
		}
		while(next_permutation(a));
		
		System.out.println(ans);
	
		

	}
	
	public static boolean next_permutation(int[] a) {
		int i= a.length-1;
		while(i>0&&a[i-1]>a[i]) {
			i-=1;
			if(i<=0) {
				return false;
			}
		}
		int j= a.length-1;
		while(a[i-1]>a[j]) {
			j-=1;
		}
		int temp =a[i-1];
		a[i-1]=a[j];
		a[j]=temp;
		j= a.length-1;
		while(i<j) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i+=1;
			j-=1;
		}
		return true;
		
	}
	
	public static int caculation(int[] a) {
		int sum=0;
		for(int i=1;i<a.length;i++) {
			sum+=Math.abs(a[i]-a[i-1]);
		}
		return sum;
	}

}
