package ro.jademy.millionaire;

import java.util.ArrayList;
import java.util.List;

public class Millionaire {

    public static void main(String[] args) {

        Menu menu = new Menu();

        menu.showMenu();

        Answer a = new Answer("bbb", true);
        a.isCorrect();
        System.out.println(a.isCorrect());

        Answer answer1 = new Answer("1999", false);
        Answer answer2 = new Answer("2000");
        Answer answer3 = new Answer("2001", false);
        Answer answer4 = new Answer("2002", false);

        List<Answer> answers = new ArrayList<>();

        answers.add(answer1);
        answers.add(answer2);
        answers.add(answer3);
        answers.add(answer4);

        List<Question> questions = new ArrayList<>();

        Question question1 = new Question("In ce a fost lansat filmul Gladiatorul?", 3 , answers);

        questions.add(question1);














    }


}
