package questions;

import java.util.ArrayList;
import java.util.List;

class Quiz {
    private List<Question> questions;

    public Quiz() {
        questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void runQuiz() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int score = 0;

        for (Question question : questions) {
            question.displayQuestion();
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (question.checkAnswer(userAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }
        }

        System.out.println("Quiz completed! Your score: " + score + "/" + questions.size());
    }
}
