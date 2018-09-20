package ro.jademy.millionaire;

import java.util.List;

public class Question {

    private static final int MAX_LEVEL = 15;

    private String question;
    private int diffcultyLevel; // max 15

    private List<Answer> answerList;


    public Question(String question, int diffcultyLevel, List<Answer> answerList) {
        this.question = question;
        this.diffcultyLevel = diffcultyLevel;
        this.answerList = answerList;

    }


    public int getMaxLevel() {
        return MAX_LEVEL;
    }


    public String getQuestion() {
        return question;
    }

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                '}';
    }

    public int getDiffcultyLevel() {
        return diffcultyLevel;
    }


    public List<Answer> getAnswerList() {
        return answerList;
    }


    public Answer getCorrectAnswer() {

        for (Answer answer : answerList) {
            if (answer.isCorrect()) {
                return answer;
            }

        }
        return null;

    }

    public void printQuestion() {
        System.out.println(question);
        for (int i = 0; i <= answerList.size(); i++) {
            String prefix = getPrefix(i);
            System.out.println(prefix + answerList.get(i));
        }
    }

    private String getPrefix(int i) {
        switch (i) {
            case 0:
                return "A.";
            case 1:
                return "B.";
            case 2:
                return "C.";
            case 3:
                return "D.";
            default:
                return "A.";
        }
    }
}
