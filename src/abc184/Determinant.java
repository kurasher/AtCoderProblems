package abc184;

import java.util.Scanner;

public class Determinant {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a, b, c, d;

		String line = sc.nextLine();
		String[] lines = line.split(" ");
		a = Integer.parseInt(lines[0]);
		b = Integer.parseInt(lines[1]);

		line = sc.nextLine();
		lines = line.split(" ");
		c = Integer.parseInt(lines[0]);
		d = Integer.parseInt(lines[1]);

		System.out.println(a*d - b*c);

	}

}
