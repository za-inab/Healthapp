package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;
/*
brain booster class
 */
public class BrainBoosters implements Quiz
{
    public static Random rand=new Random();
    public static Scanner scan=new Scanner(System.in);
    public static Stage window=new Stage();
    public static VBox pane1=new VBox();
    public static VBox pane2=new VBox();

    public static Scene scene ;
    public static Label score;


    public  void Questions(){
        String [] ques=new String[30];
        ques[0]="Scribble:Write::Stammer:?  a)Speak b)Walk c)Dance d)Play";
        ques[1]="Gun:Bullet::Chimney:?  a)Coal b)Wood c)Smoke d)House ";
        ques[2]="Breeze:Cyclone::Drizzle:?  a)Downpour b)Flood c)Earthquake d)Storm ";
        ques[3]="Car:Garage::Aeroplane:?  a)Port b)Depot c)Harbour d)Hangar ";
        ques[4]="Race:Fatigue::Fast:?  a)Appetite b)Hunger c)Food d)Weakness ";
        ques[5]="Candle:Wax::Paper:?  a)Tree b)Wood c)Pulp d)Bamboo";
        ques[6]="Jute:Cotton:Wool:?  a)Nylon b)Terylene c)Silk d)Rayon ";
        ques[7]="Marble:Slate:Gneiss:?  a)Limestone b)Quartzite c)Coal d)Sandstone ";
        ques[8]="Sodium:Potassium:Zinc:?  a)Calcium b)Sulphur c)Iodine d)Water ";
        ques[9]="Edge:Corner:Tip:? a)Snow  b)Brink c)Hill d)Cap ";
        ques[10]="BASIC:PASCAL:FORTRAN:?  a)Computer b)Cyclotron c)cobol d)System ";
        ques[11]="Jam:Jelly:Pickles:?  a)Grapes b)Preserve c)Marmalade d)Butter ";
        ques[12]="Peat:Lignite:Bituminous:?  a)Granite b)Coke c)Basalt d)Anthracite";
        ques[13]="Ode:Ballad:Lyrics:?  a)Epic b)Sonnet c)Precise d)Pros";
        ques[14]="Flood:Fire:Cyclone:?  a)Accident b)Rain c)Earthquake d)Damage ";
        ques[15]="Crime is related to Police in same way as Flood is related to -------  a)Dam b)River c)Rain d)Reservoir";
        ques[16]="Current is related to Ampere in the same way as Weight is related to -------  a)Commodity b)Pound c)Scale d)Measurement";
        ques[17]="Ship is related to Captain in the same way as Newspaper is related to -------  a)Reader b)Editor c)Printer d)Publisher";
        ques[18]="Blood is related to vein as Oil is related to -------  a)Pipeline b)Engine c)Petrol d)Car";
        ques[19]="Liberty:Slavery::Danger:?  a)Anger b)Safety c)Stability d)Dangerous";
        ques[20]="Boat:Oar::Bicycle:?  a)Wheel b)Road c)Chair d)Paddle ";
        ques[21]="Tree:Forest::Soldier:?  a)Battle b)Army c)Gun d)General ";
        ques[22]="Match:Win::Examination:?  a)Success b)Appear c)Attempt d)Write";
        ques[23]="Dog:Kennel::Bird:?  a)Nest b)Cage c)Fly d)Chirp";
        ques[24]="Trap:Net::Trade:?  a)Profit b)Earning c)Pursuit d)Money ";
        ques[25]="Mountain:Valley::Enemy:?  a)Fight b)Stranger c)Friend d)Country";
        ques[26]="Poles:Magnet::?:Battery  a)Cells b)Terminals c)Power d)Energy";
        ques[27]="Peace:Chaos::Creation:?  a)Destruction b)Build c)Construction d)Manufacture";
        ques[28]="Horse:Mare::?:?  a)Duck:Geese b)Dog:Puppy c)Donkey:Pony d)Fox:Vixen";
        ques[29]="Cricket:Pitch::?:?  a)Boat:Harbour b)Ship:Dock c)Wrestling:Track d)Boxing:Ring";

        String [] ans=new String[30];
        ans[0]="a";
        ans[1]="c";
        ans[2]="a";
        ans[3]="d";
        ans[4]="d";
        ans[5]="c";
        ans[6]="c";
        ans[7]="b";
        ans[8]="a";
        ans[9]="b";
        ans[10]="c";
        ans[11]="c";
        ans[12]="d";
        ans[13]="b";
        ans[14]="c";
        ans[15]="a";
        ans[16]="b";
        ans[17]="b";
        ans[18]="a";
        ans[19]="b";
        ans[20]="d";
        ans[21]="b";
        ans[22]="a";
        ans[23]="b";
        ans[24]="d";
        ans[25]="c";
        ans[26]="b";
        ans[27]="a";
        ans[28]="d";
        ans[29]="d";

        Selection(ques,ans);
    }
    public  void Selection(String ques[],String ans[]){
        String []questions=new String[6];
        String []answers=new String [6];
        int []num=new int[6];
        for(int i=0;i<6;i++)
        {
            num[i]=rand.nextInt(92454678)%30;
        }
        for(int j=0;j<6;j++) {
            for(int k=0;k<6;k++)
            if (num[k] == num[j]) {
                num[k] = rand.nextInt(92454678) % 30;
            }
        }
        Display(num,ques,ans);
    }

