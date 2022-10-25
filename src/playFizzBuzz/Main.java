package playFizzBuzz;

public class Main {

    public static void main(String[] args) {
        playFizzBuzz(28,36);

    }

        public static void playFizzBuzz(int start, int end) {

            for (int i = start; i <= end; i++){

                if(i % 7 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                else if(i % 7 == 0) {
                    System.out.println("Buzz");
                }
                else if(i % 5 == 0){
                    System.out.println("Fizz");
                }
                else {
                    System.out.println(i);
                }


            }




        }


}
