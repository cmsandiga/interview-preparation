package pramp.interviewee;

public class SpiralSum {

    public static int[] spiralSum(int[][] inputMatrix) {
        int[] result = new int[inputMatrix.length * inputMatrix[0].length];
        int resultIndex = 0;

        int u = 0;
        int r = inputMatrix[0].length - 1;
        int l = 0;
        int d = inputMatrix.length - 1;

        for (int i = 0; i < inputMatrix.length; i++) {

            for (int j = l; j <= r; j++) {
                result[resultIndex] = inputMatrix[u][j];
                resultIndex++;
            }
            u++;

            for (int j = u; j <= u; j++) {
                result[resultIndex] = inputMatrix[r][j];
                resultIndex++;
            }
            r--;

            for (int j = r; j >= l; j--) {
                result[resultIndex] = inputMatrix[d][j];
                resultIndex++;
            }
            d--;

            for (int j = d; d >= u; j--) {
                result[resultIndex] = inputMatrix[l][j];
                resultIndex++;
            }
            l++;
        }

        return result;
    }
}
