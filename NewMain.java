import java.util.*;
/*Quiz is an abstrct class which contain abstact method set which must be implemented in its child classes.
It also contains the methods quiz and add functions*/
abstract class Quiz{
    int score=0;
    private String ans1[]=new String[30];
    abstract void set();
    Scanner sc=new Scanner(System.in);   
    //This method is used to add questions to the quiz
    void add(ArrayList<String> aList,ArrayList<String> bList,ArrayList<String> cList){
        sc.nextLine();
        System.out.println("enter the question");
        String s=sc.nextLine();
        aList.add(s);
        System.out.println("enter 4 options(tab seperated)");
        String k=sc.nextLine();
        bList.add(k);
        System.out.println("enter the answer");
        String l=sc.nextLine();
        cList.add(l);        
    }
    //This method is used to print the quiz.
     void quiz(ArrayList<String> aList,ArrayList<String> bList,ArrayList<String> cList){
        score=0;
            for(int i=0;i<aList.size();i++){
                System.out.println(i+1+"."+aList.get(i));
                System.out.println(bList.get(i));
                ans1[i]=sc.next();
                System.out.println();
                if(ans1[i].equals(cList.get(i)))
                    score++;
                System.out.println("Correct answer is "+cList.get(i)+"\n");             
            }
            if(score>=5){
                System.out.println("Keep up the good work!\n");
            }
            else if(score>=3){
                System.out.println("Good Job.In some areas, there's room for improvement.\n");
            }
            else{
                System.out.println("Thanks for taking the quiz.");

            }
        System.out.println("Your score is "+score+"\n");
    }
}
//CQuiz class extends Quiz class. It gives definition of abstract method set which sets the questions,options and answers.
class CQuiz extends Quiz{
    //The question,option and answer are saved as array list of strings.
    ArrayList<String> aList=new ArrayList<String>();
    ArrayList<String> bList=new ArrayList<String>();
    ArrayList<String> cList=new ArrayList<String>();
    ArrayList<String> rList=new ArrayList<String>();
    ArrayList<String> sList=new ArrayList<String>();
    ArrayList<String> tList=new ArrayList<String>();
    @Override
    void set(){
        String c1="A preprocessor directive is a statement that begins with_____\n";
        aList.add(c1);
        String c2="How to write a comment on a single line?\n";
        aList.add(c2);
        String c3="What is the name of the main function of a C program?\n";
        aList.add(c3);
        String c4="All keywords in C are in ____________";
        aList.add(c4);
        String c5="Which of the following declaration is not supported by C language?";
        aList.add(c5);
        String b1="a.{ \t b.#\t c.// \t d./*\n";
        bList.add(b1);
        String b2="a./* my comment \t b.// my comment // \t c.// my comment \t d. /* my comment */\n";
        bList.add(b2);
        String b3="a. principal \t b. main \t c. any name \t d.begin\n";
        bList.add(b3); 
        String b4="a) LowerCase letters\tb) UpperCase letters\tc) CamelCase letters\td) None of the mentioned";
        bList.add(b4);
        String b5="a) String str;\tb) char *str;\tc) float str = 3e2;\td) Both “String str;” and “float str = 3e2;”";
        bList.add(b5);
        String d1="b";
        cList.add(d1);
        String d2="b,c,d";
        cList.add(d2);
        String d3="b";
        cList.add(d3);
        String d4="a";
        cList.add(d4);
        String d5="a";
        cList.add(d5);
    }
    //This is used to take already existing quiz.This method calls quiz method of parent class
    void quiz1c(){
        super.quiz(aList,bList,cList);
    }
    //It is used to take the quiz created by user.This method calls quiz method of parent class
    void quiz2c(){
        if(rList.size()==0)
            System.out.println("First create qusetions");
        else
        super.quiz(rList,sList,tList);
    }
    //This is used to add questions to already existing quiz.This method calls quiz method of parent class
    void addc(){
        super.add(aList,bList,cList);
    }  
    //This is used to add questions to users quiz or create new quiz.This method calls quiz method of parent class
    void createc() {
        super.add(rList,sList,tList);
    }
}
//This class extends abstract class quiz.It implements the abstract method set.
class HtmlQuiz extends Quiz{
     //The question,option and answer are saved as array list of strings.
    ArrayList<String> dList=new ArrayList<String>();
    ArrayList<String> eList=new ArrayList<String>();
    ArrayList<String> fList=new ArrayList<String>();
    ArrayList<String> uList=new ArrayList<String>();
    ArrayList<String> vList=new ArrayList<String>();
    ArrayList<String> wList=new ArrayList<String>();
    @Override
    //This method is used to set questions,options and answers.
    void set(){
        String c1="Who is the father of HTML?\n";
        dList.add(c1);
        String c2="HTML stands for __________\n";
        dList.add(c2);
        String c3="What is the correct syntax of doctype in HTML5\n";
        dList.add(c3);
        String c4="Which of the following is used to read an HTML page and render it?";
        dList.add(c4);
        String c5="Which of the following tag is used for inserting the largest heading in HTML?";
        dList.add(c5);
        String b1="a) Rasmus Lerdorf \t b) Tim Berners-Lee \t c) Brendan Eich \t d) Sergey Brin \n";
        eList.add(b1);
        String b2="a) HyperText Markup Language \t b) HyperText Machine Language \t c) HyperText Marking Language \t d) HighText Marking Language \n";
        eList.add(b2);
        String b3="a) </doctype html> \t b) <doctype html> \t c) <doctype html!> \t d) <!doctype html>\n";
        eList.add(b3); 
        String b4="a) Web server\tb) Web network\tc) Web browser\td) Web matrix";
        eList.add(b4);
        String b5="a) head\tb) <h1>\tc) <h6>\td) heading";
        eList.add(b5);
        String d1="b";
        fList.add(d1);
        String d2="a";
        fList.add(d2);
        String d3="d";
        fList.add(d3);
        String d4="c";
        fList.add(d4);
        String d5="b";
        fList.add(d5);
    }
    //This is used to take already existing quiz.this call quiz method of parent class
    void quiz1html(){
        super.quiz(dList,eList,fList);
    }
    //It is used to take the quiz created by user.this call quiz method of parent class
    void quiz2html(){
         if(uList.size()==0)
            System.out.println("First create qusetions");
        else
        super.quiz(uList,vList,wList);
    }
    //This is used to add questions to already existing quiz.this call add method of parent class
    void addhtml(){
        super.add(dList,eList,fList);
    }
    //This is used to add questions to users quiz or create new quiz.this call add method of parent class
    void createhtml() {
        super.add(uList,vList,wList);
    }
}
//This class inherits the abstract class quiz.It implements abstract method set.
class JavaQuiz extends Quiz{
    //The question,option and answer are saved as array list of strings.
    private  ArrayList<String> kList=new ArrayList<String>();
    private ArrayList<String> lList=new ArrayList<String>();
    private ArrayList<String> mList=new ArrayList<String>();
    private  ArrayList<String> hList=new ArrayList<String>();
    private ArrayList<String> iList=new ArrayList<String>();
    private ArrayList<String> jList=new ArrayList<String>();
    @Override
    void set(){
        String c1="Who invented Java Programming\n";
        kList.add(c1);
        String c2="Which component is used to compile, debug and execute the java programs?\n";
        kList.add(c2);
        String c3="Which of the following is not an OOPS concept in Java?\n";
        kList.add(c3);
        String c4="Which one of the following is not a Java feature?\n";
        kList.add(c4);
        String c5="Which of these cannot be used for a variable name in Java?\n";
        kList.add(c5);
        String b1="a) Guido van Rossum \t b) James Gosling \t c) Dennis Ritchie \t d) Bjarne Stroustrup\n";
        lList.add(b1);
        String b2="a) JRE \t b) JIT \t c) JDK \t d) JVM\n";
        lList.add(b2);
        String b3="a) Polymorphism \t b) Inheritance \t c) Compilation \t d) Encapsulation\n";
        lList.add(b3); 
        String b4="a) Object-oriented\tb) Use of pointers\tc) Portable\td) Dynamic and Extensible\n";
        lList.add(b4);
        String b5="a) identifier & keyword\tb) identifier\tc) keyword\td) none of the mentioned\n";
        lList.add(b5);
        String d1="b";
        mList.add(d1);
        String d2="c";
        mList.add(d2);
        String d3="c";
        mList.add(d3);
        String d4="b";
        mList.add(d4);
        String d5="c";
        mList.add(d5);
        }
        //This is used to take already existing quiz.this call quiz method of parent class
    void quiz1java(){
        super.quiz(kList, lList, mList);
    }
    //It is used to take the quiz created by user.this call quiz method of parent class
    void quiz2java(){
         if(hList.size()==0)
            System.out.println("First create qusetions");
        else
            super.quiz(hList,iList,jList);
        
    }
    //this is used to add questions to already existing quiz.this calls add method of parent class
    void addjava(){
        super.add(kList,lList,mList);
    }
    //this is used to add questions to users quiz or create new quiz.This calls add method of parent class
    void createjava(){
        super.add(hList,iList,jList);
    }
}
//Main class in which main method is defined.
public class NewMain{
    public static void main(String[] args) {
        int ch1;
        Scanner sc=new Scanner(System.in);
         do{
            System.out.println("1.C \n2.HTML \n3.Java\n4.Exit\n enter your choice");
            ch1=sc.nextInt();
            //This switch construct is used to select the topic of quiz.
            switch(ch1){
                case 1:CQuiz q1=new CQuiz();
                q1.set();
                int ch2;
                 do { 
                System.out.println("1.Attend Quiz\n 2.Add questions\n 3.create quiz\n4.exit\n enter your choice");
                ch2=sc.nextInt();
                //This switch construct is used to take quiz or add question to quiz or create quiz.
                switch(ch2) {
                    case 1:
                        int ch5;
                        do{
                        System.out.println("1.Take quiz1 \n 2.Take quiz 2\n 3.exit\n enter your choice");
                            ch5=sc.nextInt();
                            //This switch construct is used to select between already existing quiz or user defined question.
                            switch(ch5){
                                case 1:q1.quiz1c();
                                    break;
                                case 2:q1.quiz2c();
                                    break;
                                case 3:break;
                                default:System.out.println("enter valid choice");
                            } 
                    }while(ch5!=3);
                        break;
                    case 2:q1.addc();
                        break;
                    case 3:System.out.println("enter the no of questions");
                            int c=sc.nextInt();
                            for(int i=0;i<c;i++){
                                q1.createc();
                            }
                        break;
                        case 4:break;
                    default:System.out.println("enter valid choice");                   
                }
            }while(ch2!=4);
            break;
            case 2:HtmlQuiz q2=new HtmlQuiz();
                q2.set();
                int ch3;
                do{ 
                System.out.println("1.Attend Quiz\n 2.Add questions\n 3.create quiz\n4.exit\n enter your choice");
                ch3=sc.nextInt();
                //This switch construct is used to take quiz or add question to quiz or create quiz.
                switch(ch3) {
                    case 1:int ch5;
                    do{
                        System.out.println("1.Take quiz1 \n 2.Take quiz2 2\n 3.exit\n enter your choice");
                            //This switch construct is used to select between already existing quiz or user defined question.
                            ch5=sc.nextInt();
                            switch(ch5){
                                case 1:q2.quiz1html();
                                    break;
                                case 2:q2.quiz2html();
                                    break;
                                case 3:break;
                                default:System.out.println("enter valid choice");
                            }  
                    }while(ch5!=3);
                        break;
                    case 2:q2.addhtml();
                        break;
                    case 3:System.out.println("enter the no of questions");
                            int c=sc.nextInt();
                            for(int i=0;i<c;i++){
                                q2.createhtml();
                            }
                        break;
                    case 4:break;
                    default:System.out.println("enter valid choice");                   
                }
            }while(ch3!=4);
            break;
        case 3:JavaQuiz q3=new JavaQuiz();
                q3.set();
                int ch4;
                 do { 
                System.out.println("1.Attend Quiz\n 2.Add questions\n 3.create quiz\n4.exit\n enter your choice");
                ch4=sc.nextInt();
                 //This switch construct is used to take quiz or add question to quiz or create quiz.
                switch(ch4) {
                    case 1:int ch5;
                            do{
                            System.out.println("1.Take quiz1 \n 2.Take quiz2\n 3.exit\n enter your choice");
                            
                            
                             ch5=sc.nextInt();
                              //This switch construct is used to select between already existing quiz or user defined question.
                            switch(ch5){
                               case 1:q3.quiz1java();
                                    break;
                                case 2:q3.quiz2java();
                                    break;
                                case 3:break;
                                default:System.out.println("enter valid choice");
                            }    
                            }while(ch5!=3);
                        break;
                    case 2:q3.addjava();
                        break;
                    case 3:System.out.println("enter the no of questions");
                            int c=sc.nextInt();
                            for(int i=0;i<c;i++){
                                q3.createjava();
                            }
                        break;
                    case 4:break;
                    default:System.out.println("enter valid choice");                   
                }
            }while(ch4!=4);
            break;
        case 4:break;
        default : System.out.println("Enter valid choice");
         }        
    }while(ch1!=4);
}
}