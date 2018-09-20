package ro.jademy.millionaire;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    List<Question> allQuestions = new ArrayList<>();
    private int currentLevel = 1;

    public Game( List<Question> allQuestions) {
        this.allQuestions.addAll(allQuestions);
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }


    public void start() {
        //initializam intrebarile si jocul
        System.out.println("Bine ai venit");
        System.out.println("Incepi jocul? Y/N");
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();
//        System.out.println(answer.equalsIgnoreCase("Y")? "PAPAPAPAM" : System.exit(0););
        if (answer.contentEquals("N")) {
            System.exit(0);
        } else askQuestion();
    }

    public void askQuestion() {
        //show question on screen
        for (Question question : allQuestions) {
            if (question.getDiffcultyLevel() == currentLevel) {
                question.printQuestion();

            }
        }

    }

//
//    public void answerQuestion(){
//        //get user imput and check if correct
//
//    }
//
//    public void fiftyFifty(){
//        //show the same question but only with 2 possible answers
//    }


}

