package abc191;

import java.util.*;

public class DigitalGraffiti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        String[][] grid = new String[H][W];
        sc.nextLine();

        for (int i = 0; i < H; i++) {
            grid[i] = sc.nextLine().split("");

        }

        int ans = 0;
        for (int i = 0; i < H - 1; i++) {
            for (int j = 0; j < W - 1; j++) {
                int count = 0;
                if (grid[i][j].equals("#")) {
                    count++;
                }
                if (grid[i][j + 1].equals("#")) {
                    count++;
                }
                if (grid[i+1][j].equals("#")) {
                    count++;
                }
                if (grid[i + 1][j + 1].equals("#")) {
                    count++;
                }
                if (count == 1 || count == 3) {
                    ans++;
                }
            }
        }

        System.out.println(ans);

        sc.close();
    }
}