package QUIZ_CONSOLE_APP;

import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String selection[] = new String[5];
    int Score =0;

    public QuestionService(){
        questions[0] = new Question(1 , "What is Java" , "HLang" , "Clang" , "BLang" , "ComputerLang" , "ComputerLang");
        questions[1] = new Question(2 , "Size of int" , "1" , "2" , "4" , "8" , "8");
        questions[2] = new Question(3 , "Size of long" , "1" , "2" , "4" , "8" , "8");
        questions[3] = new Question(4 , "Size of char" , "1" , "2" , "4" , "8" , "8");
        questions[4] = new Question(5 , "Size of String" , "1" , "2" , "4" , "8" , "8");
    }   

    public void playQuiz(){
        int i=0;
        for(Question q : questions){
            
            System.out.println("Question no.: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;

            // if(selection[i] == q.getAnswer()){
            //     System.out.println("Correct answer");
            // }
        }

        for(String s  : selection){
            System.out.println(s);
        }
        //System.out.println("Rahul is displaying question");
    }

    public void printScore(){
        for(int i=0;i<questions.length;i++){
            Question q = questions[i];
            String actualAnswer = q.getAnswer();
            String userAnswer = selection[i];

            if(userAnswer.equals(actualAnswer)){
                Score++;
            }

        }

        System.out.println("Your Score is: " + Score);
    }
    
    
}
