package QUIZ_CONSOLE_APP;

public class QuestionService {
    Question[] questions = new Question[5];

    public QuestionService(){
        questions[0] = new Question(1 , "What is Java" , "HLang" , "Clang" , "BLang" , "ComputerLang" , "ComputerLang");
        questions[1] = new Question(2 , "Size of int" , "1" , "2" , "4" , "8" , "8");
        questions[2] = new Question(3 , "Size of long" , "1" , "2" , "4" , "8" , "8");
        questions[3] = new Question(4 , "Size of char" , "1" , "2" , "4" , "8" , "8");
        questions[4] = new Question(5 , "Size of String" , "1" , "2" , "4" , "8" , "8");
    }   

    public void displayQuestion(){
        for(Question q : questions){
            System.out.println(q);
        }
        //System.out.println("Rahul is displaying question");
    }
    
    
}
