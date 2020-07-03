package abc126;

import java.util.Scanner;

public class DiceAndCoin {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lines = line.split(" ");
		int N = Integer.parseInt(lines[0]);
		int K = Integer.parseInt(lines[1]);

		//N = 3 K = 10
		//N = 0 or 10 <= K 終了
		//N=1 10<=K →　表*4 (1/N)*(1/2)^4
		//N=2 10<=K →　表*3 (1/N)*(1/2)^3
		//N=3 10<=K →　表*2 (1/N)*(1/2)^2

		//N = 5 K = 20
		//N = 0 or 20 <= K 終了
		//N = 1 K <= point 表*5　
		//N = 2 K <= point 表*4
		//N = 3 K <= point 表*3
		//N = 4 K <= point 表*3
		//N = 5 K <= point 表*2

		double ans = 0;
		for(int i = 1; i < N+1; i++) {
			int count = 1;
			while(K > i*count) {
				count *= 2;
			}
			ans += 1/(double)count;
		}
		//test
		System.out.println(ans / N);
	}

}
