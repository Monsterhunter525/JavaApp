package halfMassiveDev;

public class Main {

    public static void main(String[] args) {

        int [] numbers = {1, 3, 5, 7, 9, 0, 6};
        for(int i = numbers.length/2; i < numbers.length; i++){
            if(numbers[i] == 0){
                break;
            }
            else {

                System.out.println(numbers[i]);
            }
            System.out.println(numbers[i]);
        }
        


    }

}
