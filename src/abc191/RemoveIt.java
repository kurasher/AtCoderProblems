package abc191;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long X = sc.nextLong();
        List<Long> A = new ArrayList<Long>();

        for(int i = 0; i < N; i++){
            long mod = sc.nextLong();
            if(X == mod){
            }
            else{
                A.add(mod);
            }
        }

        for (long ans : A){
            System.out.print(ans + " ");
        }
    }
}
