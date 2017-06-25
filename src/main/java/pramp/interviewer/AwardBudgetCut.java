package pramp.interviewer;

import java.util.Arrays;

/**
 * Created by makoto on 22/02/17.
 */
public class AwardBudgetCut {
// dimma

    //public int findGrantsCap2(int[] g, int b) {

    //}

    public int findGrantsCap2(int[] array, int b) {
        if(array==null || array.length ==0){
            return 0;
        }

        int n = array.length;
        int cap = b/n;
        Arrays.sort(array);

        int indexOfCap = 0;// BinarySe(array,cap);

        int newSum=0;
        for(int i=0;i<indexOfCap;i++){
            newSum+=array[i];
        }

        int numElemGreater = n-indexOfCap;
        newSum+= cap * numElemGreater;
        int diff = b - newSum;
        if(diff>0) {
            cap =  diff/numElemGreater;
        }
        return cap;
    }

    public int findGrantsCap(int[] g, int b) {
        Arrays.sort(g);

        int sum = 0;
        int[] partialSums = new int[g.length];
        int r = 0;

        for (int i = 0; i < g.length; i++) {
            sum += g[i];
            partialSums[i] = sum;
        }

        if (partialSums[0] >= b) {
            return b / g.length;
        }

        sum = 0;
        for (int i = 0; i < g.length; i++) {
            sum += g[i];
            r = i;
            if (sumCap(g, i, sum) >= b) {
                break;
            }
        }

        if (g.length == r) {
            return g[r - 1];
        }

        if (r == 0) {
            return g[r];
        }

        return (b - partialSums[r - 1]) / (g.length - r);
    }

    public int findGrantsCapPramp(int[] g, int b) {

        Arrays.sort(g);

        int n = g.length;
        int[] partialSums = new int[g.length];

        int sum = 0;

        for (int i = 0; i < g.length; i++) {
            sum += g[i];
            partialSums[i] = sum;
        }

        if (partialSums[n - 1] <= b) {
            return g[n - 1];
        }

        if (partialSums[0] >= b) {
            return b / n;
        }
        int start = 0;
        int end = n - 1;
        int r = 0;
        while (end > start) {
            r = (end + start) / 2;

            if (r > 0) {

                if (cappedSum(r, g, partialSums) > b) {
                    if (cappedSum(r - 1, g, partialSums) < b) {
                        break;
                    } else {
                        end = r - 1;
                    }
                } else {
                    start = r + 1;
                }
            }
        }
        if (r == 0) {
            return g[r];
        }
        int c = (b - partialSums[r - 1]) / (n - r);
        return c;
    }

    public int solution1(int[] g, int b) {
        Arrays.sort(g);

        int gs = 0;
        for (int i = 0; i < g.length; i++) {
            gs += g[i];
        }

        int tcap = gs - b;
        int j;
        for (j = 0; j < g.length; j++) {
            if (g[j] < tcap)
                continue;
            else
                break;
        }

        int n = g.length - j;
        int s = 0;
        while (j < g.length) {
            s += g[j];
            j++;
        }

        int overage = s - tcap;

        int cap = overage / n;

        return cap;
    }

    private int cappedSum(int i, int[] g, int[] partialSums) {
        return partialSums[i - 1] + g[i] * (g.length - i);
    }

    private int sumCap(int[] g, int i, int sum) {
        return sum + (g[i] * (g.length - (i + 1)));
    }
}
