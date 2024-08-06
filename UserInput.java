import java.util.Scanner;
public class UserInput {

    public static void main(String[] args) {
        System.out.println("Enter your name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        System.out.println("your name is : " + name + " and your age is : " +age);
    
    }
}