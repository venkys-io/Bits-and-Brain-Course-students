
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

       // The Scanner class is used to get user input

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: "); 
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.print("Enter a operator (+,-,*,/):");
        String operator = sc.next();

//we used double vairable so it executes required output in decimals
        double result = 0.0;
        
// switch is used to run the code
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
