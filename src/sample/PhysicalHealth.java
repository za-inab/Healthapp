package sample;



import animatefx.animation.LightSpeedIn;
import animatefx.animation.RollIn;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.util.Scanner;
/*
physical class
 */

class PhysicalHealth extends User implements Suggestion{
    Scanner in =new Scanner(System.in);
    @Override
    public void Improvement() {
        Label L6=new Label("\t**************************************************\n");
        Label T1=new Label("\tFollow these 7 tips to improve your overall physical health\n\t1.Daily Exercise.\n" +
              "\t2.Eat more veggies.\n " +
              "\t3.Weight train.----------(Muscles are weakened as you age.Do resistance training to create hypertrophy (muscle bulk).)\n" +
              "\t4.Circuit train----------( weight training which enables you to continually move from one workout to another.)\n " +
              "\t5.Train functionally.--------(Incorporate some movements into your daily exercise which benefit or mimic your practiced movements in the actual world).\n" +
              "\t6.Stretching your body. -------(As you warm up and after exercise this will keep you flexible, loose and limber.)\n" +
              "\t7.Hydrate you need a minimum of 8 glasses of water per day.\n" +
              "\n\t*************************   Enjoy yoour health  *****************************\n  ");
        //fonts
       T1.setFont(new Font("MV Boli", 15)); //font name first, size second
        T1.setTextFill(Color.web("#921a7d")); //customize the text color

        //fonts
        L6.setFont(new Font("MV Boli", 15)); //font name first, size second
        L6.setTextFill(Color.web("#921a7d")); //customize the text color
        Stage window = new Stage();
        User obj=new User();
        VBox vbox=new VBox();
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
        vbox.getChildren().addAll(L6,T1,EXIT,obj.image());

        vbox.setStyle(
                "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
        new RollIn(vbox).play();
        ScrollPane sp = new ScrollPane();

        sp.setStyle(
                "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
        sp.setContent(vbox);
        //animate the pane
        new LightSpeedIn(sp).play();
        Scene scene2=new Scene(sp);
        window.setScene(scene2);
        //window.setFullScreen(true);
        window.show();

    }

    @Override
    public void Maintainance() {

        Label L1=new Label("****************DAILY MINI BOOSTERS FOR YOUR HEALTH*************");
        L1.setFont(new Font("MV Boli", 20)); //font name first, size second
        L1.setTextFill(Color.web("#921a7d")); //customize the text color
        CheckBox a1=new CheckBox("1.For more firm and vigour");
        CheckBox a2=new CheckBox("2.For relaxing Eyes");
        CheckBox a3=new CheckBox("3.For releasing tension in shoulders and neck");
        CheckBox a4=new CheckBox("4.For loosening tight wrists for PC users");
        CheckBox a5=new CheckBox("5.For more calm,cool and collectiveness");
        CheckBox a6=new CheckBox("6.For Happy moments");

        Button click=new Button("click me");
        Label L3=new Label("Please choose which minibooster you want.");
        L3.setFont(new Font("MV Boli", 20)); //font name first, size second
        L3.setTextFill(Color.web("#921a7d")); //customize the text color
        click.setOnAction(e-> handleOptions(click,a1,a2,a3,a4,a5,a6));


        Stage window = new Stage();

        User obj=new User();
        VBox vbox=new VBox();
        vbox.setStyle(
                "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");

        Button EXIT=new Button("exit");
        EXIT.setStyle(
                "-fx-border-color: red; -fx-background-color:#921a7d;");
        EXIT.setStyle("-fx-border-color: blue;");
        EXIT.setFont(Font.font("Times New Roman",
                FontWeight.SEMI_BOLD, 15));
        //action performed by exit button
        EXIT .setOnAction(e -> {
            window.close();
        });

        vbox.getChildren().addAll(L1,a1,a2,a3,a4,a5,a6,L3,click,EXIT,obj.image());
        ScrollPane sp = new ScrollPane();
        sp.setStyle(
                "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
        sp.setContent(vbox);
        //animate the pane
        new LightSpeedIn(sp).play();
        Scene scene2=new Scene(sp);
        window.setScene(scene2);
      //  window.setFullScreen(true);
        window.show();

    }

    private void handleOptions(Button click,CheckBox a1, CheckBox a2, CheckBox a3, CheckBox a4, CheckBox a5, CheckBox a6) {
        if(a1.isSelected()) {
            Stage window=new Stage();
            //layout
            GridPane pane=new GridPane();
            pane.setAlignment(Pos.CENTER);
            pane.setPadding(new Insets(50,50,50,50));
            pane.setHgap(15);
            pane.setVgap(15);

            pane.setStyle(
                    "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
            User obj=new User();

            Label l1=new Label("\t**************************************************\n1.Sit upright on chair.\n2.Hold your hands as if you are reaching out for yourself,\n" +
                    " and then stretch your arms directly infront of you.\n3.Take a deep breath and then lift your arms up vertically.\n" +
                    " Hold this position for 2 to 3 breath.\n4.After a few breaths,slowly bring your arms down whilst exhaling,\n" );

            Label l2=new Label("Relax for a moment,and then repeat this exercise two or more times. And then,we hope you have a lovely day!\n\t**************************************************\n" );

            //fonts
            l1.setFont(new Font("MV Boli", 15)); //font name first, size second
            l1.setTextFill(Color.web("#921a7d")); //customize the text color
            //fonts
            l2.setFont(new Font("MV Boli", 15)); //font name first, size second
            l2.setTextFill(Color.web("#921a7d")); //customize the text color
            pane.addRow(1,l1);
            pane.addRow(2,l2);

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
            pane.addRow(6,EXIT);
            pane.addRow(7,obj.sit());

            //animate the pane
            new LightSpeedIn(pane).play();
            ScrollPane sp = new ScrollPane();
            sp.setStyle(
                    "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
            sp.setContent(pane);
            Scene scene=new Scene(sp);
            window.setScene(scene);
           // window.setFullScreen(true);
            window.show();

        }
        if(a2.isSelected()){
            Stage window=new Stage();
            //layout
            GridPane pane=new GridPane();
            pane.setAlignment(Pos.CENTER);
            pane.setPadding(new Insets(50,50,50,50));
            pane.setHgap(15);
            pane.setVgap(15);
            User obj=new User();

            Label l1=new Label("\t**************************************************\nFor Relaxing Eyes\n 1. without moving your head,look up,then left,then down,and the right."+
           "\n2.Repeat this three times,and enjoy a brief moment of wellness for your eyes\n\t**************************************************\n");
            //fonts
            l1.setFont(new Font("MV Boli", 20)); //font name first, size second
            l1.setTextFill(Color.web("#921a7d")); //customize the text color
            pane.addRow(1,l1);

            Button EXIT=new Button("exit");
            EXIT.setStyle(
                    "-fx-border-color: red; -fx-background-color: #921a7d;");
            EXIT.setStyle("-fx-border-color: blue;");
            EXIT.setFont(Font.font("Times New Roman",
                    FontWeight.SEMI_BOLD, 15));
            //action performed by exit button
            EXIT .setOnAction(e -> {
                window.close();
            });
            pane.addRow(5,EXIT);
            pane.addRow(6,obj.eyes());
            pane.setStyle(
                    "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
            ScrollPane sp = new ScrollPane();
            sp.setStyle(
                    "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
            sp.setContent(pane);
            //animate the pane
            new LightSpeedIn(pane).play();
            Scene scene=new Scene(sp);
            window.setScene(scene);
           // window.setFullScreen(true);
            window.show();

        }
        if(a3.isSelected()){
            Stage window=new Stage();
            //layout
            GridPane pane=new GridPane();
            pane.setAlignment(Pos.CENTER);
            pane.setPadding(new Insets(50,50,50,50));
            pane.setHgap(15);
            pane.setVgap(15);

            pane.setStyle(
                    "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
            User obj=new User();

            Label l1=new Label("\t**************************************************\n\tFor releasing tension in neck and shoulders\n1.take a seat in an upright position.\n2.Move your left arm until(almost)fully stretched infront of right side \nof your right shoulder and chest.\n3.grip onto your left upper arm with your right hand and apply light pressure.\nHold for 15 seconds.\");\n" +
                    " Change sides and repeat these steps.\n Enjoy your day in less tension.\n\t**************************************************\n");
            //fonts
            l1.setFont(new Font("MV Boli", 20)); //font name first, size second
            l1.setTextFill(Color.web("#5042f4")); //customize the text color
            pane.addRow(1,l1);
            Button EXIT=new Button("exit");
            EXIT.setStyle(
                    "-fx-border-color: red; -fx-background-color: #921a7d;");
            EXIT.setStyle("-fx-border-color: blue;");
            EXIT.setFont(Font.font("Times New Roman",
                    FontWeight.SEMI_BOLD, 15));
            //action performed by exit button
            EXIT .setOnAction(e -> {
                window.close();
            });
            pane.addRow(4,EXIT);
            pane.addRow(5,obj.Neck());
            //animate the pane
            new LightSpeedIn(pane).play();
            ScrollPane sp = new ScrollPane();

            sp.setStyle(
                    "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
            sp.setContent(pane);
            Scene scene=new Scene(sp);
            window.setScene(scene);
          //  window.setFullScreen(true);
            window.show();

        }
        if(a4.isSelected()){
            Stage window=new Stage();
            //layout
            GridPane pane=new GridPane();
            pane.setAlignment(Pos.CENTER);
            pane.setPadding(new Insets(50,50,50,50));
            pane.setHgap(15);
            pane.setVgap(15);
            User obj=new User();

            Label l1=new Label("\t**************************************************\nFor loosening tight wrists\n1.Extend arm and form fist,your fingers enclosed thumb\n"+
          "2.Now tilt your hand down first for 3 seconds.\n3.Tilt hand up and hold for 3 seconds"+
           "4.Now make a slow circular motion with your hand\nrepeat this exercise 3 times and enjoy your day tension-free!\n\t**************************************************\n");
            //fonts
            l1.setFont(new Font("MV Boli", 20)); //font name first, size second
            l1.setTextFill(Color.web("#921a7d")); //customize the text color
            pane.addRow(1,l1);
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
             pane.addRow(4,EXIT);
            pane.addRow(5,obj.pcUser());

            pane.setStyle(
                    "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
            //animate the pane
            new LightSpeedIn(pane).play();
            ScrollPane sp = new ScrollPane();
            sp.setStyle(
                    "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
            sp.setContent(pane);
            Scene scene=new Scene(sp);
            window.setScene(scene);
           // window.setFullScreen(true);
            window.show();
        }
        if(a5.isSelected()){
            Stage window=new Stage();
            //layout
            GridPane pane=new GridPane();
            pane.setAlignment(Pos.CENTER);
            pane.setPadding(new Insets(50,50,50,50));
            pane.setHgap(15);
            pane.setVgap(15);
            User obj=new User();

            Label l1=new Label("\t**************************************************\n\tFor calm,cool and collectiveness.\n 1.Take a deep and slow breath in,inhaling through your nose,whilst counting to 4 in your head.\");\n" +
                    "  2.Hold your breath there for 7 seconds.\n3.Then slowly breath out through your mouth and count to 8 in your head.\n" +
                    "  Repeat these step 3 more times and take this feeling of calm with you into your day.\n\t**************************************************\n");

                    //fonts
            l1.setFont(new Font("MV Boli", 20)); //font name first, size second
            l1.setTextFill(Color.web("#921a7d")); //customize the text color
            pane.addRow(1,l1);

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
            pane.addRow(4,EXIT);
            pane.addRow(5,obj.concentration());

            pane.setStyle(
                    "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
            //animate the pane
            new LightSpeedIn(pane).play();
            ScrollPane sp = new ScrollPane();
            sp.setStyle(
                    "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
            sp.setContent(pane);
            Scene scene=new Scene(sp);
            window.setScene(scene);
           // window.setFullScreen(true);
            window.show();
        }
        if(a6.isSelected()){
            Stage window=new Stage();
            //layout
            GridPane pane=new GridPane();
            pane.setAlignment(Pos.CENTER);
            pane.setPadding(new Insets(50,50,50,50));
            pane.setHgap(15);
            pane.setVgap(15);
            User obj=new User();
            Label L6=new Label("\t**************************************************\n");
            Label l1=new Label("\tFor Happy Moments\nTake 3 breaths and then exhale.\\n1 First time you exhale, exhale with a slight smile.\n2.At second exhale, with a broad grin.\n 3.And third time, allow your self a soft easy laugh.\n" +
                    "   Feel the warmth that spread through your body and take that warm feeling with you in your day.\n\t**************************************************\n");

                    //fonts
            l1.setFont(new Font("MV Boli", 20)); //font name first, size second
            l1.setTextFill(Color.web("#5042f4")); //customize the text color
            L6.setFont(new Font("MV Boli", 20)); //font name first, size second
            L6.setTextFill(Color.web("#5042f4")); //customize the text color

            pane.addRow(1,L6);
            pane.addRow(2,l1);

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
            pane.addRow(4,EXIT);
            pane.addRow(5,obj.happyMoment());

            pane.setStyle(
                    "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
            ScrollPane sp = new ScrollPane();

            sp.setStyle(
                    "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
            sp.setContent(pane);
            //animate the pane
            new LightSpeedIn(pane).play();
            Scene scene=new Scene(sp);
            window.setScene(scene);
           // window.setFullScreen(true);
            window.show();
        }


    }

    @Override
    public void Therapy() {
        Label L6=new Label("\t**************************************************\n");
        Label T1=new Label("If you feel some symptoms in your body that is abnormal,then you must consult a professional" +
                "\n\t*************************   Enjoy yoour health  *****************************\n  ");
        //fonts
        T1.setFont(new Font("MV Boli", 20)); //font name first, size second
        T1.setTextFill(Color.web("#921a7d")); //customize the text color

        //fonts
        L6.setFont(new Font("MV Boli", 20)); //font name first, size second
        L6.setTextFill(Color.web("#921a7d")); //customize the text color

        Stage window = new Stage();

        User obj=new User();
        VBox vbox=new VBox();
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


        vbox.getChildren().addAll(L6,T1,EXIT,obj.image());

        vbox.setStyle(
                "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
        //animate the pane
        new LightSpeedIn(vbox).play();
        ScrollPane sp = new ScrollPane();
        sp.setStyle(
                "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
        sp.setContent(vbox);
        Scene scene2=new Scene(sp);
        window.setScene(scene2);
        window.show();

    }
}