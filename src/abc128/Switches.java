package abc128;

import java.util.Scanner;

public class Switches {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lines = line.split(" ");
		int N = Integer.parseInt(lines[0]);
		int M = Integer.parseInt(lines[1]);
		int[][] s = new int[M][];
		int[] p = new int[M];

		for (int i = 0; i <= M; i++) {
			line = sc.nextLine();
			lines = line.split(" ");
			if (i == M) {
				for (int j = 0; j < lines.length; j++) {
					p[j] = Integer.parseInt(lines[j]);
				}
			} else {
				s[i] = new int[Integer.parseInt(lines[0])];
				for (int j = 1; j < lines.length; j++) {
					s[i][j - 1] = Integer.parseInt(lines[j]);
				}
			}
		}

//		for(int i = 0 ; i < p.length; i++) {
//			System.out.println(p[i]);
//		}
//		for(int i = 0; i < M; i++) {
//			for(int j = 0; j < s[i].length; j++) {
//				System.out.print(s[i][j] + " ");
//			}
//			System.out.println();
//		}

	}

}
