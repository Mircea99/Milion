package ro.jademy.millionaire;

import java.util.ArrayList;
import java.util.List;

public class Millionaire {

    private static List<Question> allQuestions = new ArrayList<>();



    public static void main(String[] args) {

//        Menu menu = new Menu();
//
//        menu.showMenu();
//
//        Answer a = new Answer("bbb", true);
////        a.isCorrect();
//        System.out.println(a.isCorrect());

        initQuestions();

        List<Question> gameQuestionList = getGameQuestionList();
        Game game1 = new Game(gameQuestionList);

    }

    private static void initQuestions() {
        List<Answer> answers = new ArrayList<>();
        answers.add(new Answer("1999"));
        answers.add(new Answer("2000", true));
        answers.add(new Answer("2001"));
        answers.add(new Answer("2002"));

        Question question1 = new Question("In ce a fost lansat filmul Gladiatorul?", 1, answers);
        allQuestions.add(question1);

        answers.add(new Answer("1999", true));
        answers.add(new Answer("2000"));
        answers.add(new Answer("2001"));
        answers.add(new Answer("2002"));
        Question question2 = new Question("In ce a fost lansat filmul Matrix?", 2, answers);
        allQuestions.add(question2);

    }


}
