package questions;

//Base class|Parent class
public abstract class Question {
    public String questionText;
    public String answer;

    public Question(String questionText,String answer){
        this.questionText = questionText;
        this.answer = answer;
    }

    public abstract void displayQuestion();
    public abstract boolean checkAnswer(String userAnswer);
}
