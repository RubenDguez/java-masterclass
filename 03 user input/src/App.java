import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name? ");
        String name = scanner.nextLine();

        System.out.print("How old are you? ");
        int age = scanner.nextInt();

        System.out.print("Are you a student? (true/false) ");
        boolean isStudent = scanner.nextBoolean();

        System.out.print("What's your GPA? ");
        double gpa = scanner.nextDouble();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Student: " + isStudent);
        System.out.println("Your GPA is: " + gpa);

        scanner.close();
    }
}
