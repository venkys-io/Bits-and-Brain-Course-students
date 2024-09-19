import java.util.Scanner;

public class JavaQuizApplication {
    // Array of questions
    private static final String[] questions = {
            "Who is CEO of venkys.io?",
            "In JavaScript, which symbol is used for comments?",
            "What is the powerhouse of the cell?",
            "Who wrote "Romeo and Juliet?",
            "What is the largest mammal in the world?",
            "How many players are on a standard basketball team?",
            "What does HTTP stand for?",
            "Which movie features a character named Jack Dawson?",
            "What is the smallest country in the world?",
            "What part of the cell contains the genetic material?",
            "Which planet is known as the Red Planet?",
            "Which gas do plants absorb from the atmosphere?",
            "What is the chemical symbol for gold?",
            "Which ancient civilization built the pyramids",
            "Which is the longest river in the world?",
            "Which country is known as the Land of the Rising Sun?",
            "What is the hardest natural substance on Earth?",
           
    };

    // Array of choices corresponding to the questions
    private static final String[][] options = {
            {"A) Tim Cook", "B) venkynkarkuri", "C) Sundar Pichai", "D) Mark Zuckerberg"},
            {"A) //", "B) #", "C) /* *", "D) Both A and C"},
            {"A) Nucleus", "B) Mitochondria", "C) Ribosome", "D) Golgi apparatus"},
            {"A) Charles Dickens", "B) Mark Twain", "C) William Shakespeare", "D) Jane Austen"},
            {"A) African Elephant", "B) Blue Whale", "C) Giraffe "D) Orca"},
            {"A) 5", "B) 7", "C) 9", "D) 11"},
            {"A) HyperText Transfer Protocol", "B) HighText Transfer Protocol", "C) HyperText Transmission Protocol", "D) Hyper Transfer Text Protocol"},
            {"A) Avatar", "B) Titanic", "C) The Great Gatsby", "D) Inception"},
            {"A) Monaco", "B) Nauru", "C)Vatican City", "D) San Marino"},
            {"A) Cytoplasm", "B) Nucleus", "C) Cell Membrane", "D) Ribosome"},
            {"A) Venus", "B) Mars", "C) Jupiter", "D) Saturn"},
            {"A) Oxygen", "B) Carbon Dioxide", "C) Nitrogen", "D) Hydrogen"},
            {"A) Au", "B) Ag", "C) Fe", D) Pb"},
            {"A) Romans", "B) Greeks", "C) Egyptians", "D) Mayans"},
            {"A)Amazon", "B) Nile", "C) Yangtze", "D) Mississippi"},
            {"A) China", "B) Japan", "C) Thailand", "D) South Korea"},
            {"A) Gold", "B) Diamond", "C) Sapphire", "D) Quartz"},
           
    };

    // Array of correct answers corresponding to the questions
    private static final char[] answers = {
            'B', 'A', 'B', 'C', 'B', 'A', 'A',
           'B', 'C', 'B', 'B', 'B', 'A', 'C', 'A', 'B', 'B'
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean retry = true;

        while (retry) {
            int score = 0;

            // Iterate over questions
            for (int i = 0; i < questions.length; i++) {
                System.out.println((i + 1) + ". " + questions[i]);
                for (String option : options[i]) {
                    System.out.println(option);
                }

                char userAnswer;
                while (true) {
                    System.out.print("Your answer (A/B/C/D): ");
                    userAnswer = Character.toUpperCase(scanner.next().charAt(0));
                    if (userAnswer == 'A' || userAnswer == 'B' || userAnswer == 'C' || userAnswer == 'D') {
                        break;
                    } else {
                        System.out.println("Invalid input! Please enter A, B, C, or D.");
                    }
                }    

                if (userAnswer == answers[i]) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Wrong! The correct answer is " + answers[i]);
                }
                System.out.println();
            }

            // Display final score
            System.out.println("Quiz completed! Your final score is: " + score + "/" + questions.length);

            // Retry option
            System.out.print("Do you want to retry the quiz? (yes/no): ");
            String retryInput = scanner.next().toLowerCase();
            retry = retryInput.equals("yes");
            System.out.println();
        }

        System.out.println("Thank you for playing!");
        scanner.close();
    }
}
