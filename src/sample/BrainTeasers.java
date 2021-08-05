package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import java.util.Random;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
/*
brain teaser class
 */
public class BrainTeasers implements Quiz
{
    public static Random rand=new Random();
    public static Scanner scan=new Scanner(System.in);
    public static Stage window=new Stage();
    public static VBox pane1=new VBox();
    public static Scene scene ;
    public static VBox pane2=new VBox();
    public static Label score;

    public  void Questions(){
        String [] s=new String[30];
        s[0]="A scenery always has -------  a)Composition b)Painter c)Paints d)Mountains ";
        s[1]="A jail always has -------  a)Locks b)Lawyer c)Jailer d)Prisoner";
        s[2]="A clock always has -------  a)Battery b)Numbers c)Needles d)Alarm";
        s[3]="A race always has -------  a)Prize b)Victory c)Rivals d)Referee";
        s[4]="A school always has -------  a)Classes b)Building c)Library d)Teachers";
        s[5]="An animal always has -------  a)Skin b)Life c)Mind d)Lungs";
        s[6]="A tree always has -------  a)Shadows b)Leaves c)Roots d)Fruits";
        s[7]="Cricket always has ------  a)Pad b)Bat c)Pitch d)Gloves";
        s[8]="All animals have -------  a)Instincts b)Eyes c)Tails d)Four Legs";
        s[9]="A fan always has ------  a)Current b)Regulator c)Wire d)Blades ";
        s[10]="A Hospital always has -------  a)Bed b)Telephone c)Doctor d)Nurse";
        s[11]="A factory always has -------  a)Sellers b)Workers c)Chimney d)Electricity";
        s[12]="A Atmosphere always has -------  a)Oxygen b)Germs c)Moisture d)Air";
        s[13]="A river always has -------  a)Fishes b)Tributaries c)Boats d)Delta";
        s[14]="A mirror always -------  a)Refracts b)Reflects c)Retracts d)Reveals the truth";
        s[15]="A cupboard always has -------  a)Door b)Shelf c)Lock d)Bolt";
        s[16]="A disease always has -------  a)Patient b)Cause c)Medicine d)Germs";
        s[17]="A train always has -------  a)Rails b)Driver c)Engine d)Guard";
        s[18]="A Quilt always has -------  a)Cotton b)Cover c)Tags d)Print ";
        s[19]="A Lotus flower always has -------  a)Petals b)Water c)Root d)Mud ";
        s[20]="A mountain always has -------  a)Valley b)Snow c)Peak d)Ranger ";
        s[21]="A shoe always has -------  a)Design b)Leather c)Laces d)Sole";
        s[22]="Milk always contain -------  a)Water b)Fats c)Calcium d)Sugar";
        s[23]="A chocolate always has -------  a)Cocoa b)Milk c)Wrapper d)Nuts";
        s[24]="A song always has -------  a)Chorus b)Words c)Music d)Tymbal";
        s[25]="Controversy always involve -------  a)Dislike b)Injustice c)Disagreement d)Passion";
        s[26]="Danger leads to -------  a)Fear b)Attack c)Help d)Enemy";
        s[27]="A bulb always has -------  a)Light b)Filament c)Current d)Argon ";
        s[28]="A Book always has -------  a)Chapters b)Pages c)Content d)Pictures";
        s[29]="A camera always has -------  a)Flash b)Lens c)Stand d)Reels";

        String [] ans=new String[30];
        ans[0]="a";
        ans[1]="a";
        ans[2]="c";
        ans[3]="c";
        ans[4]="d";
        ans[5]="c";
        ans[6]="c";
        ans[7]="b";
        ans[8]="a";
        ans[9]="d";
        ans[10]="c";
        ans[11]="b";
        ans[12]="d";
        ans[13]="b";
        ans[14]="b";
        ans[15]="b";
        ans[16]="b";
        ans[17]="c";
        ans[18]="a";
        ans[19]="a";
        ans[20]="c";
        ans[21]="d";
        ans[22]="c";
        ans[23]="a";
        ans[24]="c";
        ans[25]="c";
        ans[26]="a";
        ans[27]="b";
        ans[28]="b";
        ans[29]="b";

        Selection(s,ans);
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
    public  void Display(int []pos,String []ques,String[]ans)
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
                    score.setFont(new Font("Calibri",20));
                    pane2.getChildren().addAll(FinalScore(),score1,score,obj.image());

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
                    score.setFont(new Font("Calibri",20));
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
                    score.setFont(new Font("Calibri",20));
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
                    score.setFont(new Font("Calibri",20));
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
                    score.setFont(new Font("Calibri",20));
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
                    score.setFont(new Font("Calibri",20));
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
        return LABEL;

    }
    public  VBox FinalScore()
    {
        Label L1=new Label("**************************************************\n");
        Label L2=new Label("Thank you for Playing Brain Teasers.\n");
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
        LABEL.getChildren().addAll(L1,L2,L3,L4);
        return LABEL;
    }
    public  int handler(RadioButton q1a,RadioButton q1b,RadioButton q1c,RadioButton q1d,RadioButton q2a,RadioButton q2b,RadioButton q2c,RadioButton q2d,RadioButton q3a,RadioButton q3b,RadioButton q3c,RadioButton q3d,RadioButton q4a,RadioButton q4b,RadioButton q4c,RadioButton q4d,RadioButton q5a,RadioButton q5b,RadioButton q5c,RadioButton q5d,RadioButton q6a,RadioButton q6b,RadioButton q6c,RadioButton q6d,String []ans,int [] pos)
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
