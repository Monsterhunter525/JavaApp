package getSosMessage;


public class Main {
    public static void main(String[] args){
        char [][] sosSignal = {{'x','x','x'},{'S','O','S'},{'x','x','x'}};

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(sosSignal[i][j]+"");
            }
            System.out.println();
        }


    }
}
