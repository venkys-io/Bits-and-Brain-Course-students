
import java.util.Scanner;
// The scanner class is used to get user input, and it is found in the java.util package.

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: "); // 10
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter a operator (+,-,*,/):");
        String operator = sc.next();
// we are using double variable such that it executes required output in decimals.
        double result = 0.0;

        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                // result = a / b;
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Division by zero is not allowed");
                }
                break;
            default:
                System.out.println("Invlaid operator");
        }

        System.out.println("The result is: " + result);
    }
}
// we have to enter the values of a and b after compiling the file in respective terminal.
