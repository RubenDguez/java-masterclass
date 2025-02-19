import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int a = 0;
        int b = 0;

        System.out.println("\nCalculate the Hypotenuse");

        System.out.print("What's the value of a? : ");
        a = scan.nextInt();

        System.out.print("What's the value of b? : ");
        b = scan.nextInt();

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The value of the Hypotenuse or C = " + c);

        System.out.println("\nWorking with circumference, area and volume: ");

        System.out.print("What is the radius? ");
        double radius = scan.nextDouble();

        System.out.printf("The circumference is..: %.1fcm\n" , (2 * Math.PI * radius));
        System.out.printf("The area is...........: %.1fcm^2\n" , (Math.PI * Math.pow(radius, 2)));
        System.out.printf("The volume is.........: %.1fcm^3\n" , ((4.0 / 3.0) * Math.PI * Math.pow(radius, 3)));

        scan.close();
    }
}
