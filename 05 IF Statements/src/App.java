
/**
 *  IF statement    =   performs a block of code if its condition is true
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int age;
        String name;
        boolean isStudent;

        System.out.println();

        System.out.print("Enter your name: ");
        name = scan.nextLine();
        
        System.out.print("Enter your age: ");
        age = scan.nextInt();

        System.out.print("Are you a student? (true/false) ");
        isStudent = scan.nextBoolean();

        scan.close();

        if (name.isEmpty()) System.out.println("\nYou didn't enter your name!");
        else System.out.println("\nHello " + name + "!");

        if (age < 0) {
            System.out.println("You haven't been born yet");
        } else if (age == 0) {
            System.out.println("You are a baby");
        } else if (age >= 65) {
            System.out.println("You are a senior");
        } else if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a child");
        }

        if (isStudent) System.out.println("You are a student.");
        else System.out.println("You are not a student.");

        System.out.println();

    }
}
