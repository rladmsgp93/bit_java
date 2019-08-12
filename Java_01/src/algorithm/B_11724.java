package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B_11724 {
	static boolean[] c;
	static int count = 0;
	static int ans = 0;
	static List<Integer>[] a;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		a = (ArrayList<Integer>[]) new ArrayList[n + 1];
		for (int i = 1; i <= n; i++) {
			a[i] = new ArrayList<Integer>();
		}
		c= new boolean[n+1];
		for (int i = 0; i < m; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			a[u].add(v);
			a[v].add(u);

		}
		for (int i = 1; i <= n; i++) {
			if (c[i] == false) {
				dfs(i);
				ans++;
			}
		}
		System.out.println(ans);

	}

	public static void dfs(int x) {
		if (c[x])
			return;
		c[x] = true;
		for (int y : a[x]) {

			if (c[y] == false) {
				dfs(y);
			}

		}
	}
}
