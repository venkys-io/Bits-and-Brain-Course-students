import java.util.Scanner;

public class JavaQuizApplication {
    // Array of questions
    private static final String[] questions = {
            "Who is known as the creator in the Hindu trinity?",
            "Which epic features the character Lord Rama?",
            "Who is the consort of Lord Shiva?",
            "In which form did Lord Vishnu take to save the Earth from a flood?",
            "Which river is considered most sacred in Hinduism?",
            "Who is the demon king in the Ramayana?",
            "Which weapon is associated with Lord Shiva?",
            "Who is the charioteer of Arjuna in the Mahabharata?",
            "Which goddess is known as the destroyer of evil forces?",
            "Who is the god of wisdom and knowledge in Hinduism?",
            "Which avatar of Vishnu is known for slaying Hiranyakashipu?",
            "Who is the king of the gods in Hindu mythology?",
            "Which sage wrote the Mahabharata?",
            "Which festival celebrates the birth of Lord Krishna?",
            "Who is known as the goddess of learning and arts?",
            "Which mountain is considered the abode of Lord Shiva?",
            "Who is the mother of the Pandavas in the Mahabharata?",
            "Which demon was killed by Goddess Kali?",
            "What is the name of Lord Rama's wife?",
            "Who wrote the epic Ramayana?"
    };

    // Array of choices corresponding to the questions
    private static final String[][] options = {
            {"A) Shiva", "B) Vishnu", "C) Brahma", "D) Indra"},
            {"A) Mahabharata", "B) Ramayana", "C) Bhagavad Gita", "D) Vedas"},
            {"A) Lakshmi", "B) Saraswati", "C) Parvati", "D) Radha"},
            {"A) Narasimha", "B) Vamana", "C) Kurma", "D) Matsya"},
            {"A) Yamuna", "B) Ganges", "C) Saraswati", "D) Narmada"},
            {"A) Ravana", "B) Hiranyakashipu", "C) Kamsa", "D) Mahishasura"},
            {"A) Sudarshana Chakra", "B) Trishula", "C) Bow and Arrow", "D) Mace"},
            {"A) Karna", "B) Bhishma", "C) Krishna", "D) Drona"},
            {"A) Durga", "B) Lakshmi", "C) Saraswati", "D) Sita"},
            {"A) Vishnu", "B) Shiva", "C) Ganesha", "D) Indra"},
            {"A) Narasimha", "B) Vamana", "C) Kurma", "D) Varaha"},
            {"A) Agni", "B) Varuna", "C) Indra", "D) Yama"},
            {"A) Valmiki", "B) Vyasa", "C) Narada", "D) Vishwamitra"},
            {"A) Diwali", "B) Holi", "C) Janmashtami", "D) Navratri"},
            {"A) Saraswati", "B) Parvati", "C) Lakshmi", "D) Kali"},
            {"A) Mount Meru", "B) Mount Everest", "C) Mount Kailash", "D) Mount Abu"},
            {"A) Kunti", "B) Gandhari", "C) Draupadi", "D) Satyavati"},
            {"A) Mahishasura", "B) Hiranyaksha", "C) Tarakasura", "D) Kumbhakarna"},
            {"A) Draupadi", "B) Sita", "C) Radha", "D) Rukmini"},
            {"A) Vyasa", "B) Tulsidas", "C) Kalidasa", "D) Valmiki"}
    };

    // Array of correct answers corresponding to the questions
    private static final char[] answers = {
            'C', 'B', 'C', 'D', 'B', 'A', 'B', 'C', 'A', 'C',
            'A', 'C', 'B', 'C', 'A', 'C', 'A', 'A', 'B', 'D'
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


