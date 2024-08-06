import java.util.Scanner;
public class userinput {
    public static void main(String[] args) {
        System.out.println("enter your name :");
        Scanner sc = new Scanner(System.in);
        String name =sc.nextLine();
        System.out.println("enter your age : ");
        int age = sc.nextInt();
System.out.println("your name is:"+name+"and your age is:"+age);
    }
}
