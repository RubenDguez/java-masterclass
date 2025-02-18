/** 
 *  Arithmetic Operators 
 *  +, -, *, /, %
 * 
 *  Increment and Decrement Operators
 *  ++, -- 
 * 
 *  Augmented Assignment Operators
 *  +=, -=, *=, /=
 *  
 *  Order of operations [P-E-M-D-A-S]
 *  1. Parenthesis
 *  2. Exponent
 *  3. Multiplication
 *  4. Division
 *  5. Addition
 *  6. Subtraction
 */

public class App {
    public static void main(String[] args) throws Exception {
        int x = 10;
        int y = 2;

        int sum = x + y;
        int diff = x - y;
        int mult = x * y;
        int div = x / y;
        int mod = x % y; 

        System.out.println("x.....:" + x);
        System.out.println("y.....:" + y);
        System.out.println();
        System.out.println("SUM...: " + sum);
        System.out.println("DIFF..: " + diff);
        System.out.println("MULT..: " + mult);
        System.out.println("DIV...: " + div);
        System.out.println("MOD...: " + mod);
        System.out.println();
        
        // the following operations do change the variable values
        // directly
        System.out.println("Add one to x with '++'      : " + (x++));
        System.out.println("Take one from y with '--'   : " + (y--));
        System.out.println("Add 2 to x with '+='        : " + (x += 2));
        System.out.println("Take 3 off from y with '-=' : " + (y -= 3));
        System.out.println("Multiply x by 3 with '*='   : " + (x *= 3));
        System.out.println("Divide y by 2 with '/='     : " + (y /= 2));
        System.out.println("Get modulus using '%='      : " + (x %= 2));

        // Order of operations [P-E-M-D-A-S]
        double result = 3 + 4 * (7 - 5) / 2.0;
        System.out.println("3 + 4 * (7 - 5) / 2.0 = " + result);
    }
}
