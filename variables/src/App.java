public class App {
    public static void main(String[] args) throws Exception {
        // int
        int age = 43;
        int year = 2025;

        // double
        double PI = 3.14159;
        double temperature = 73.6;

        // char
        char middleInitial = 'R';
        char temperatureChar = 'F';

        // boolean
        boolean isRaining = false;
        boolean hasPeperoni = true;

        // String
        String firstName = "Argenis";
        String lastName = "Dominguez";

        // array
        int[] ages = { 43, 50, 25 };
        double[] temperatures = { 85.5, 86.2, 75.9 };
        char[] grades = { 'A', 'B', 'C', 'D', 'F' };

        System.out.printf("Age..............: %d\n", age);
        System.out.printf("Year.............: %d\n", year);

        System.out.printf("PI...............: %f\n", PI);
        System.out.printf("temperature......: %f\n", temperature);

        System.out.printf("middleInitial....: %s\n", middleInitial);
        System.out.printf("temperatureChar..: %s\n", temperatureChar);

        System.out.printf("isRaining........: %b\n", isRaining);
        System.out.printf("hasPeperoni......: %b\n", hasPeperoni);

        System.out.printf("Fullname.........: %s %s\n", firstName, lastName);

        // to print out the array type we will need to loop through
        // the values in them, otherwise, System.out.print will print the
        // memory address these array represent
        System.out.println(ages);
        System.out.println(temperatures);
        System.out.println(grades);

        for (int _age : ages) {
            System.out.println(_age);
        }

        for (double _temperature : temperatures) {
            System.out.println(_temperature);
        }

        for (char _grade : grades) {
            System.out.println(_grade);
        }
    }
}
