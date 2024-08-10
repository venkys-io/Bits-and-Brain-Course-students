import java.util.Scanner;

public class MaximumofThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();

        System.out.println("Enter third number:");
        int num3 = scanner.nextInt();

        scanner.close();

        int max = findMaximum(num1, num2, num3);
        System.out.println("Maximum of the three numbers is: " + max);
    }

    public static int findMaximum(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }
}

    

