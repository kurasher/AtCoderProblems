package paiza_c;

import java.util.Scanner;

public class WhiteOrBrack {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /*
        3 2
        128 127
        127 128
        128 127

        1 0
        0 1
        1 0

         */

        String line = sc.nextLine();
        String[] lines = line.split(" ");

        int H = Integer.parseInt(lines[0]);
        int W = Integer.parseInt(lines[1]);

        for(int i = 0; i < H; i++){
            line = sc.nextLine();
            lines = line.split(" ");

            for(int j = 0; j < W; j++){
                int pix = Integer.parseInt(lines[j]);
                if(pix <= 127){
                    System.out.print(0);
                }else{
                    System.out.print(1);
                }

                if(j < W-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
