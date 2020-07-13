package abc133;

import java.util.Scanner;

public class GoodDistance {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lines = line.split(" ");
		int N = Integer.parseInt(lines[0]);
		int D = Integer.parseInt(lines[1]);
		int[][] X = new int[D][N];

		for (int i = 0; i < N; i++) {
			line = sc.nextLine();
			lines = line.split(" ");
			for (int j = 0; j < lines.length; j++) {
				X[j][i] = Integer.parseInt(lines[j]);
			}
		}

		for (int n = 0; n < N; n++) {
			for (int i = 0; i < D - 1; i++) {
				for (int j = i + 1; j < D; j++) {
					Math.abs(X[i][n] - X[j][n]) * Math.abs(X[i][n] - X[j][n]);
				}
			}
		}
	}

}
