public class Reduce {
    public static void main(String[] args) {
        int number = 100;

        boolean iseven = number % 2 == 0;

        int counter = 0;
        while (number != 0) {
            if (iseven){
                number = number / 2;
                counter++;
            }
            else{
                number = number - 1;
                counter++;
            }
        }
        System.out.println(counter);
    }
}
