package questions;

import java.util.Arrays;

//Sub class | child class
class Checkbox extends Question {
    private String[] options;
    private boolean[] correctChoices;

    public Checkbox(String questionText, String[] options, boolean[] correctChoices) {
        super(questionText, "");
        this.options = options;
        this.correctChoices = correctChoices;
    }

    @Override
    public void displayQuestion() {
        System.out.println(questionText);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        // Convert the user's answer to lowercase and trim whitespace
        String normalizedUserAnswer = userAnswer.trim().toLowerCase();

        // Split the user's answer into individual choices
        String[] userChoices = normalizedUserAnswer.split(",");

        // Create an array to track user selections
        boolean[] userSelections = new boolean[options.length];

        // Mark user's selected choices
        for (String choice : userChoices) {
            try {
                int index = Integer.parseInt(choice) - 1;
                // Check if the index is within the range of options
                if (index >= 0 && index < options.length) {
                    userSelections[index] = true;
                } else {
                    // Index is out of range, treat as invalid answer
                    return false;
                }
            } catch (NumberFormatException e) {
                // Invalid input (non-integer), treat as invalid answer
                return false;
            }
        }

        // Check if the user's selections match the correct combination
        return Arrays.equals(userSelections, correctChoices);
    }


}
