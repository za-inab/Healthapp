package sample;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.Random;
/*
USER CLASS WHICH INCLUDES USER CREDENTIALS
 */
public class User {
    public HBox image()
    {
        HBox PIC=new HBox();
        //Displaying Images with ImageView
        ImageView imageView = new ImageView("BRAIN4.jpeg");
        ImageView imageView1 = new ImageView("BRAIN4.jpeg");
        ImageView imageView2 = new ImageView("BRAIN4.jpeg");
        Image image = new Image("BRAIN4.jpeg");
        //MAKE SURE THE IMAGE OBJECT IMPORT IS FROM JAVAFX
        ImageView imageView3 = new ImageView(image); //or provide an image object

        Label labelWithImage = new Label("", imageView);
        Label labelWithImage1 = new Label("", imageView1);
        Label labelWithImage2 = new Label("", imageView2);
        PIC.setAlignment(Pos.BOTTOM_CENTER);
        PIC.getChildren().addAll(labelWithImage,labelWithImage1,labelWithImage2);
        return PIC;
    }
    public HBox happyMoment(){

        HBox hbox=new HBox();
        //Displaying Images with ImageView
        ImageView imageView = new ImageView("happyMoment.jpeg");
      //  ImageView imageView1 = new ImageView("happyMoment.jpeg");
        //ImageView imageView2 = new ImageView("happyMoment.jpeg");
        Image image = new Image("happyMoment.jpeg");
        //MAKE SURE THE IMAGE OBJECT IMPORT IS FROM JAVAFX
        ImageView imageView3 = new ImageView(image); //or provide an image object

        Label labelWithImage = new Label("", imageView);
        //Label labelWithImage1 = new Label("", imageView1);
        //Label labelWithImage2 = new Label("", imageView2);
        hbox.setAlignment(Pos.BOTTOM_CENTER);
        hbox.getChildren().add(labelWithImage);
        return hbox;
    }
    public HBox eyes(){

        HBox hbox2=new HBox();
        //Displaying Images with ImageView
        ImageView imageView = new ImageView("eyes.jpeg");
        //  ImageView imageView1 = new ImageView("happyMoment.jpeg");
        //ImageView imageView2 = new ImageView("happyMoment.jpeg");
        Image image = new Image("eyes.jpeg");
        //MAKE SURE THE IMAGE OBJECT IMPORT IS FROM JAVAFX
        ImageView imageView3 = new ImageView(image); //or provide an image object

        Label labelWithImage = new Label("", imageView);
        //Label labelWithImage1 = new Label("", imageView1);
        //Label labelWithImage2 = new Label("", imageView2);
        hbox2.setAlignment(Pos.BOTTOM_CENTER);
        hbox2.getChildren().add(labelWithImage);
        return hbox2;
    }
    public HBox Neck(){

        HBox hbox3=new HBox();
        //Displaying Images with ImageView
        ImageView imageView = new ImageView("Neck.jpeg");
        //  ImageView imageView1 = new ImageView("happyMoment.jpeg");
        //ImageView imageView2 = new ImageView("happyMoment.jpeg");
        Image image = new Image("Neck.jpeg");
        //MAKE SURE THE IMAGE OBJECT IMPORT IS FROM JAVAFX
        ImageView imageView3 = new ImageView(image); //or provide an image object

        Label labelWithImage = new Label("", imageView);
        //Label labelWithImage1 = new Label("", imageView1);
        //Label labelWithImage2 = new Label("", imageView2);
        hbox3.setAlignment(Pos.BOTTOM_CENTER);
        hbox3.getChildren().add(labelWithImage);
        return hbox3;
    }
    public HBox pcUser(){
        HBox hbox4=new HBox();
        //Displaying Images with ImageView
        ImageView imageView = new ImageView("pcUser.jpeg");
        Image image = new Image("pcUser.jpeg");
        //MAKE SURE THE IMAGE OBJECT IMPORT IS FROM JAVAFX
        ImageView imageView3 = new ImageView(image); //or provide an image object
        Label labelWithImage = new Label("", imageView);
        hbox4.getChildren().add(labelWithImage);
        hbox4.setAlignment(Pos.BOTTOM_CENTER);
        return hbox4;
    }
    public HBox concentration(){
        HBox hbox5=new HBox();
        //Displaying Images with ImageView
        ImageView imageView = new ImageView("concentration.jpeg");
        Image image = new Image("concentration.jpeg");
        //MAKE SURE THE IMAGE OBJECT IMPORT IS FROM JAVAFX
        ImageView imageView3 = new ImageView(image); //or provide an image object
        Label labelWithImage = new Label("", imageView);
        hbox5.getChildren().add(labelWithImage);
        hbox5.setAlignment(Pos.BOTTOM_CENTER);
        return hbox5;
    }
    public HBox sit(){
        HBox hbox1=new HBox();
        //Displaying Images with ImageView
        ImageView imageView = new ImageView("sit.jpeg");
        //  ImageView imageView1 = new ImageView("happyMoment.jpeg");
        //ImageView imageView2 = new ImageView("happyMoment.jpeg");
        Image image = new Image("sit.jpeg");
        //MAKE SURE THE IMAGE OBJECT IMPORT IS FROM JAVAFX
        ImageView imageView3 = new ImageView(image); //or provide an image object

        Label labelWithImage = new Label("", imageView);
        //Label labelWithImage1 = new Label("", imageView1);
        //Label labelWithImage2 = new Label("", imageView2);
        hbox1.setAlignment(Pos.BOTTOM_CENTER);
        hbox1.getChildren().add(labelWithImage);
        return hbox1;
    }
    public Button  Back(){
        //BACK TO MAIN  BUTTON
        Button Back=new Button("BACK_TO_MAIN");
        Back.setOnAction(e->{
            Main obj1=new Main();
            try {
                obj1.start(new Stage());
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        return Back;
    }

    static VBox thanks() {
        Stage window=new Stage();
        //LABEL
        Label thanks=new Label("*********************************************************************\n" +
                "THANKYOU!!!!!!!!!!!!!! WE CONSIDER YOUR RESPONCE\n" +
                "*********************************************************************\n");
        thanks.setTextFill(Color.web("#921a7d")); //customize the text color
        //fonts
        thanks.setFont(new Font("Cambria", 25)); //font name first, size second
        VBox label=new VBox();
        label.getChildren().add(thanks);
        return label;
    }


}
