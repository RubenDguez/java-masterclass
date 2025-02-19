import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        // when generating random numbers with random object
        // the first argument is inclusive whereas the second one is not
        // so to generate numbers between 1 and 10 the arguments 
        // should be (1, 11) 
        // think of it as having a for loop with the following 
        // signature for(int i = 1; i < 11; i ++);
        // same situation 
        int dice1 = random.nextInt(1, 7);
        int dice2 = random.nextInt(1, 7);
        int dice3 = random.nextInt(1, 7);

        // same rules apply to random double numbers
        double number = random.nextDouble(1, 10);

        // you can generate random boolean as well
        // in case you need like a flipping coin situation
        boolean coin = random.nextBoolean();

        System.out.println(dice1);
        System.out.println(dice2);
        System.out.println(dice3);

        System.out.println(number);

        System.out.println((coin == true ? "HEAD" : "TAIL"));
    }
}
