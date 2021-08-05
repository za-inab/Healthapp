package sample;
/*
all imports
 */
import animatefx.animation.*;
import javafx.application.Application;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
 import javafx.geometry.Pos;
 import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;



import java.io.File;

/*
main class
 */

public class Main extends Application {

    Stage window;
    Button old;
    Button New;
    Button EXIT;
    Scene scene;
    private static File file = new File("C:\\Users\\psf\\IdeaProjects\\ESP FX\\src\\sample\\bensound-creativeminds.mp3");
    private static final String source = file.toURI().toString();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("HEALTHAHOLIC");


        //labels
        Label welcome = new Label("WELCOME TO \"HEALTHAHOLIC\"\n\nAre You an OLD user OR New User?\n\n\n");
        new Bounce(welcome).play();
        welcome.setTextFill(Color.web("#921a7d")); //customize the text color

        //fonts
        welcome.setFont(new Font("Cambria", 25)); //font name first, size second

        //Buttons
        old = new Button("OLD USER");
        old.setStyle(
                "-fx-border-color: red; -fx-background-color: #db70b4;");
        old.setStyle("-fx-border-color: #ff00dd;");
        old.setFont(Font.font("Times New Roman",
                FontWeight.SEMI_BOLD, 15));
        New = new Button("NEW USER");
        New.setStyle(
                "-fx-border-color: red; -fx-background-color:  #db70b4;");
        New.setStyle("-fx-border-color:  #ff00dd;");
        New.setFont(Font.font("Times New Roman",
                FontWeight.SEMI_BOLD, 15));

        //TEXT AND BUTTON FOR EXIT
        Label exit = new Label("DO YOU WANT TO EXIT FROM HEALTHAHOLIC\n");
        exit.setTextFill(Color.web("#921a7d")); //customize the text color
        //fonts
        exit.setFont(new Font("Cambria", 25)); //font name first, size second

        EXIT = new Button("exit");
        EXIT.setStyle(
                "-fx-border-color: red; -fx-background-color: #db70b4;");
        EXIT.setStyle("-fx-border-color: #ff00dd;");
        EXIT.setFont(Font.font("Times New Roman",
                FontWeight.SEMI_BOLD, 15));
        //action performed by exit button
        EXIT.setOnAction(e -> {
            window.close();
        });


        //action perfomed by olduser button
        old.setOnAction(e -> {

                ScrollPane sp=new ScrollPane();
                sp.setContent(LoginMethod());
                //pane style
            sp.setStyle(
                    "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");

                //animate the pane
                new LightSpeedIn(LoginMethod()).play();
               //animate the pane
                new LightSpeedIn(sp).play();
                scene = new Scene(sp);

                window.setScene(scene);
                // window.setFullScreen(true);
                window.show();
            });
        //action performed by new user button
        New.setOnAction(e -> {
            //animate the pane
            new LightSpeedIn(newuser()).play();
                scene = new Scene(newuser());
                window.setScene(scene);
                // window.setFullScreen(true);
                window.show();
            });

        //LAYOUT
        VBox root = new VBox();
        HBox PIC = new HBox();

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
        PIC.getChildren().addAll(labelWithImage, labelWithImage1, labelWithImage2);


        //layout 2
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(50, 50, 50, 50));
        pane.setHgap(15);
        pane.setVgap(15);

        StackPane root1 = new StackPane();


        //adding nodes
        pane.addColumn(0, welcome);
        pane.addRow(1, old);
        pane.addRow(2, New);
        pane.addRow(5, exit);
        pane.addRow(6, EXIT);
        pane.addRow(7, sound());
        pane.addRow(8, root);
        pane.addRow(9, PIC);
        new LightSpeedIn(pane).play();
