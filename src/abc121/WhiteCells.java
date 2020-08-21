package abc121;

import java.util.Scanner;

public class WhiteCells {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int H, W, h, w;
		H = sc.nextInt();
		W = sc.nextInt();
		h = sc.nextInt();
		w = sc.nextInt();

		int ans = H * W;
		while (h > 0) {
			h--;
			ans = ans - H;
			W--;
		}

		while (w > 0) {
			w--;
			ans = ans - W;
		}

		if (ans < 0) {
			System.out.println(0);
		} else {
			System.out.println(ans);
		}
	}

}
