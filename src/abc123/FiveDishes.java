package abc123;

import java.util.Scanner;

public class FiveDishes {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int[] dish = new int[5];
		for(int i = 0; i < 5; i++) {
			dish[i] = sc.nextInt();
		}
		//10の倍数であるdishから注文し、
		//10の倍数から最も差の大きいものは後で注文する
		//ex 1, 20, 34, 30 , 10 → 20, 30, 10, 34, 1みたいな？
	}

}