    public void Display(int []pos,String []ques,String[]ans)
    {
        ToggleGroup q1 = new ToggleGroup();
        ToggleGroup q2 = new ToggleGroup();
        ToggleGroup q3 = new ToggleGroup();
        ToggleGroup q4 = new ToggleGroup();
        ToggleGroup q5 = new ToggleGroup();
        ToggleGroup q6 = new ToggleGroup();

        RadioButton q1a=new RadioButton("a");
        RadioButton q1b=new RadioButton("b");
        RadioButton q1c=new RadioButton("c");
        RadioButton q1d=new RadioButton("d");
        q1a.setToggleGroup(q1);
        q1b.setToggleGroup(q1);
        q1c.setToggleGroup(q1);
        q1d.setToggleGroup(q1);

        RadioButton q2a=new RadioButton("a");
        RadioButton q2b=new RadioButton("b");
        RadioButton q2c=new RadioButton("c");
        RadioButton q2d=new RadioButton("d");
        q2a.setToggleGroup(q2);
        q2b.setToggleGroup(q2);
        q2c.setToggleGroup(q2);
        q2d.setToggleGroup(q2);

        RadioButton q3a=new RadioButton("a");
        RadioButton q3b=new RadioButton("b");
        RadioButton q3c=new RadioButton("c");
        RadioButton q3d=new RadioButton("d");
        q3a.setToggleGroup(q3);
        q3b.setToggleGroup(q3);
        q3c.setToggleGroup(q3);
        q3d.setToggleGroup(q3);

        RadioButton q4a=new RadioButton("a");
        RadioButton q4b=new RadioButton("b");
        RadioButton q4c=new RadioButton("c");
        RadioButton q4d=new RadioButton("d");

        q4a.setToggleGroup(q4);
        q4b.setToggleGroup(q4);
        q4c.setToggleGroup(q4);
        q4d.setToggleGroup(q4);

        RadioButton q5a=new RadioButton("a");
        RadioButton q5b=new RadioButton("b");
        RadioButton q5c=new RadioButton("c");
        RadioButton q5d=new RadioButton("d");
        q5a.setToggleGroup(q5);
        q5b.setToggleGroup(q5);
        q5c.setToggleGroup(q5);
        q5d.setToggleGroup(q5);

        RadioButton q6a=new RadioButton("a");
        RadioButton q6b=new RadioButton("b");
        RadioButton q6c=new RadioButton("c");
        RadioButton q6d=new RadioButton("d");
        q6a.setToggleGroup(q6);
        q6b.setToggleGroup(q6);
        q6c.setToggleGroup(q6);
        q6d.setToggleGroup(q6);

        Button submit=new Button ("Submit");

        int check=0;
        String []input=new String[6];

        pane1.getChildren().add(welcome1());

        Label l1=new Label("Enter the right option for each\n");
        l1.setFont(new Font("Calibri",20));
        l1.setTextFill(Color.web("#921a7d"));
        pane1.getChildren().add(l1);

        Label Q1=new Label();
        Q1.setText("1) "+ques[pos[0]]);
        Q1.setFont(new Font("Calibri",20));
        Q1.setTextFill(Color.web("#921a7d"));


        Label Q2=new Label();
        Q2.setText("2) "+ques[pos[1]]);
        Q2.setFont(new Font("Calibri",20));
        Q2.setTextFill(Color.web("#921a7d"));

        Label Q3=new Label();
        Q3.setText("3) "+ques[pos[2]]);
        Q3.setFont(new Font("Calibri",20));
        Q3.setTextFill(Color.web("#921a7d"));

        Label Q4=new Label();
        Q4.setText("4) "+ques[pos[3]]);
        Q4.setFont(new Font("Calibri",20));
        Q4.setTextFill(Color.web("#921a7d"));

        Label Q5=new Label();
        Q5.setText("5) "+ques[pos[4]]);
        Q5.setFont(new Font("Calibri",20));
        Q5.setTextFill(Color.web("#921a7d"));

        Label Q6=new Label();
        Q6.setText("6) "+ques[pos[5]]);
        Q6.setFont(new Font("Calibri",20));
        Q6.setTextFill(Color.web("#921a7d"));

        pane1.getChildren().addAll(Q1,q1a,q1b,q1c,q1d);
        pane1.getChildren().addAll(Q2,q2a,q2b,q2c,q2d);
        pane1.getChildren().addAll(Q3,q3a,q3b,q3c,q3d);
        pane1.getChildren().addAll(Q4,q4a,q4b,q4c,q4d);
        pane1.getChildren().addAll(Q5,q5a,q5b,q5c,q5d);
        pane1.getChildren().addAll(Q6,q6a,q6b,q6c,q6d);
        pane1.getChildren().addAll(new Label(),submit);

        //pane style
        pane1.setStyle(
                "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");

        ScrollPane sp=new ScrollPane();
        sp.setContent(pane1);
        scene=new Scene(sp,950,695);
        window.setScene(scene);
        window.show();

        Label score1=new Label("Here is your final score");
        score1.setTextFill(Color.web("#921a7d"));
        score1.setFont(new Font("Calibri",20));

        submit.setOnAction(e -> {
            int correct=0;
            correct=handler(q1a,q1b,q1c,q1d,q2a,q2b,q2c,q2d,q3a,q3b,q3c,q3d,q4a,q4b,q4c,q4d,q5a,q5b,q5c,q5d,q6a,q6b,q6c,q6d,ans,pos);
            scene=new Scene(pane2,900,600);

            User obj=new User();
            switch(correct)
            {
                case 1:
                {

                    score=new Label("Good Job.You guessed 1 answer correct");
                    score.setTextFill(Color.web("#921a7d"));
                    score.setFont(new Font("Calibri",25));
                    pane2.getChildren().addAll(FinalScore(),score1,score,obj.image());
                    //pane style
                    pane2.setStyle(
                            "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
                    window.setScene(scene);
                    window.show();
                    break;
                }
                case 2:
                {
                    score=new Label("Good Job.You guessed 2 answers correct");
                    score.setTextFill(Color.web("#921a7d"));
                    score.setFont(new Font("Calibri",25));
                    pane2.getChildren().addAll(FinalScore(),score1,score,obj.image());
                    pane2.setStyle(
                            "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
                    window.setScene(scene);
                    window.show();
                    break;
                }
                case 3:
                {
                    score=new Label("Good Job.You guessed 3 answers correct");
                    score.setTextFill(Color.web("#921a7d"));
                    score.setFont(new Font("Calibri",25));
                    pane2.getChildren().addAll(FinalScore(),score1,score,obj.image());
                    pane2.setStyle(
                            "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
                    window.setScene(scene);
                    window.show();
                    break;
                }
                case 4:
                {
                    score=new Label("Nice work by you side. You got 4 answers correct");
                    score.setTextFill(Color.web("#921a7d"));
                    score.setFont(new Font("Calibri",25));
                    pane2.getChildren().addAll(FinalScore(),score1,score,obj.image());
                    pane2.setStyle(
                            "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
                    window.setScene(scene);
                    window.show();
                    break;
                }
                case 5:
                {
                    score=new Label("Amazing you performed very well.You guessed 5 correct");
                    score.setTextFill(Color.web("#921a7d"));
                    score.setFont(new Font("Calibri",25));
                    pane2.getChildren().addAll(FinalScore(),score1,score,obj.image());
                    pane2.setStyle(
                            "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
                    window.setScene(scene);
                    window.show();
                    break;
                }
                case 6:
                {
                    score=new Label("Brilliant you guessed everything right");
                    score.setTextFill(Color.web("#921a7d"));
                    score.setFont(new Font("Calibri",25));
                    pane2.getChildren().addAll(FinalScore(),score1,score,obj.image());
                    pane2.setStyle(
                            "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
                    window.setScene(scene);
                    window.show();
                    break;
                }

            }

        });


    }
    public  VBox welcome1() {
        Label L1=new Label("**************************************************\n");
        Label L2=new Label("Hello and Welcome to Brain Boosters.\n");
        Label L3=new Label("Get ready for some question and answers.\n");
        Label L4=new Label("**************************************************\n");
        //fonts
        L1.setFont(new Font("Calibri",20));
        L1.setTextFill(Color.web("#921a7d"));
        L2.setFont(new Font("Calibri", 20)); //font name first, size second
        L2.setTextFill(Color.web("#921a7d")); //customize the text color  //fonts
        L3.setFont(new Font("Calibri", 20)); //font name first, size second
        L3.setTextFill(Color.web("#921a7d")); //customize the text color  //fonts
        L4.setFont(new Font("Calibri", 20)); //font name first, size second
        L4.setTextFill(Color.web("#921a7d")); //customize the text color
        VBox LABEL=new VBox();
        LABEL.getChildren().addAll(L1,L2,L3,L4);
        LABEL.setStyle(
                "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
        return LABEL;

    }
    public  VBox FinalScore()
    {
        Label L1=new Label("**************************************************\n");
        Label L2=new Label("Thank you for Playing Brain Boosters.\n");
        Label L3=new Label("Hope you enjoyed it as your daily exercise.\n");
        Label L4=new Label("**************************************************\n");
        //fonts
        L1.setFont(new Font("Calibri",20));
        L1.setTextFill(Color.web("#921a7d"));
        L2.setFont(new Font("Calibri", 20)); //font name first, size second
        L2.setTextFill(Color.web("#921a7d")); //customize the text color  //fonts
        L3.setFont(new Font("Calibri", 20)); //font name first, size second
        L3.setTextFill(Color.web("#921a7d")); //customize the text color  //fonts
        L4.setFont(new Font("Calibri", 20)); //font name first, size second
        L4.setTextFill(Color.web("#921a7d")); //customize the text color
        VBox LABEL=new VBox();
        LABEL.setStyle(
                "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
        LABEL.getChildren().addAll(L1,L2,L3,L4);
        return LABEL;
    }
    public int handler(RadioButton q1a,RadioButton q1b,RadioButton q1c,RadioButton q1d,RadioButton q2a,RadioButton q2b,RadioButton q2c,RadioButton q2d,RadioButton q3a,RadioButton q3b,RadioButton q3c,RadioButton q3d,RadioButton q4a,RadioButton q4b,RadioButton q4c,RadioButton q4d,RadioButton q5a,RadioButton q5b,RadioButton q5c,RadioButton q5d,RadioButton q6a,RadioButton q6b,RadioButton q6c,RadioButton q6d,String []ans,int [] pos)
    {
        int check=0;
        if (q1a.isSelected())
        {
            if(q1a.getText()==ans[pos[0]])
                check++;
        }
        else if (q1b.isSelected())
        {
            if(q1b.getText()==ans[pos[0]])
                check++;
        }
        else if (q1c.isSelected())
        {  if(q1c.getText()==ans[pos[0]])
            check++;}
        else if (q1d.isSelected())
        {  if(q1d.getText()==ans[pos[0]])
            check++;}

        if (q2a.isSelected())
        {
            if(q2a.getText()==ans[pos[1]])
            check++;
        }
        else if (q2b.isSelected())
        {
            if(q2b.getText()==ans[pos[1]])
                check++;
        }
        else if (q2c.isSelected())
        {
            if(q2c.getText()==ans[pos[1]])
                check++;
        }
        else if (q2d.isSelected())
        {
            if(q2d.getText()==ans[pos[1]])
                check++;
        }

        if (q3a.isSelected())
        {
            if(q3a.getText()==ans[pos[2]])
                check++;
        }
        else if (q3b.isSelected())
        {
            if(q3b.getText()==ans[pos[2]])
                check++;
        }
        else if (q3c.isSelected())
        {
            if(q3c.getText()==ans[pos[2]])
                check++;
        }
        else if (q3d.isSelected())
        {
            if(q3d.getText()==ans[pos[2]])
                check++;
        }

        if (q4a.isSelected())
        {
            if(q4a.getText()==ans[pos[3]])
            check++;
        }
        else if (q4b.isSelected())
        {
            if(q4b.getText()==ans[pos[3]])
                check++;
        }
        else if (q4c.isSelected())
        {
            if(q4c.getText()==ans[pos[3]])
                check++;
        }
        else if (q4d.isSelected())
        {
            if(q4d.getText()==ans[pos[3]])
                check++;
        }

        if (q5a.isSelected())
        {
            if(q5a.getText()==ans[pos[4]])
                check++;
        }
        else if (q5b.isSelected())
        {
            if(q5b.getText()==ans[pos[4]])
                check++;
        }
        else if (q5c.isSelected())
        {
            if(q5c.getText()==ans[pos[4]])
                check++;
        }
        else if (q5d.isSelected())
        {
            if(q5d.getText()==ans[pos[4]])
                check++;
        }

        if (q6a.isSelected())
        {
            if(q6a.getText()==ans[pos[5]])
                check++;
        }
        else if (q6b.isSelected())
        {
            if(q6b.getText()==ans[pos[5]])
                check++;
        }
        else if (q6c.isSelected())
        {
            if(q6c.getText()==ans[pos[5]])
                check++;
        }
        else if (q6d.isSelected())
        {
            if(q6d.getText()==ans[pos[5]])
                check++;
        }
    return check;
    }

}
