package neighboursCellsSum;

public class Main {
    public static void main(String[] args) {
        int rowIndex = 1;
        int columnIndex = 1;
        int[][] array = {{8, 3, 5}, {6, 7, 1}, {5, 7, 2}};

        int neighboursCellsSum = array[columnIndex - 1][rowIndex] + array[columnIndex + 1][rowIndex] +
                array[columnIndex][rowIndex - 1] + array[columnIndex][rowIndex + 1];


        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(array[i][j]+"");
            }
            System.out.println();
        }
        System.out.println(neighboursCellsSum);
    }
}