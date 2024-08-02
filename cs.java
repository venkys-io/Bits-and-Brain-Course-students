public class cs {
// if statement
public static void main(String[] args) {
    int num=2;

    if  statement example
    if (false){
    System.out.println("the number is positive");
    }

    // else ifexample
    if(num>5){
    System.out.println("number is positive");
     }else{
    System.out.println("Number is negative");
     }

    // if else if
    if(num>5){
    System.err.println("Number is positive");
     } else if(num==5){
    System.out.println("NUmber is equal to 5");
     }else{
    System.out.println("Number is Negative");
    }

    int day=6;

    // if else if
    if(day==1){
     System.out.println("Monday");
    }else if (day==2){
    System.out.println("Tuesday");
    }else if (day==3){
     System.out.println("Wednesday");
     }else if (day==4){
     System.out.println("Thursday");
     }else if (day==5){
    System.out.println("Friday");
    }else if (day==6){
    System.out.println("Saturday");
     }else if (day==7){
    System.out.println("Sunday");
    }

    // Switch : Case we need have an break ; default test case
     int day = 9;
    switch (day) {
    case 1:
     System.out.println("Monday");
    break;
    case 2:
     System.out.println("Tuesday");
    break;
    case 3:
     System.out.println("wednesday");
    break;
    case 4:
    System.out.println("Thursday");
    break;
    case 5:
     System.out.println("Friday");
     break;
     case 6:
     System.out.println("Saturday");
     break;
    case 7:
     System.out.println("Sunday");
     break;
     default:System.out.println("Enter a valid day");
     }

    int[] numbers = { 1, 2, 3, 8, 5, 6, 7 };

     System.out.println(numbers[3]);

    // [1,2,3,5,8,5,6]
    // 0,1,2,3,4,5,6

    //for (initialize,condition,increment/decrement)
    //number.length=6
    // int[] numbers = { 1, 2, 3, 8, 5, 6, 7 };

     for (int i = 0; i < numbers.length; i++) {
    if (i == 5) {
    System.out.println("In the continue");
    // //break;
    // continue;
    }
     System.out.println(numbers[i]);
    }

    int[] numbers = { 1, 2, 3, 8, 5, 6, 7, 9, 10 };

    // for (int i=0;i<length of aray;increment)

    for (int number : numbers) {
        // number=1
        // number=2
        System.out.println(number);
    }
}
}
    
