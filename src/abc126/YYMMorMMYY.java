package abc126;

import java.util.Scanner;

public class YYMMorMMYY {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int yy = S / 100;
		int mm = S % 100;

		/*
		 * YYMM フォーマットであるためには、後半の 2 桁の整数が
		 * 1 以上 12 以下である必要があります。
		 *
		 * MMYY フォーマットであるためには、前半の 2 桁の整数が
		 *  1 以上 12 以下である必要があります。
		 */
		if(1 <= yy && yy <= 12) {
			if(1 <= mm && mm <= 12) {
				System.out.println("AMBIGUOUS");
			}else {
				System.out.println("MMYY");
			}
		}else {
			if(1 <= mm && mm <= 12) {
				System.out.println("YYMM");
			}else {
				System.out.println("NA");
			}
		}

	}

}
