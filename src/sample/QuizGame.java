package sample;


import animatefx.animation.LightSpeedIn;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.util.Random;


public  class QuizGame extends User {
    Random rand=new Random();
    int random_num=0;
    int []num=new int[5];
    int result;

    /* ******************************************************************************************************
    array of 30 questions that randomly generates using rrandom function.
    */
 //  String[] question = {" Johnny’s mother had three children. The first child was named April.The second child was named May. What was the third child’s name?\n(a)third.\n(b)june.\n(c)Johnny.\n", " Billie was born on December 28th, yet her birthday always falls in the summer. How is this possible?\n(a)she lives in northern hemisphere \n(b)she lives in southern hemisphere\n(c)she lives in western hemisphere\n", " Which is correct to say.\n(a)The yolk of the egg is white\n(b)The yolk of the egg are white\n(c)neither\n", " A farmer has five haystacks in one field and four haystacks in another.How many haystacks would he have if he combined them all in one field?\n(a)one\n(b)nine\n(c)ten\n", " Before Mt. Everest was discovered, what was the highest mountain in the world?\n(a)not any\n(b)Mt.everest\n(c)k2\n\n", "(3-3*0+3/3)=?\n(a)1\n(b)2\n(c)4\n(d)0\n\n", "Which of the following has the most weight?\n(a)A pound of pencils\n(b)A pound of paper\n(c)A pound of paperclips\n(d)All of the above\n", "Nathan has brown hair, blue eyes, is just over 5 ft. tall and works as a butcher in a grocery store. What do you think he weighs?\n(a)150 pounds\n(b)110 pounds\n(c)Meat\n(d)200 pounds\n", "Jimmy is raising 19 cats. One day, all but 9 of them run away from home. How many does he have left?\n(a)9\n(b)10\n(c)15\n(d)16\n", "Mark's mom has 6 kids in total. Their names are Sarah, John, Nate, Kate and Max. What is the name of her other child?\n(a)Nino\n(b)Sebastian\n(c)Mark\nd)Jennifer\n", "Rhode Island is the smallest state in the US. Before it was discovered, what was the smallest state?\n(a)Hawaii\n(b)Connecticut\n(c)Rhode Island\n(d)Delaware\n", "During Leap Year, February has 29 days. What other months have 29 days during Leap Year?\n(a)July\n(b)January\n(c)December\n(d)All of them\n", "What is the next number in this pattern: 2,4,8,16,____.\n(a)32\n(b)46\n(c)48\n(d)22", "Which of the following has many holes, but is still able to contain water?\n(a)Sponge\n(b)Cheese\n(c)Honeycomb\n(d)Button\n", "You are the driver of a taxi cab. You pick up one passenger, than drop him off at a bar. You pick up two more passengers, but drop only one of them off at a restaurant. There is nothing in the trunk of the cab. What color are the driver's eyes?\n(a)Hazel\nb)Brown\nc)They are the color of YOUR eyes.\nd)Blue\n", "What is the next letter in this pattern: M, T, W, T, F, ______.\n(a)O\nb)S\nc)E\n(d)A\n", "Which of the following is the fastest?\n(a)Flu\n(b)Warm\n(c)Bug\n(d)Fish\n", "I contain many keys but they can't open any locks. What am I?\na)Keyboard\nb)Screwdriver\nc)Hammer\n(d)Universal key\n", "You can hold this, but you can't touch it, and can only see it when it's cold. What is it?\na)Ice\nb)Water\nc)Fire\nd)Breath\n", "I'm a uniform shape when it's cold, but I take the shape of others when it's warm. What am I?\n(a)Clouds\n(b)Water\nc)Fire\n(d)Air\n", "The more of me you take, the more of me you make. What am I?\n(a)Footsteps\n(b)Secrets\n(c)Silence\n(d)Sound\n", "Imagine being lost in the woods with a plastic bag and a bottle of water. You have no other tools, nor a compass. How do you get out of the woods?\n(a)Try and make a fire\n(b)Try and find a compass somewhere\n(c)Stop \"imagining\"\n(d)Walk around aimlessly\n", "Jack is an only child. Mary's hair is brown, Sam's hair is blonde and Kim's hair is black. How many brothers and sisters does Jack have?\n(a)1\n(b)4\n(c)3\n(d)None\n", "I am skinny with one eye, but I am unable to see anything. What am I?\n(a)Ribbon\n(b)Needle\n(c)Thread\n(d)Water bottle\n", "The more I dry, the more wet I become. What am I?\n(a)Fire\n (b)Picture\n(c)Towel\n(d)Secret\n", "I go up every year, but I can never come back down. What am I?\n(a)Sadness\n(b)Beauty\n+(c)Age\n(d)Intelligence\n", "Which of these has hands, but can't hold or pick up things?\n(a)Fridge\n(b)Phone\n(c)Calculator\n(d)Clock\n", "I am at the end of a rainbow, and I wouldn't be water without it. What am I?\n(a)\"W\"\n(b)Pot of gold\n(c)Purple\n(d)Green\n", "One day of the week starts with a \"Y.\" Which is it?\n(a)Monday\n(b)Tomorrow\n(c)Yesterday\n(d)Today\n", "In one year, how many seconds are there?\n(a)24\n(b)30,000\n(c)10,000\n(d)50,000\n"};

    // constructor with no arguments.
    public QuizGame() {
        random_num=0;
    }

    public  void testing(){
        Stage window=new Stage();
      /*  GridPane pane=new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(50,50,50,50));
        pane.setHgap(15);
        pane.setVgap(15);*/
        VBox pane=new VBox();
        pane.setStyle(
                "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");

     //   String[] question = {" Billie was born on December 28th, yet her birthday always falls in the summer. How is this possible?\n(a)she lives in northern hemisphere \n(b)she lives in southern hemisphere\n(c)she lives in western hemisphere\n",  "(3-3*0+3/3)=?\n(a)1\n(b)2\n(c)4\n(d)0\n\n", "Which of the following has the most weight?\n(a)A pound of pencils\n(b)A pound of paper\n(c)A pound of paperclips\n(d)All of the above\n", "Nathan has brown hair, blue eyes, is just over 5 ft. tall and works as a butcher in a grocery store. What do you think he weighs?\n(a)150 pounds\n(b)110 pounds\n(c)Meat\n(d)200 pounds\n", "Jimmy is raising 19 cats. One day, all but 9 of them run away from home. How many does he have left?\n(a)9\n(b)10\n(c)15\n(d)16\n", "Mark's mom has 6 kids in total. Their names are Sarah, John, Nate, Kate and Max. What is the name of her other child?\n(a)Nino\n(b)Sebastian\n(c)Mark\nd)Jennifer\n", "Rhode Island is the smallest state in the US. Before it was discovered, what was the smallest state?\n(a)Hawaii\n(b)Connecticut\n(c)Rhode Island\n(d)Delaware\n", "During Leap Year, February has 29 days. What other months have 29 days during Leap Year?\n(a)July\n(b)January\n(c)December\n(d)All of them\n", "What is the next number in this pattern: 2,4,8,16,____.\n(a)32\n(b)46\n(c)48\n(d)22",  "You are the driver of a taxi cab. You pick up one passenger, than drop him off at a bar. You pick up two more passengers, but drop only one of them off at a restaurant. There is nothing in the trunk of the cab. What color are the driver's eyes?\n(a)Hazel\nb)Brown\nc)They are the color of YOUR eyes.\nd)Blue\n", "What is the next letter in this pattern: M, T, W, T, F, ______.\n(a)O\nb)S\nc)E\n(d)A\n", "Which of the following is the fastest?\n(a)Flu\n(b)Warm\n(c)Bug\n(d)Fish\n", "I contain many keys but they can't open any locks. What am I?\na)Keyboard\nb)Screwdriver\nc)Hammer\n(d)Universal key\n", "You can hold this, but you can't touch it, and can only see it when it's cold. What is it?\na)Ice\nb)Water\nc)Fire\nd)Breath\n", "I'm a uniform shape when it's cold, but I take the shape of others when it's warm. What am I?\n(a)Clouds\n(b)Water\nc)Fire\n(d)Air\n", "The more of me you take, the more of me you make. What am I?\n(a)Footsteps\n(b)Secrets\n(c)Silence\n(d)Sound\n", "Imagine being lost in the woods with a plastic bag and a bottle of water. You have no other tools, nor a compass. How do you get out of the woods?\n(a)Try and make a fire\n(b)Try and find a compass somewhere\n(c)Stop \"imagining\"\n(d)Walk around aimlessly\n", "Jack is an only child. Mary's hair is brown, Sam's hair is blonde and Kim's hair is black. How many brothers and sisters does Jack have?\n(a)1\n(b)4\n(c)3\n(d)None\n", "I am skinny with one eye, but I am unable to see anything. What am I?\n(a)Ribbon\n(b)Needle\n(c)Thread\n(d)Water bottle\n", "The more I dry, the more wet I become. What am I?\n(a)Fire\n (b)Picture\n(c)Towel\n(d)Secret\n", "I go up every year, but I can never come back down. What am I?\n(a)Sadness\n(b)Beauty\n+(c)Age\n(d)Intelligence\n", "Which of these has hands, but can't hold or pick up things?\n(a)Fridge\n(b)Phone\n(c)Calculator\n(d)Clock\n", "I am at the end of a rainbow, and I wouldn't be water without it. What am I?\n(a)\"W\"\n(b)Pot of gold\n(c)Purple\n(d)Green\n", "One day of the week starts with a \"Y.\" Which is it?\n(a)Monday\n(b)Tomorrow\n(c)Yesterday\n(d)Today\n", "In one year, how many seconds are there?\n(a)24\n(b)30,000\n(c)10,000\n(d)50,000\n"};
        String[] question={"Johnny’s mother had three children. The first child was named April.The second child was named May. What was the third child’s name?\n"," Which is correct to say.\n", " A farmer has five haystacks in one field and four haystacks in another.How many haystacks would he have if he combined them all in one field?\n"," Before Mt. Everest was discovered, what was the highest mountain in the world?\n","Which of the following has many holes, but is still able to contain water?\n" };
        //choice box

        ChoiceBox<String>   q1 = new ChoiceBox<>();
        ChoiceBox<String>   q2 = new ChoiceBox<>();
        ChoiceBox<String>   q3 = new ChoiceBox<>();
        ChoiceBox<String>   q4 = new ChoiceBox<>();
        ChoiceBox<String>   q5 = new ChoiceBox<>();

        q1.getItems().addAll("(a)third.","(b)june.","(c)Johnny.");
        q2.getItems().addAll("(a)The yolk of the egg is white","(b)The yolk of the egg are white","(c)neither");
        q3.getItems().addAll("(a)one","(b)nine","(c)ten");
        q4.getItems().addAll("(a)not any","(b)Mt.everest","(c)k2");
        q5.getItems().addAll("(a)Sponge","(b)Cheese","(c)Honeycomb","(d)Button");

        for(int i=0;i<5;i++)
        {

            random_num = rand.nextInt(92457) % 50;
            num[i] = random_num;
        }
       pane.getChildren().add(welcome());

            javafx.scene.control.Label L1= new javafx.scene.control.Label(+1+")"+" "+question[0]);
            //fonts
            L1.setFont(new Font("MV Boli", 15)); //font name first, size second
            L1.setTextFill(Color.web("#921a7d")); //customize the text color
            pane.getChildren().add(L1);
            pane.getChildren().add(q1);

            q1.setOnAction(e->{
                if(q1.getValue()=="(a)third.")
                {
                    Label L=new Label("1)WRONG answer........the answer is jhonny. . Pay attention to the first part of the question");
                    pane.getChildren().add(L);
                }
                else if(q1.getValue()=="(b)june.")
                {
                    Label L=new Label("1)WRONG answer........the answer is jhonny. . Pay attention to the first part of the question");
                    pane.getChildren().add(L);
                }
                else if(q1.getValue()=="(c)Johnny.")
                {
                    Label L=new Label("1)WOW! Correct answer.......");
                    pane.getChildren().add(L);
                    result++;
                }

            });

        javafx.scene.control.Label L2= new javafx.scene.control.Label(+2+")"+" "+question[1]);
        //fonts
        L2.setFont(new Font("MV Boli", 15)); //font name first, size second
        L2.setTextFill(Color.web("#921a7d")); //customize the text color
        pane.getChildren().add(L2);
        pane.getChildren().add(q2);
        q2.setOnAction(e->{
            if(q2.getValue()=="(a)The yolk of the egg is white")
            {
                Label L=new Label("2)WRONG answer.......CORRECT ANSWER IS \"Neither\"...Egg yolks are yellow.  ");
                pane.getChildren().add(L);
            }
            else if(q2.getValue()=="(b)The yolk of the egg are white")
            {
                Label L=new Label("2WRONG answer.......CORRECT ANSWER IS \"Neither\"...Egg yolks are yellow.  ");
                pane.getChildren().add(L);
            }
            else if(q2.getValue()=="(c)neither")
            {
                Label L=new Label("2)WOW! Correct answer.......");
                pane.getChildren().add(L);
                result++;
            }
        });

        javafx.scene.control.Label L3= new javafx.scene.control.Label(+3+")"+" "+question[2]);
        //fonts
        L3.setFont(new Font("MV Boli", 15)); //font name first, size second
        L3.setTextFill(Color.web("#921a7d")); //customize the text color
        pane.getChildren().add(L3);
        pane.getChildren().add(q3);
        q3.setOnAction(e->{
            if(q3.getValue()=="(a)one")
            {
                Label L=new Label("3)WOW! Correct answer.......");
                pane.getChildren().add(L);
                result++;
            }
            else if(q3.getValue()=="(b)nine")
            {
                Label L=new Label("3)WRONG answer.......CORRECT ANSWER IS\"One\". If he combines all his haystacks, they all become one big stack.");
                pane.getChildren().add(L);
            }
            else if(q3.getValue()=="(c)ten")
            {
                Label L=new Label("3)WRONG answer.......CORRECT ANSWER IS\"One\". If he combines all his haystacks, they all become one big stack.");
                pane.getChildren().add(L);

            }
        });

        javafx.scene.control.Label L4= new javafx.scene.control.Label(+4+")"+" "+question[3]);
        //fonts
        L4.setFont(new Font("MV Boli", 15)); //font name first, size second
        L4.setTextFill(Color.web("#921a7d")); //customize the text color
        pane.getChildren().add(L4);
        pane.getChildren().add(q4);
        q4.setOnAction(e->{
            if(q4.getValue()=="(a)not any")
            {
                Label L=new Label("4)WRONG answer.......CORRECT ANSWER IS \"Mt. Everest.\" It just wasn’t discovered yet.");
                pane.getChildren().add(L);
            }
            else if(q4.getValue()=="(b)Mt.everest")
            {
                Label L=new Label("4)WOW! Correct answer.......");
                pane.getChildren().add(L);
                result++;
            }
            else if(q4.getValue()=="(c)k2")
            {
                Label L=new Label("4)WRONG answer.......CORRECT ANSWER IS \"Mt. Everest.\" It just wasn’t discovered yet.");
                pane.getChildren().add(L);
                result++;
            }
        });

        javafx.scene.control.Label L5= new javafx.scene.control.Label(+5+")"+" "+question[4]);
        //fonts
        L5.setFont(new Font("MV Boli", 15)); //font name first, size second
        L5.setTextFill(Color.web("#921a7d")); //customize the text color
        pane.getChildren().add(L5);
        pane.getChildren().add(q5);
        q5.setOnAction(e->{
            if(q5.getValue()=="(a)Sponge")
            {
                Label L=new Label("5)WOW! Correct answer.......");
                pane.getChildren().add(L);
                result++;
            }
            else if(q5.getValue()=="(b)Cheese")
            {
                Label L=new Label("5)WRONG answer.......CORRECT ANSWER IS\"sponge\". Sponges are made up of many holes, but can absorb water!");
                pane.getChildren().add(L);
            }
            else if(q5.getValue()=="(c)Honeycomb")
            {
                Label L=new Label("5)WRONG answer.......CORRECT ANSWER IS\"sponge\". Sponges are made up of many holes, but can absorb water!");
                pane.getChildren().add(L);
            }
            else if(q5.getValue()=="(d)Button")
            {Label L=new Label("5)WRONG answer.......CORRECT ANSWER IS\"sponge\". Sponges are made up of many holes, but can absorb water!");
                pane.getChildren().add(L);
            }
            Label result1=new Label("---------------------------------------------------------\n\t\tYOU GOT " +result+ "/ 5\n---------------------------------------------------------\n");
            //fonts
            result1.setFont(new Font("MV Boli", 20)); //font name first, size second
            result1.setTextFill(Color.web("#5042f4")); //customize the text color  //fonts
            pane.getChildren().add(result1);
        });
        User obj1=new User();
        pane.getChildren().add(obj1.Back());
        pane.getChildren().add(obj1.image());
        ScrollPane sp = new ScrollPane();
        sp.setContent(pane);
        //animate the pane
        new LightSpeedIn(sp).play();
        Scene scene=new Scene(sp,900,600);
        window.setScene(scene);
      //  window.setFullScreen(true);
        window.show();
        }

    //welcomemethod
     public VBox welcome() {
        Label L2=new Label("__________________________________________________\n");
        Label L3=new Label(" BRAINTEASERS TO TEST YOUR MENTAL SHARPNESS\\n");
        Label L4=new Label("__________________________________________________\n");
         //fonts
         L2.setFont(new Font("MV Boli", 20)); //font name first, size second
         L2.setTextFill(Color.web("#921a7d")); //customize the text color  //fonts
         L3.setFont(new Font("MV Boli", 20)); //font name first, size second
         L3.setTextFill(Color.web("#921a7d")); //customize the text color  //fonts
         L4.setFont(new Font("MV Boli", 20)); //font name first, size second
         L4.setTextFill(Color.web("#921a7d")); //customize the text color
        VBox LABEL=new VBox();
        LABEL.getChildren().addAll(L2,L3,L4);

         LABEL.setStyle(
                 "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
        return LABEL;

    }

}