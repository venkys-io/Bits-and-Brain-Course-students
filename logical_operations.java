public class logical_operations {
    public static void main(String[] args) {

        // boolean a =true;
        // boolean b =false;

        int age=27;
        boolean hasDrivingLicense=true;
        boolean isEligibleForDriving=(age>=18) && hasDrivingLicense;
        System.out.println(isEligibleForDriving);
        int score=70;
        boolean passedExam=(score>=20)||(score<80 && hasDrivingLicense);
        System.out.println(passedExam);
        
       

    }
}

