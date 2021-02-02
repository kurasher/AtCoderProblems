package abc187;

import java.util.Scanner;

public class GentlePairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];

        for(int i = 0; i < N; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int count = 0;
        for(int i = 0; i < N-1; i++){
            for(int j = i+1; j < N; j++){
                int mathMol = y[j] - y[i];
                int mathDeno = x[j] - x[i];
                /*
                       mathMol
                -1 <=  -------  <= 1
                       mathDeno
                 */

                if(mathDeno < 0){
                    mathDeno = -1*mathDeno;
                    if(mathMol < 0){
                        mathMol = -1*mathMol;
                    }else{

                    }
                }else{
                    if(mathMol < 0){
                        mathMol = -1*mathMol;
                    }
                }

                if(-mathDeno <= mathMol && mathMol <= mathDeno){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
