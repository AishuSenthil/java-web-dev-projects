package questions;

//Sub class | child class
class MultipleChoice extends Question {
    private String[] options;
    private int correctOptionIndex;

    public MultipleChoice(String questionText, String[] options, int correctOptionIndex) {
        super(questionText, Integer.toString(correctOptionIndex));
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
    }

    @Override
    public void displayQuestion() {
        System.out.println(questionText); // Accessing questionText directly
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        // Convert the user's answer to lowercase and trim whitespace
        String normalizedUserAnswer = userAnswer.trim().toLowerCase();

        // Convert the correct option index to a string for comparison
        String correctAnswerIndex = Integer.toString(correctOptionIndex);

        // Check if the normalized user answer matches the correct answer index
        return normalizedUserAnswer.equals(correctAnswerIndex);
    }

}
