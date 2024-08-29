import java.util.Scanner;

public class QuizApp {
    
    static String[] questions = new String[3];
    static String[] options1 = new String[4];
    static String[] options2 = new String[4];
    static String[] options3 = new String[4];
    static char[] answers = new char[3];
    
    static int score = 0;
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        initializeQuiz();
        do {
            startQuiz();
            displayScore();
        } while (retryQuiz());
    }
    
    public static void initializeQuiz() {
        // Initialize questions
        questions[0] = "Which of the following is a markup language ?";
        questions[1] = " when did the quit india moovement start?";
        questions[2] = "Who is the first president of india?";
        
        // Initialize options for each question
        options1[0] = "A. HTML";
        options1[1] = "B. css";
        options1[2] = "C. java";
        options1[3] = "D. c++";
        
        options2[0] = "A. 1945";
        options2[1] = "B. 1942";
        options2[2] = "C. 1947";
        options2[3] = "D. 1943";
        
        options3[0] = "A. Neelam Sanjiva Reddy";
        options3[1] = "B.Dr.Rajendar Prasad ";
        options3[2] = "C. A.P.J.Abdul Kalam";
        options3[3] = "D. Jawaharlal Nehru";
        
        // Initialize correct answers
        answers[0] = 'A';
        answers[1] = 'B';
        answers[2] = 'B';
    }
    
    public static void startQuiz() {
        score = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            displayOptions(i);
            char userAnswer = getUserAnswer();
            if (validateAnswer(userAnswer, answers[i])) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect!\n");
            }
        }
    }
    
    public static void displayOptions(int questionIndex) {
        String[] options;
        if (questionIndex == 0) {
            options = options1;
        } else if (questionIndex == 1) {
            options = options2;
        } else {
            options = options3;
        }
        for (String option : options) {
            System.out.println(option);
        }
    }
    
    public static char getUserAnswer() {
        char userAnswer;
        while (true) {
            System.out.print("Enter your choice (A/B/C/D): ");
            userAnswer = scanner.next().toUpperCase().charAt(0);
            if (userAnswer >= 'A' && userAnswer <= 'D') {
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
        return userAnswer;
    }
    
    public static boolean validateAnswer(char userAnswer, char correctAnswer) {
        return userAnswer == correctAnswer;
    }
    
    public static void displayScore() {
        System.out.println("Your total score is: " + score + "/" + questions.length);
    }
    
    public static boolean retryQuiz() {
        System.out.print("Do you want to retry the quiz? (yes/no): ");
        String retry = scanner.next().toLowerCase();
        return retry.equals("yes");
    }
}