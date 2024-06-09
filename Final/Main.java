import java.util.*;
class QuizGenerator{
    int score=0;
    private String ans1[]=new String[30];
    ArrayList<String> a=new ArrayList<String>();
    ArrayList<String> b=new ArrayList<String>();
    ArrayList<String> c=new ArrayList<String>();
    String top[]=new String[30];
     Scanner sc=new Scanner(System.in);
     void setList( ArrayList<String> a,ArrayList<String> b,ArrayList<String> c){
        this.a=a;
        this.b=b;
        this.c=c;
     }
     
    void setQues(String d,String e,String f){
        a.add(d);
        b.add(e);
        c.add(f);
    }
    void getTop(){
        for(int i=0;i<top.length;i++){
            System.out.println(i+1+" "+top[i]);
        }
    }
      
    //This method is used to add questions to the quiz
    void add(){
        sc.nextLine();
        System.out.println("enter the question");
        String s=sc.nextLine();
        a.add(s);
        System.out.println("enter 4 options(tab seperated)");
        String k=sc.nextLine();
        b.add(k);
        System.out.println("enter the answer");
        String l=sc.nextLine();
        c.add(l);        
    }
    //This method is used to print the quiz.
     void quiz(){
        score=0;
            for(int i=0;i<a.size();i++){
                System.out.println(i+1+"."+a.get(i));
                System.out.println(b.get(i));
                ans1[i]=sc.next();
                System.out.println();
                if(ans1[i].equals(c.get(i)))
                    score++;
                System.out.println("Correct answer is "+c.get(i)+"\n");             
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
class CQuiz extends QuizGenerator{
    private  ArrayList<String> kList=new ArrayList<String>();
    private ArrayList<String> lList=new ArrayList<String>();
    private ArrayList<String> mList=new ArrayList<String>();
    void set(QuizGenerator q){
        String c1="A preprocessor directive is a statement that begins with_____\n";
        String c2="How to write a comment on a single line?\n";
        String c3="What is the name of the main function of a C program?\n";
        String c4="All keywords in C are in ____________";
        String c5="Which of the following declaration is not supported by C language?";
        String b1="a.{ \t b.#\t c.// \t d./*\n";
        String b2="a./* my comment \t b.// my comment // \t c.// my comment \t d. /* my comment */\n";
        String b3="a. principal \t b. main \t c. any name \t d.begin\n";
        String b4="a) LowerCase letters\tb) UpperCase letters\tc) CamelCase letters\td) None of the mentioned";
        String b5="a) String str;\tb) char *str;\tc) float str = 3e2;\td) Both “String str;” and “float str = 3e2;”";
        String d1="b";
        String d2="b,c,d";
        String d3="b";
        String d4="a";
        String d5="a";
        super.setList(kList,lList,mList);
        super.setQues(c1,b1,d1);
        super.setQues(c2,b2,d2);
        super.setQues(c3,b3,d3);
        super.setQues(c4,b4,d4);
        super.setQues(c5,b5,d5);
    }
     void get(){
            super.quiz();
        }
}
class HtmlQuiz extends QuizGenerator{
    ArrayList<String> dList=new ArrayList<String>();
    ArrayList<String> eList=new ArrayList<String>();
    ArrayList<String> fList=new ArrayList<String>();
    void set(QuizGenerator q){
        String c1="Who is the father of HTML?\n";
        String c2="HTML stands for __________\n";
        String c3="What is the correct syntax of doctype in HTML5\n";
        String c4="Which of the following is used to read an HTML page and render it?";
        String c5="Which of the following tag is used for inserting the largest heading in HTML?";
        String b1="a) Rasmus Lerdorf \t b) Tim Berners-Lee \t c) Brendan Eich \t d) Sergey Brin \n";
        String b2="a) HyperText Markup Language \t b) HyperText Machine Language \t c) HyperText Marking Language \t d) HighText Marking Language \n";
        String b3="a) </doctype html> \t b) <doctype html> \t c) <doctype html!> \t d) <!doctype html>\n";
        String b4="a) Web server\tb) Web network\tc) Web browser\td) Web matrix";
        String b5="a) head\tb) <h1>\tc) <h6>\td) heading";
        String d1="b";
        String d2="a";
        String d3="d";
        String d4="c";
        String d5="b";
        super.setList(dList, eList, fList);
        super.setQues(c1,b1,d1);
        super.setQues(c2,b2,d2);
        super.setQues(c3,b3,d3);
        super.setQues(c4,b4,d4);
        super.setQues(c5,b5,d5);
    }
     void get(){
            super.quiz();
        }
}
class JavaQuiz extends QuizGenerator{
    ArrayList<String> uList=new ArrayList<String>();
    ArrayList<String> vList=new ArrayList<String>();
    ArrayList<String> wList=new ArrayList<String>();
    void set(QuizGenerator q){
        String c1="Who invented Java Programming\n";
        String c2="Which component is used to compile, debug and execute the java programs?\n";
        String c3="Which of the following is not an OOPS concept in Java?\n";
        String c4="Which one of the following is not a Java feature?\n";
        String c5="Which of these cannot be used for a variable name in Java?\n";
        String b1="a) Guido van Rossum \t b) James Gosling \t c) Dennis Ritchie \t d) Bjarne Stroustrup\n";
        String b2="a) JRE \t b) JIT \t c) JDK \t d) JVM\n";
        String b3="a) Polymorphism \t b) Inheritance \t c) Compilation \t d) Encapsulation\n";
        String b4="a) Object-oriented\tb) Use of pointers\tc) Portable\td) Dynamic and Extensible\n";
        String b5="a) identifier & keyword\tb) identifier\tc) keyword\td) none of the mentioned\n";
        String d1="b";
        String d2="c";
        String d3="c";
        String d4="b";
        String d5="c";
        super.setList(uList, vList, wList);
        super.setQues(c1,b1,d1);
        super.setQues(c2,b2,d2);
        super.setQues(c3,b3,d3);
        super.setQues(c4,b4,d4);
        super.setQues(c5,b5,d5);
        }
        void get(){
            super.quiz();
        }
}
class Topic extends QuizGenerator {
  Scanner sc = new Scanner(System.in);
  private ArrayList<String> hList = new ArrayList<String>();
  private ArrayList<String> iList = new ArrayList<String>();
  private ArrayList<String> jList = new ArrayList<String>();
   String topicName; // Store topic name for the current object

  void set() {
    super.setList(hList, iList, jList);
    super.add(); // Add questions for the chosen topic
  }

  void get() {
    super.quiz();
  }
}

public class Main {
  static ArrayList<String> top = new ArrayList<String>();
    static void setTopic(String k){
            top.add(k);
        }
       static void getTopic(){
            for(int i=0;i<top.size();i++){
                System.out.println(top.get(i));
            }
       }
  public static void main(String[] args) {
    int ch;
    Scanner sc = new Scanner(System.in);
    QuizGenerator q = new QuizGenerator();
    ArrayList<Topic> topics = new ArrayList<Topic>();

    CQuiz c = new CQuiz();
    c.set(q);
    setTopic("C"); // Pre-populate topics
    HtmlQuiz h = new HtmlQuiz();
    h.set(q);
    setTopic("Html");

    JavaQuiz j = new JavaQuiz();
    j.set(q);
    setTopic("Java");

    do {
      System.out.println("1. Create quiz\n2. Take quiz\n3. Add questions\n4. Exit");
      System.out.println("Enter your choice");
      ch = sc.nextInt();

      switch (ch) {
        case 1:
          String k;
          int i=0;
          System.out.println("Enter the topic");
          k = sc.next();
          // Reuse the same Topic object for new questions
          Topic t = new Topic();
          topics.add(t);
          setTopic(k); 
          t.set();
          i++;
          break;
        case 2:
          int d;
          do {
           int n=0;
           int b=1;
            getTopic();
            System.out.println("Exit\nEnter your choice");
            d=sc.nextInt();
            if(d==b){
              c.quiz();
            }
            b++;
            if(d==b){
              h.quiz();
            }
            b++;
            if(d==b){
              j.quiz();
            }
            b++;
            if(d<=top.size()){
            if(d==b){
              topics.get(n).quiz();
              n++;
            }
            b++;
            }
            else{
              break;
            }
            
          } while (d != 0); // Exit quiz taking loop on entering 0
          break;
        case 3:
         int y;
          do {
           int n=0;
           int b=1;
            getTopic();
            System.out.println("Exit\nEnter your choice");
            y=sc.nextInt();
            if(y==b){
              c.add();
            }
            b++;
            if(y==b){
              h.add();
            }
            b++;
            if(y==b){
              j.add();
            }
            b++;
            if(y<=top.size()){
            if(y==b){
              topics.get(n).set();
              n++;
            }
            b++;
            }
            else{
              break;
            }
            
          } while (y != 0); // Exit quiz taking loop on entering 0
          break;
        case 4:
          break;
        default:
          System.out.println("Invalid choice.");
      }
    } while (ch != 4);
  }
}
