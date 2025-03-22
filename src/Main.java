import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Go go gadget Michigan What Every Driver Must Know Quizzinator!!");

        QsAndAs.init();
        int totalQnas = 0;
        int correct = 0;

        for (QNA qna : QsAndAs.QNAS) {
            qna.printQuestion();
            if (qna.isMultipleChoice) {
                if (qna.testAnswer(guess())) ++correct;
            } else {
                if (qna.testAnswer(guessNumber())) ++correct;
            }
            ++totalQnas;
        }

        float percentage = ((float) correct) / totalQnas;
        System.out.println(" ");
        System.out.println("You got " + correct + " out of " + totalQnas + " answers right.");
        if (percentage == 1f) {
            System.out.println("PERFECT SCORE!!");
        } else if (percentage >= 0.9f) {
            System.out.println("You did great!");
        } else if (percentage >= 0.8f) {
            System.out.println("You did pretty good!");
        } else if (percentage >= 0.7f) {
            System.out.println("You did alright.");
        } else if (percentage >= 0.6f) {
            System.out.println("You didn't do great.");
        } else {
            System.out.println("You didn't do well at all...");
        }
        System.exit(0);
    }

    private static int guess() {
        String yourGuess;
        int converted = -1;
        while (converted == -1) {
            yourGuess = in.next();
            switch (yourGuess.toLowerCase(Locale.ROOT)) {
                case "a" -> converted = 0;
                case "b" -> converted = 1;
                case "c" -> converted = 2;
                case "d" -> converted = 3;
                default -> System.out.println("Not a valid answer!");
            }
        }
        return converted;
    }

    private static int guessNumber() {
        String yourGuess;
        int converted = -1;
        while (converted == -1) {
            yourGuess = in.next();
            try {
                converted = Integer.parseInt(yourGuess);
            } catch (NumberFormatException e) {
                System.out.println("Not a valid answer!");
            }
        }
        return converted;
    }
}