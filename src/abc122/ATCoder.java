package abc122;

import java.util.Scanner;

public class ATCoder {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lines = line.split("");

		int max = 0;
		int count = 0;

		for(int i = 0; i < lines.length; i++) {
			if(lines[i].equals("A") || lines[i].equals("T") || lines[i].equals("C") || lines[i].equals("G")) {
				count++;
				if(i == lines.length - 1 && max < count) {//if AAAA or ATCG etc
					max = count;
				}
			}else {
				if(max < count) {
					max = count;
				}
				count = 0;
			}
		}

		System.out.println(max);
	}

}
