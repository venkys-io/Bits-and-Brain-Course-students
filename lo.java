public class lo {
    public static void main(String[] args) {
        boolean x=true;
        boolean y=false;

        
        int age=27;
        boolean hasDrivingLicense=true;
        boolean isEligibleForDriving=(age>=18) && hasDrivingLicense;
        System.out.println(isEligibleForDriving);
        

        int score=80;
        boolean passedExam=(score>=50) || (score<70 && hasDrivingLicense);
        System.out.println(passedExam);
    

    }
}




