package questions;
//Sub class | child class
class TrueFalse extends Question {
    public TrueFalse(String questionText, boolean correctAnswer) {
        super(questionText, Boolean.toString(correctAnswer));
    }

    @Override
    public void displayQuestion() {
        System.out.println(questionText);
        System.out.println("True or False?");
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        return userAnswer.equalsIgnoreCase(answer);
    }
}
