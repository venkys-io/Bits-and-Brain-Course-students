
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: "); // 10
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter a operator (+,-,*,/):");
        String operator = sc.next();

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
//The Scanner class is used to get user input, and it is found in the java.util package.

//To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation.
// In our example, we will use the nextInt() method, which is used to read integers:
