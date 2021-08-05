package sample;
import animatefx.animation.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

/*
class that handles methods of main class
 */
public class MainMenuHandler extends User {


    public static VBox display() {

        Label label = new Label();
        label.setText("Welcome to mental and physical health care center with brain bosters\n that boost your mind\n WHAT ARE YOU LOOKING FOR");
        label.setTextFill(Color.web("#921a7d")); //customize the text color
         //fonts
        label.setFont(new Font("Cambria", 20)); //font name first, size second

        //choice box
        ChoiceBox<String> choiceBox = new ChoiceBox<>();

        //getItems returns the ObservableList object which you can add items to
        choiceBox.getItems().add("Physical Health");
        choiceBox.getItems().add("Mental Health");
        choiceBox.getItems().addAll("Play games that boost your iQ level", "Show User Credentials","comments you want to add or review");

       choiceBox.setOnAction(e -> handleOptions(choiceBox));

        User obj=new User();
        Label label1=new Label("\n",obj.image());
        //label with choice box
        Label label2=new Label("click me to get options",choiceBox);
        //Layout
        VBox layout = new VBox(10);
        //animate the pane
        new Bounce(layout).play();
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(label,label2,obj.Back(), label1);
//pane style
        layout.setStyle(
                "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");

        return layout;
    }

    //Handle checkbox options
    private static void handleOptions(ChoiceBox choicebox) {

        if (choicebox.getValue()=="Physical Health")
        {
            Stage window1=new Stage();
            Label txt=new Label("Here is your physical health system\nWhat are you looking for");
            txt.setTextFill(Color.web("#921a7d")); //customize the text color
            //fonts
            txt.setFont(new Font("Cambria", 25)); //font name first, size second

            RadioButton physical1=new RadioButton("1)Ways to improve your health");
            RadioButton physical2=new RadioButton("2)Ways to maintain your health");
            RadioButton physical3=new RadioButton("3)Therapy to recover from something");

            Button select=new Button("CLICK ME");
            select.setStyle(
                    "-fx-border-color: red; -fx-background-color: #7f1971;");
            select.setFont(Font.font("Times New Roman",
                    FontWeight.BOLD,  12));
            select.setOnAction(e-> handleOptions(physical1,physical2,physical3));

            //TEXT AND BUTTON FOR EXIT
            Label exit=new Label("DO YOU WANT TO EXIT FROM HEALTHAHOLIC\n");
            exit.setTextFill(Color.web("#921a7d")); //customize the text color
            //fonts
            exit.setFont(new Font("Cambria", 25)); //font name first, size second
            Button EXIT=new Button("exit");
            EXIT.setStyle(
                    "-fx-border-color: red; -fx-background-color:#7f1971;");
            EXIT.setStyle("-fx-border-color: #7f1971;");
            EXIT.setFont(Font.font("Times New Roman",
                    FontWeight.SEMI_BOLD, 15));
            //action performed by exit button
            EXIT .setOnAction(e -> {
                window1.close();
            });

            User obj=new User();
            GridPane pane=new GridPane();
            pane.setAlignment(Pos.CENTER);
            pane.setPadding(new Insets(50,50,50,50));
            pane.setHgap(15);
            pane.setVgap(15);

            //pane style
            pane.setStyle(
                    "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");

            pane.addRow(1,txt); pane.addRow(2,physical1);
            pane.addRow(3,physical2); pane.addRow(4,physical3); pane.addRow(5,select);
            pane.addRow(6,EXIT);pane.addRow(7,obj.Back());pane.addRow(9,obj.image());
            //animate the pane
            new RollIn(pane).play();
            ScrollPane SP=new ScrollPane();

            //pane style
            SP.setStyle(
                    "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");


            SP.setContent(pane);
            new RollIn(SP).play();
            Scene scene1 = new Scene(SP, 900,500);
            window1.setScene(scene1);
           // window1.setFullScreen(true);
            window1.show();

        }
        else if (choicebox.getValue()=="Mental Health")
        {
            Stage window = new Stage();
            Label txt=new Label("Here is your mental health system\nWhat are you looking for");
            txt.setTextFill(Color.web("#921a7d")); //customize the text color
            //fonts
            txt.setFont(new Font("Cambria", 25)); //font name first, size second
            CheckBox mental1=new CheckBox("1)Ways to maintain your health");
            CheckBox mental2=new CheckBox("2)Ways to improve your health");
            CheckBox mental3=new CheckBox("3)Therapy to recover from something");

            Button select=new Button("select_only_one");
            select.setStyle(
                    "-fx-border-color:  #ff00dd; -fx-background-color: #7f1971;");
            select.setFont(Font.font("Times New Roman",
                    FontWeight.BOLD,  12));
         //   select.setOnAction(e-> handleOptions(mental1,mental2,mental3));

           select.setOnAction(e->{
               if(mental1.isSelected()){
                   MentalHealth obj=new MentalHealth();
                   obj.Maintainance();
               }
               if(mental2.isSelected()){
                   MentalHealth obj=new MentalHealth();
                   obj.Improvement();
               }
               if(mental3.isSelected()){
                   MentalHealth obj=new MentalHealth();
                   obj.Therapy();
               }
           });

            //TEXT AND BUTTON FOR EXIT
            Label exit=new Label("DO YOU WANT TO EXIT FROM HEALTHAHOLIC\n");
            exit.setTextFill(Color.web("#921a7d")); //customize the text color
            //fonts
            exit.setFont(new Font("Cambria", 25)); //font name first, size second

            Button EXIT=new Button("exit");
            EXIT.setStyle(
                    "-fx-border-color: red; -fx-background-color: #db70b4;");
            EXIT.setStyle("-fx-border-color: blue;");
            EXIT.setFont(Font.font("Times New Roman",
                    FontWeight.SEMI_BOLD, 15));
            //action performed by exit button
            EXIT .setOnAction(e -> {
                window.close();
            });

            User obj=new User();
            VBox layout = new VBox(10);
            layout.setPadding(new Insets(20, 20, 20, 20));

            //pane style
            layout.setStyle(
                    "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");


            layout.getChildren().addAll(txt,mental1,mental2,mental3,select,EXIT,obj.Back(),obj.image());
            //animate the pane
            new Jello(layout).play();
          //  layout.setStyle(
            //        "-fx-border-color: red; -fx-background-color: rgba(219,137,186,0.66);");

            Scene scene1 = new Scene(layout, 900,500);
            window.setScene(scene1);
           // window.setFullScreen(true);
            window.show();

        }
            else if(choicebox.getValue()=="Play games that boost your iQ level")
        {
            Stage window=new Stage();
            Button teaser=new Button("Brain teasers");
            Button booster=new Button("Brain Boosters");
            Button riddles=new Button("Riddles");
            Button c4=new Button("CONNECT 4");

            //TEXT AND BUTTON FOR EXIT
            Label exit=new Label("DO YOU WANT TO EXIT FROM HEALTHAHOLIC\n");
            exit.setTextFill(Color.web("#921a7d")); //customize the text color
            //fonts
            exit.setFont(new Font("Cambria", 25)); //font name first, size second

            Button EXIT=new Button("exit");
            EXIT.setStyle(
                    "-fx-border-color: red; -fx-background-color: #db70b4;");
            EXIT.setStyle("-fx-border-color: blue;");
            EXIT.setFont(Font.font("Times New Roman",
                    FontWeight.SEMI_BOLD, 15));
            //action performed by exit button
            EXIT .setOnAction(e -> {
                window.close();
            });
            riddles.setOnAction(e->{
                //String[] question = {" Johnny’s mother had three children. The first child was named April.The second child was named May. What was the third child’s name?\n(a)third.\n(b)june.\n(c)Johnny.\n", " Billie was born on December 28th, yet her birthday always falls in the summer. How is this possible?\n(a)she lives in northern hemisphere \n(b)she lives in southern hemisphere\n(c)she lives in western hemisphere\n", " Which is correct to say.\n(a)The yolk of the egg is white\n(b)The yolk of the egg are white\n(c)neither\n", " A farmer has five haystacks in one field and four haystacks in another.How many haystacks would he have if he combined them all in one field?\n(a)one\n(b)nine\n(c)ten\n", " Before Mt. Everest was discovered, what was the highest mountain in the world?\n(a)not any\n(b)Mt.everest\n(c)k2\n\n", "(3-3*0+3/3)=?\n(a)1\n(b)2\n(c)4\n(d)0\n\n", "Which of the following has the most weight?\n(a)A pound of pencils\n(b)A pound of paper\n(c)A pound of paperclips\n(d)All of the above\n", "Nathan has brown hair, blue eyes, is just over 5 ft. tall and works as a butcher in a grocery store. What do you think he weighs?\n(a)150 pounds\n(b)110 pounds\n(c)Meat\n(d)200 pounds\n", "Jimmy is raising 19 cats. One day, all but 9 of them run away from home. How many does he have left?\n(a)9\n(b)10\n(c)15\n(d)16\n", "Mark's mom has 6 kids in total. Their names are Sarah, John, Nate, Kate and Max. What is the name of her other child?\n(a)Nino\n(b)Sebastian\n(c)Mark\nd)Jennifer\n", "Rhode Island is the smallest state in the US. Before it was discovered, what was the smallest state?\n(a)Hawaii\n(b)Connecticut\n(c)Rhode Island\n(d)Delaware\n", "During Leap Year, February has 29 days. What other months have 29 days during Leap Year?\n(a)July\n(b)January\n(c)December\n(d)All of them\n", "What is the next number in this pattern: 2,4,8,16,____.\n(a)32\n(b)46\n(c)48\n(d)22", "Which of the following has many holes, but is still able to contain water?\n(a)Sponge\n(b)Cheese\n(c)Honeycomb\n(d)Button\n", "You are the driver of a taxi cab. You pick up one passenger, than drop him off at a bar. You pick up two more passengers, but drop only one of them off at a restaurant. There is nothing in the trunk of the cab. What color are the driver's eyes?\n(a)Hazel\nb)Brown\nc)They are the color of YOUR eyes.\nd)Blue\n", "What is the next letter in this pattern: M, T, W, T, F, ______.\n(a)O\nb)S\nc)E\n(d)A\n", "Which of the following is the fastest?\n(a)Flu\n(b)Warm\n(c)Bug\n(d)Fish\n", "I contain many keys but they can't open any locks. What am I?\na)Keyboard\nb)Screwdriver\nc)Hammer\n(d)Universal key\n", "You can hold this, but you can't touch it, and can only see it when it's cold. What is it?\na)Ice\nb)Water\nc)Fire\nd)Breath\n", "I'm a uniform shape when it's cold, but I take the shape of others when it's warm. What am I?\n(a)Clouds\n(b)Water\nc)Fire\n(d)Air\n", "The more of me you take, the more of me you make. What am I?\n(a)Footsteps\n(b)Secrets\n(c)Silence\n(d)Sound\n", "Imagine being lost in the woods with a plastic bag and a bottle of water. You have no other tools, nor a compass. How do you get out of the woods?\n(a)Try and make a fire\n(b)Try and find a compass somewhere\n(c)Stop \"imagining\"\n(d)Walk around aimlessly\n", "Jack is an only child. Mary's hair is brown, Sam's hair is blonde and Kim's hair is black. How many brothers and sisters does Jack have?\n(a)1\n(b)4\n(c)3\n(d)None\n", "I am skinny with one eye, but I am unable to see anything. What am I?\n(a)Ribbon\n(b)Needle\n(c)Thread\n(d)Water bottle\n", "The more I dry, the more wet I become. What am I?\n(a)Fire\n (b)Picture\n(c)Towel\n(d)Secret\n", "I go up every year, but I can never come back down. What am I?\n(a)Sadness\n(b)Beauty\n+(c)Age\n(d)Intelligence\n", "Which of these has hands, but can't hold or pick up things?\n(a)Fridge\n(b)Phone\n(c)Calculator\n(d)Clock\n", "I am at the end of a rainbow, and I wouldn't be water without it. What am I?\n(a)\"W\"\n(b)Pot of gold\n(c)Purple\n(d)Green\n", "One day of the week starts with a \"Y.\" Which is it?\n(a)Monday\n(b)Tomorrow\n(c)Yesterday\n(d)Today\n", "In one year, how many seconds are there?\n(a)24\n(b)30,000\n(c)10,000\n(d)50,000\n"};
                //creating object to access the questions
                QuizGame obj=new QuizGame();
                // QuizGame[] questions={new QuizGame(obj.question[0],"c"),new QuizGame(obj.question[1],"b"), new QuizGame(obj.question[2],"c"),new QuizGame(obj.question[3],"a"),new QuizGame(obj.question[4],"b"),new QuizGame(obj.question[5],"b"),     new QuizGame(obj.question[6],"d"),new QuizGame(obj.question[7],"c"),new QuizGame(obj.question[8],"a"), new QuizGame(obj.question[9],"c"),new QuizGame(obj.question[10],"c"),new QuizGame(obj.question[11],"d"),  new QuizGame(obj.question[12],"a"),new QuizGame(obj.question[13],"a"),new QuizGame(obj.question[14],"c"),new QuizGame(obj.question[15],"b"),new QuizGame(obj.question[16],"b"),new QuizGame(obj.question[17],"a"),   new QuizGame(obj.question[18],"d"),new QuizGame(obj.question[19],"b"),new QuizGame(obj.question[20],"a"),new QuizGame(obj.question[21],"c"),new QuizGame(obj.question[22],"d"),new QuizGame(obj.question[23],"b"),new QuizGame(obj.question[24],"c"),new QuizGame(obj.question[25],"c"),new QuizGame(obj.question[26],"d"),new QuizGame(obj.question[27],"a"),new QuizGame(obj.question[28],"c"),new QuizGame(obj.question[29],"a")  };
                obj.testing();


            });
           teaser.setOnAction(e->{
               BrainTeasers object=new BrainTeasers();
               object.Questions();
           });
           booster.setOnAction(e->{
               BrainBoosters object=new BrainBoosters();
               object.Questions();
           });

            c4.setOnAction(e->{
               ConnectFour cf=new ConnectFour();
               cf.game();
            });
            // Create a pane to hold image views

            GridPane Pane = new GridPane();
            Pane.setAlignment(Pos.CENTER);
            Pane.setPadding(new Insets(50,50,50,50));
            Pane.setHgap(15);
            Pane.setVgap(15);

            //pane style
            Pane.setStyle(
                    "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");


            //user object
            User object=new User();
            Pane.addRow(1, booster);
            Pane.addRow(2, teaser);
            Pane.addRow(3,riddles);
            Pane.addRow(4,c4);
            Pane.addRow(6,exit);
            Pane.addRow(7,EXIT);
            Pane.addRow(8,object.Back());
            Pane.addRow(9,object.image());
            new Wobble(Pane).play();
            Scene scene=new Scene(Pane);
            window.setScene(scene);
          //  window.setFullScreen(true);
            window.show();
        }
            else if(choicebox.getValue()== "Show User Credentials")
        {
            Stage window = new Stage();
             User obj=new User();

            //Stage window4=new Stage();
            GridPane PANE=new GridPane();
            PANE.setAlignment(Pos.CENTER);
            PANE.setPadding(new Insets(10,10,10,10));
            PANE.setVgap(15);
            PANE.setHgap(15);

            Label L5=new Label("**************************************************\n");
            L5.setTextFill(Color.web("#921a7d")); //customize the text color
            //fonts
            L5.setFont(new Font("Cambria", 25)); //font name first, size second

            DBConnect db2 = new DBConnect();

            Text txt=new Text("For your Credentials,please enter your ID:");
            TextField txt1=new TextField();
            Button button = new Button("Click me");

            PANE.addRow(0,L5);
            PANE.addRow(1,txt);
            PANE.addRow(2,txt1);
            PANE.addRow(3,button);
            button.setOnAction( e -> {
                try{

                    int id_u = Integer.parseInt(txt1.getText());
                    PANE.addRow(4,db2.user_cred(id_u));


                }catch(NumberFormatException ex){
                    System.out.println("Error: is not a number");

                }
            } );
            txt.setStyle(
                    "-fx-border-color: red; -fx-background-color: #dbd070;");
            txt.setFont(Font.font("Times New Roman",
                    FontWeight.BOLD,  15));

            //  db2.user_cred(id_u);

            Label L6=new Label("**************************************************\n");
            L6.setTextFill(Color.web("#921a7d")); //customize the text color
            //fonts
            L6.setFont(new Font("Cambria", 25)); //font name first, size second

            //pane style
            PANE.setStyle(
                    "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");


            //TEXT AND BUTTON FOR EXIT
            Label exit=new Label("DO YOU WANT TO EXIT FROM HEALTHAHOLIC\n");
            exit.setTextFill(Color.web("#921a7d")); //customize the text color
            //fonts
            exit.setFont(new Font("Cambria", 25)); //font name first, size second

            Button EXIT=new Button("exit");
            EXIT.setStyle(
                    "-fx-border-color: red; -fx-background-color: #db70b4;");
            EXIT.setStyle("-fx-border-color: blue;");
            EXIT.setFont(Font.font("Times New Roman",
                    FontWeight.SEMI_BOLD, 15));
            //action performed by exit button
            EXIT .setOnAction(ex -> {
                window.close();
            });

            PANE.addRow(5,L6);
            PANE.addRow(6,EXIT,obj.Back());
            PANE.addRow(7,obj.image());
            //animate the pane
            new RollIn(PANE).play();
            //   PANE.setStyle(
            //        "-fx-border-color: red; -fx-background-color: rgba(219,137,186,0.66);");

            Scene scene2=new Scene(PANE,900,500);
            window.setScene(scene2);
            //window.setFullScreen(true);
            window.show();


        }
            else
        {
            Stage window = new Stage();
            TextArea comments=new TextArea("COMMENTS");
            comments.getParagraphs();

            //button
            Button SUBMIT=new Button("SUBMIT");
            SUBMIT.setOnAction(e->{
                Stage window1=new Stage();
               User obj=new User();
               obj.thanks();

                GridPane pane=new GridPane();
                pane.setAlignment(Pos.CENTER);
                pane.setPadding(new Insets(50,50,50,50));
                pane.setHgap(15);
                pane.setVgap(15);

                //pane style
                pane.setStyle(
                        "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");


                //TEXT AND BUTTON FOR EXIT
                Label exit=new Label("DO YOU WANT TO EXIT FROM HEALTHAHOLIC\n");
                exit.setTextFill(Color.web("#921a7d")); //customize the text color
                //fonts
                exit.setFont(new Font("Cambria", 25)); //font name first, size second

                Button EXIT=new Button("exit");
                EXIT.setStyle(
                        "-fx-border-color: red; -fx-background-color: #db70b4;");
                EXIT.setStyle("-fx-border-color: blue;");
                EXIT.setFont(Font.font("Times New Roman",
                        FontWeight.SEMI_BOLD, 15));
                //action performed by exit button
                EXIT .setOnAction(ex -> {
                    window.close();
                });

                pane.addRow(1,obj.thanks());
                pane.addRow(2,exit);
                pane.addRow(3,EXIT);
                pane.addRow(4,obj.Back());
                pane.addRow(5,obj.image());
                //animate the pane
                new Shake(pane).play();
                Scene scene=new Scene(pane);
                window1.setScene(scene);
               // window1.setFullScreen(true);
                window1.show();

            } );
            Button EXIT=new Button("exit");
            EXIT.setStyle(
                    "-fx-border-color: red; -fx-background-color: #db70b4;");
            EXIT.setStyle("-fx-border-color: blue;");
            EXIT.setFont(Font.font("Times New Roman",
                    FontWeight.SEMI_BOLD, 15));
            //action performed by exit button
            EXIT .setOnAction(ex -> {
                window.close();
            });
            User obj=new User();

            GridPane pane=new GridPane();
            pane.setAlignment(Pos.CENTER);
            pane.setPadding(new Insets(50,50,50,50));
            pane.setHgap(15);
            pane.setVgap(15);

            //pane style
            pane.setStyle(
                    "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");


            pane.addRow(1,comments);
            pane.addRow(2,SUBMIT);
            pane.addRow(3,obj.Back(),EXIT);
            pane.addRow(5,obj.image());
            //animate the pane
            new RubberBand(pane).play();
            Scene scene=new Scene(pane);
          //  window.setFullScreen(true);
            window.setScene(scene);
            window.show();

        }


    }

    private static void handleOptions( CheckBox mental1, CheckBox mental2, CheckBox mental3) {
       if(mental1.isSelected()){
            MentalHealth obj=new MentalHealth();
            obj.Maintainance();
       }
        if(mental2.isSelected()){
            MentalHealth obj=new MentalHealth();
            obj.Improvement();
        }
        if(mental3.isSelected()){
            MentalHealth obj=new MentalHealth();
            obj.Therapy();
        }


    }

    private static void handleOptions( RadioButton physical1, RadioButton physical2, RadioButton physical3) {
        if(physical1.isSelected())
        {
            //creating object for physical health class
            PhysicalHealth obj=new PhysicalHealth();
            obj.Improvement();
        }
        if(physical2.isSelected())
        {
            //creating object for physical health class
            PhysicalHealth obj=new PhysicalHealth();
            obj.Maintainance();
        }
        if(physical3.isSelected())
        {
            //creating object for physical health class
            PhysicalHealth obj=new PhysicalHealth();
            obj.Therapy();
        }

    }


}