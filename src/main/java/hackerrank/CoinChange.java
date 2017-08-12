package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt() + 1;
        int m = in.nextInt();
        int coins[] = new int[m];
        for(int coins_i=0; coins_i < m; coins_i++){
            coins[coins_i] = in.nextInt();
        }
        if(coins.length <= 0 || n <=0){
            System.out.println(0);
            return;
        }


        Arrays.sort(coins);
        long[][] d2 = new long[m][n];
        new ArrayList<>().toArray();
        for(int column = 0; column < m ; column++){
            for(int row = 0; row < n ; row++){

                if(row == 0){
                    d2[column][row] = 1;
                }else if(column == 0){
                    boolean fits = row % coins[0] == 0;
                    if(fits)
                        d2[column][row] = 1;
                }else{
                    if(coins[column] > row){
                        d2[column][row] = d2[column-1][row];
                    } else {
                        d2[column][row] = d2[column-1][row] + d2[column][row - coins[column]];
                    }
                }

            }
        }
        System.out.println(d2[d2.length - 1][d2[0].length -1]);
    }
}
