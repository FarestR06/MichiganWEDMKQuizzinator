public class QNA {
    public final boolean isMultipleChoice;
    public final String question;
    public final int correct;
    public final String explanation;
    public final String[] answers;

    /**
     * Creates a multiple choice question
     * @param question Prompt for this question
     * @param correct Correct answer, between 0 and 3. 0 is A, 1 is B, and so on...
     * @param explanation Explanation for the answer
     * @param answers Possible answers to the question
     */
    public QNA(String question, int correct, String explanation, String... answers) {
        this.isMultipleChoice = true;
        this.question = question;
        this.correct = correct;
        if (correct > 3 || correct < 0) {
            throw new ArrayIndexOutOfBoundsException("Correct answer doesn't apply to any option!");
        }
        this.explanation = explanation;
        this.answers = answers;
        if (answers.length != 4) {
            throw new IllegalArgumentException("Question object must have four options!");
        }
    }

    /**
     * Creates a written number question
     * @param question Prompt for this question
     * @param correct Correct answer
     * @param explanation Explanation for the answer
     */
    public QNA(String question, int correct, String explanation) {
        this.isMultipleChoice = false;
        this.question = question;
        this.correct = correct;
        this.explanation = explanation;
        this.answers = new String[]{"N/A"};
    }

    public void printQuestion() {
        System.out.println(" "); // Line break
        System.out.println(this.question);
        if (this.isMultipleChoice) {
            String[] letters = {"A. ", "B. ", "C. ", "D. "};
            for (int i = 0; i < 4; i++) {
                System.out.println(letters[i] + this.answers[i]);
            }
        }
    }

    public boolean testAnswer(int guess) {
        boolean isCorrect = guess == this.correct;
        if (isCorrect) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }
        System.out.println(this.explanation);
        return isCorrect;
    }
}
