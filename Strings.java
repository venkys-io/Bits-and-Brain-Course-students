
// example for public access specifier
public class Strings {
    public static void main(String[] args) {
        String str1="hello";
         String str2=new String("hello");
        // // == operator is used to compare the reference of the objects
         System.out.println(str1==str2);

        PublicExample obj = new PublicExample();
         obj.number = 10;
         obj.display();

        Child obj = new Child();
        obj.show();
        String s1="hello";
    }
}
    

