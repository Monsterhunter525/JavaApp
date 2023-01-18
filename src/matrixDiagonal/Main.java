package matrixDiagonal;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(MatrixDiagonal.getDiagonal(new int[][]{{-2, 31, 6, 7}, {15, -42, 1, 0}, {9, -7, 12, 19}, {55, 34, 1, -10}})));
        System.out.println(Arrays.toString(MatrixDiagonal.getCounterDiagonal(new int[][]{{-2, 31, 6, 7}, {15, -42, 1, 0}, {9, -7, 12, 19}, {55, 34, 1, -10}})));

    }
}
