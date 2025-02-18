import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double width = 0;
        double height = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        System.out.printf("Area..: %0,1.2fcm^2\n", (width * height));

        scanner.close();
    }
}
