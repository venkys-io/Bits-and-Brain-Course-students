import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Enter a non-negative integer:");
        int number = scanner.nextInt();
        scanner.close();

        if (number < 0) {
            System.out.println("Error: Factorial is not defined for negative numbers.");
        } else {
            long factorial = calculateFactorial(number);
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
    }

    public static long calculateFactorial(int number) {
        long factorial = 1;
        for (int i =1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
    