//pane style
        pane.setStyle(
                "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");

        //  player.play();
        scene = new Scene(pane,900,600);


        window.setScene(scene);
        //    window.setFullScreen(true);
        window.show();

    }

    private BorderPane sound() {

        /*************************************************************************
         * Sound Sytem
         *************************************************************************/
        Media media = new Media(source);
        MediaPlayer mediaplayer = new MediaPlayer(media);

        Button playButton = new Button(">");
        //fonts
        playButton.setFont(new Font("Gill Sans MT", 20)); //font name first, size second
        playButton.setTextFill(Color.web("#921a7d")); //customize the text coloR
        playButton.setOnAction(e -> {
            if (playButton.getText().equals(">")) {
                mediaplayer.play();
                playButton.setText("||");
            } else {
                mediaplayer.pause();
                playButton.setText(">");
            }
        });

        Slider slVolume = new Slider();
        slVolume.setPrefWidth(150);
        slVolume.setMaxWidth(Region.USE_PREF_SIZE);
        slVolume.setMinWidth(30);
        slVolume.setValue(50);
        mediaplayer.volumeProperty().bind(
                slVolume.valueProperty().divide(100));

        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.CENTER);
        Label v=new Label("Volume");
        v.setFont(new Font("Gill Sans MT", 20)); //font name first, size second
        v.setTextFill(Color.web("#921a7d")); //customize the text coloR
        hBox.getChildren().addAll(playButton,
                v, slVolume);

        BorderPane borderpane = new BorderPane();
        borderpane.setBottom(hBox);
        return borderpane;
    }

    /**************************************************************88
     * LOGIN METHOD WHICH USES FUNCTION OF DATABASE
     */
    public static GridPane LoginMethod() {
        GridPane login = new GridPane();
        login.setAlignment(Pos.CENTER);
        login.setPadding(new Insets(50, 50, 50, 50));
        login.setHgap(15);
        login.setVgap(15);

        //textfield
        TextField idtxt = new TextField();
        TextField nametxt = new TextField();
        nametxt.getText();

        Button button=new Button("click me");

        //labels
        Label ID = new Label("  Please enter your ID: ", idtxt);
        Label NAME = new Label("Please enter your name: ", nametxt);
        ID.setTextFill(Color.web("#921a7d")); //customize the text coloR
        //fonts
        ID.setFont(new Font("Algerian", 20)); //font name first, size second
        NAME.setTextFill(Color.web("#921a7d")); //customize the text coloR
        //fonts
        NAME.setFont(new Font("Algerian", 20)); //font name first, size second
        login.setAlignment(Pos.CENTER);
        login.addRow(1, ID);
        login.addRow(2, NAME);
        login.addRow(3,button);

        button.setOnAction(e->{
            DBConnect db0 = new DBConnect(); //creating new obj of DBConnect class
            int user_id=Integer.parseInt( idtxt.getText());
            String name= nametxt.getText();
            login.addRow(4,db0.user_login_credentials(user_id,name));
        });

        login.setStyle(
                "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
        return login;

    }//end LoginMethod

    public static ScrollPane newuser() {
        GridPane pane1 = new GridPane();
        pane1.setAlignment(Pos.CENTER);
        pane1.setPadding(new Insets(50, 50, 50, 50));
        pane1.setHgap(15);
        pane1.setVgap(15);
        javafx.scene.control.ScrollPane sp = new ScrollPane();


        Label l = new Label("Welcome new user\nDo you want to create new profile");
        Button yes = new Button("yes");
        Button no = new Button("NO");

        l.setTextFill(Color.web("#921a7d")); //customize the text coloR
        //fonts
        l.setFont(new Font("Algeria", 25)); //font name first, size second
        yes.setTextFill(Color.web("#921a7d")); //customize the text color

        //fonts
        yes.setFont(new Font("Algerian", 20)); //font name first, size second
        no.setTextFill(Color.web("#921a7d")); //customize the text color

        //fonts
        no.setFont(new Font("Algerian", 20)); //font name first, size second
        pane1.addRow(1, l);
        pane1.addRow(2, yes);
        pane1.addRow(3, no);
       // sp.setContent(pane1);
        yes.setOnAction(e -> {
            //TEXTFIELDS
            TextField t1 = new TextField();
            TextField t2 = new TextField();
            TextField t3 = new TextField();
            TextField t4 = new TextField();
            TextField t5 = new TextField();
            TextField t6 = new TextField();
            //LABELS
            Label L1 = new Label("Please enter your credentials as suggested\n");
            Label L2 = new Label("Please enter your name", t1);
            Label L3 = new Label("Please enter your Age (only years like 19,20 etc)", t2);
            Label L4 = new Label("Please enter your Height in ft (5.1,5.5,5 etc)", t3);
            Label L5 = new Label("Please enter your Weight in kgs (52,55,56.7 etc)", t4);
            Label L6 = new Label("Please enter your Blood Group without spaces (B-,AB+ etc)", t5);
            Label L7 = new Label("Please enter IQ:", t6);

            L1.setTextFill(Color.web("#921a7d")); //customize the text coloR
            //fonts
            L1.setFont(new Font("Algeria", 20)); //font name first, size second
            L2.setTextFill(Color.web("#921a7d")); //customize the text coloR
            //fonts
            L2.setFont(new Font("Gill Sans MT", 20)); //font name first, size second
            L3.setTextFill(Color.web("#921a7d")); //customize the text coloR
            //fonts
            L3.setFont(new Font("Gill Sans MT", 20)); //font name first, size second  ID.setTextFill(Color.web("#5042f4")); //customize the text coloR
            //fonts
            L4.setFont(new Font("Gill Sans MT", 20)); //font name first, size second
            L4.setTextFill(Color.web("#921a7d")); //customize the text coloR
            //fonts
            L5.setFont(new Font("Gill Sans MT", 20)); //font name first, size second
            L5.setTextFill(Color.web("#921a7d")); //customize the text coloR
            //fonts
            L6.setFont(new Font("Gill Sans MT", 20)); //font name first, size second
            L6.setTextFill(Color.web("#921a7d")); //customize the text coloR
            //fonts
            L7.setFont(new Font("Gill Sans MT", 20)); //font name first, size second
            L7.setTextFill(Color.web("#921a7d")); //customize the text coloR

            Button submit = new Button("SUBMIT");
            submit.setTextFill(Color.web("#921a7d")); //customize the text color

            //fonts
            submit.setFont(new Font("Cambria", 25)); //font name first, size second
            submit.setOnAction(ex -> {
                //calling newEntry function from DBConnect class
                DBConnect db = new DBConnect();

                String name= t1.getText();
                String age= t2.getText();
                String height= t3.getText();
                String weight= t4.getText();
                String blood_group= t5.getText();
                String iq= t6.getText();

                Label L8 = new Label("New entry created");
                //fonts
                L8.setFont(new Font("Algeria", 20)); //font name first, size second
                L8.setTextFill(Color.web("#921a7d")); //customize the text coloR
                pane1.addRow(12, L8);
                pane1.addRow(13,db.newEntry(name, iq, age, blood_group,weight,height));
                Button Letsstart=new Button("lets_Start");
                pane1.addRow(14,Letsstart);

                Letsstart.setOnAction(exc->{
                    MainMenuHandler obj=new MainMenuHandler();
                    pane1.addRow(15,obj.display());
                });
                //sp.setContent(pane1);
            });
            pane1.addRow(4, L1);
            pane1.addRow(5, L2);
            pane1.addRow(6, L3);
            pane1.addRow(7, L4);
            pane1.addRow(8, L5);
            pane1.addRow(9, L6);
            pane1.addRow(10, L7);
            pane1.addRow(11, submit);
            //animate the pane
            new LightSpeedIn(pane1).play();
            sp.setContent(pane1);
            //animate the pane
            new LightSpeedIn(sp).play();

        });
        no.setOnAction(e -> {
            //LABELS
            Label L1 = new Label("Thank you for checking in\n BYE BYE BYE");
            //fonts
            L1.setFont(new Font("Algeria", 20)); //font name first, size second
            L1.setTextFill(Color.web("#921a7d")); //customize the text coloR
            pane1.addRow(1,L1);
            //animate the pane
            new LightSpeedIn(pane1).play();
        });
        pane1.setStyle(
                "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
        return sp;

    }
}





