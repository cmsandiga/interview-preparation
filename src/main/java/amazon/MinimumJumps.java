package amazon;

public class MinimumJumps {


    public int minJumps(int a[]) {
        return minJumps(a, 0, a.length);
    }

    private int minJumps(int[] a, int l, int h) {

        if (h == l) {
            return -1;
        }

        if (a[l] == 0)
            return Integer.MAX_VALUE;

        int min = Integer.MAX_VALUE;

        for (int i = l + 1; i <= h && i <= l + a[l]; i++) {

            int jumps = minJumps(a, i , h);

            if(jumps != Integer.MAX_VALUE && jumps +1 < min){
                min = jumps + 1;
            }
        }
        return min;
    }
}
