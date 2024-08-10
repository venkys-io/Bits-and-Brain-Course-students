
    //The Scanner class is used to get user input, and it is found in the java.util package.
import java.util.Scanner;
//To use the Scanner class,we are creating class and we are using new int method found in the Scanner class documentation. 
public class evenOrOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
            //nextint method is used to read the integers
 }
}
}

