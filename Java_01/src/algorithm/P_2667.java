package algorithm;

import java.util.Scanner;

public class P_2667 {//단지 번호 붙이기
	public static final int[] dx = { 0, 0, 1, -1 };
	public static final int[] dy = { 1, -1, 0, 0 };
	static int cnt = 0;

	public static void main(String[] args) {
		int x, y;
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] group = new int[n][n];
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] == 1 && group[i][j] == 0)
					dfs(a, group, i, j, n, ++cnt);
			}
		}
		int[] ans = new int[cnt];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (group[i][j] != 0) {
					ans[group[i][j] - 1] += 1;
				}
			}
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}

	public static void dfs(int[][] a, int[][] group, int x, int y, int n, int cnt) {
		if (a[x][y] == 1 && group[x][y] == 0) {
			group[x][y] = cnt;
			for (int i = 0; i < 4; i++) {

				int nx = x + dx[i];
				int ny = y + dy[i];
				if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
					if (a[nx][ny] == 1 && group[nx][ny] == 0) {
						dfs(a, group, nx, ny, n, cnt);
					}
				}

			}
		}
	}
}
