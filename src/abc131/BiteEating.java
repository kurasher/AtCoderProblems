package abc131;

import java.util.Scanner;

public class BiteEating {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int L = Integer.parseInt(sc.next());

		int sumN = 0;
		int sumN_1 = 0;
		boolean flag = false;
		int min = 100000;
//		(N + L -1) < 0ならすべて負の値
//		L > 0 ならすべて正の値
		if((N+L-1) < 0) {
//			-5, -4, -3 , -2
//			数列的に考えたい → O(1)のはず
		}
		for(int i = 1; i < N+1; i++) {

			sumN = sumN + (L + i - 1);
			if(min > Math.abs(L+i-1)) {
				min = Math.abs(L+i-1);
			}
		}
//		0がはいるときは、0を省く
//		すべて正の値 > 最小値をsumNから引く
//		すべて負の値 > 最大値をsumNから引く
	}

}
