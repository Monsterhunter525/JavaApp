package getMaxElement;

public class GetMaxElement {
    public static int getMaxElement(int[][] matrix) {
        int max = matrix[0][0];
        int matrixLength = matrix.length;

        for (int i = 0; i < matrixLength; i++) {
            for(int j = 0; j < matrix[i].length; j++)

        max = Math.max(max, matrix[i][j]);
        }
        return max;


    }
}
