package itp1;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lines = line.split(" ");

		int a = Integer.parseInt(lines[0]);
		int b = Integer.parseInt(lines[1]);

		System.out.println(a*b + " " + (a+b)*2);
	}

}
