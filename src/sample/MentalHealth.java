package sample;

import animatefx.animation.LightSpeedIn;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.util.Random;
import java.util.Scanner;

/*The data for mental health issues is collected from several websites.
 * 1)https://www.thinkmentalhealthwa.com.au/about-mental-health-wellbeing/ways-to-look-after-your-mental-health/
 * 2)https://www.mhanational.org/31-tips-boost-your-mental-health
 * 3)https://www.psychologytoday.com/us/blog/women-s-mental-health-matters/201510/9-ways-you-can-improve-your-mental-health-today
 * 4)https://www.helpguide.org/articles/mental-health/building-better-mental-health.htm
 * 5)https://mrsmindfulness.com/7-keys-improve-mental-health/
 * 6)https://psychcentral.com/blog/10-quick-easy-ways-to-improve-your-mental-health/
 * 7)https://www.uhs.umich.edu/tenthings
 * 8)https://www.heretohelp.bc.ca/infosheet/improving-mental-health
 * 9)https://www.who.int/mental_health/policy/services/essentialpackage1v8/en/ */


public class MentalHealth extends User implements Suggestion {
    Scanner scan=new Scanner(System.in);
    Random rand=new Random();
    int random_num=0;
    int []num=new int[3];

    MentalHealth()
    {
        random_num=0;
    }


    @Override
    public void Maintainance() {
        Stage window=new Stage();
        GridPane pane=new GridPane();
        pane.setAlignment(Pos.TOP_LEFT);
        pane.setPadding(new Insets(50,50,50,50));
        pane.setHgap(15);
        pane.setVgap(15);

        pane.setStyle(
                "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
        User obj=new User();

        String[] tips1 = {" Spend time with friends, loved ones and people you trust.", "Talk about or express your feelings regularly.", "Keep active and eat well", "Develop new skills and challenge your capabilities", "Relax and enjoy your hobbies", " Experiment with a new recipe, write a poem, paint or try a Pinterest project. Creative expression and overall well-being are linked.","Take time out","Get enough sleep.","Wake up early","Read something of interest and benefit daily","Have a Positive attitude","Eat well","Love yourself","Have purpose","Help others","Focus on strengths. Having positive thoughts can help you feel better","Mindfulness can help you feel better and reduce stress.Mindfulness is about being in the present (i.e not dwelling on the past or worrying about the future).","3)Spend time in nature and go for bush walks","4)Giving yourself a chance to socialise and meet new people","5)Avoid processed sugar and additives. Highly processed food has been linked to poor mental health","Track gratitude and achievement with a journal.","Take time to laugh.","Practice forgiveness","Take 30 minutes to go for a walk in nature ","Do your best to enjoy 15 minutes of sunshine","Feeling anxious?  Take a trip down memory lane and do some coloring","Boost brainpower by treating yourself to a couple pieces of dark chocolate every few days. ","Go off the grid. Leave your smart phone at home for a day and disconnect from constant emails, alerts, and other interruptions. Spend time doing something fun with someone face-to-face.","Go ahead and yawn. Studies suggest that yawning helps cool the brain and improves alertness and mental efficiency.","Be grateful, send a thank you note - not for a material item, but to let someone know why you appreciate them. Written expressions of gratitude are linked to increased happiness."};

        for(int i=0;i<3;i++)
        {

            random_num = rand.nextInt(92457) % 30;
            num[i] = random_num;
        }
      javafx.scene.control.Label L1= new javafx.scene.control.Label("Here's your daily mental health maintainance tips");
        //fonts
        L1.setFont(new Font("MV Boli", 25)); //font name first, size second
        L1.setTextFill(Color.web("#921a7d")); //customize the text color
        pane.addRow(1,L1);
        int k = 2;
        for (int j=0;j<3;j++,k++) {
            javafx.scene.control.Label L2= new javafx.scene.control.Label(j+1+")"+" "+tips1[num[j]]);
            //fonts
            L2.setFont(new Font("MV Boli", 20)); //font name first, size second
            L2.setTextFill(Color.web("#921a7d")); //customize the text color
            pane.addRow(k,L2);
        }
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
        pane.addRow(k+1,EXIT);

        //animate the pane
        new LightSpeedIn(pane).play();
        javafx.scene.control.ScrollPane sp = new ScrollPane();
        sp.setStyle(
                "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
        sp.setContent(pane);
        Scene scene=new Scene(sp);
        window.setScene(scene);
        window.show();


    }
    @Override
    public void Improvement() {
        Stage window=new Stage();
        GridPane pane=new GridPane();
        pane.setAlignment(Pos.TOP_LEFT);
        pane.setPadding(new Insets(50,50,50,50));
        pane.setHgap(15);
        pane.setVgap(15);

        pane.setStyle(
                "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
        User obj=new User();

        String[] tips1 = {"Tell yourself something positive. ","Write down something you are grateful for. ","Focus on one thing (in the moment). ","Exercise. ","Eat a good meal. ","Do your best to enjoy 15 minutes of sunshine, and apply sunscreen.\n Sunlight synthesizes Vitamin D, which experts believe is a mood elevator.","Do something for someone else. \nResearch shows that being helpful to others has a beneficial effect on how you feel about yourself. \nBeing helpful and kind—and valued for what you do—is a great way to build self-esteem.","Set realistic goals.Decide what you want to achieve academically, professionally and personally,\n and write down the steps you need to realize your goals.\n Aim high, but be realistic and don't over-schedule.\n You'll enjoy a tremendous sense of accomplishment and self-worth as you progress toward your goal.","Get your water.\n Drinking water is important because it replenishes brain cells and helps fight fatigue.","Small changes can lead to a big difference.\n Take a brisk walk on your lunch break. \nPlay outside with the kids.","Open up to someone.Knowing you are valued by others is important for helping you think more positively.","Ask for Help When Needed.There’s nothing wrong with asking for help if you’re worried about your mental health, \nand it doesn’t necessarily have to involve a professional service ","Set Life Goals.If you don’t have a clear direction in life, \nchances are your mind is constantly wading through the possibilities and stressing about the future. Whether it’s on a personal or professional level, try to set long-term goals","Keep a Diary.Keeping a diary can do worlds of good for your mental wellbeing.\n Sometimes the simple process of writing out your feelings and reactions to life’s events \ncan crystallize issues you didn’t consciously recognize.","Communicate More.No matter who you’ve got in your life — \nwhether it’s a huge family or just one best friend — communicate often.\n The more you talk about your feelings and emotions, the easier it is to identify any potentially troubling signs.","Take a break.In those moments when it all seems like too much, \nstep away, and do anything but whatever was stressing you out until you feel a little better. ","Value yourself.Treat yourself with kindness and respect, and avoid self-criticism. Make time for your hobbies and favorite projects, or broaden your horizons.","Give yourself.Volunteer your time and energy to help someone else. You'll feel good about doing something tangible to help someone in need — and it's a great way to meet new people","Learn how to deal with stress.Like it or not, stress is a part of life.So, take a nature walk, play with your pet or try journal writing as a stress reducer.","Quiet your mind.Try meditating, Mindfulness and/or prayer. Relaxation exercises and prayer can improve your state of mind and outlook on life.","Go to bed on time.A large body of research has shown that sleep deprivation has a significant negative effect on your mood. Try to go to bed at a regular time each day, and practice good habits to get better sleep. ","Break up the monotony.Although our routines make us more efficient and enhance our feelings of security and safety, a little change of pace can perk up a tedious schedule. Alter your jogging route, take a walk in a different park, hang some new pictures.","Maintain healthy, thriving relationships.Loneliness can have a staggering impact on one’s mental and emotional health, as well as one’s physical health","Check in with yourself.You could be anxious, depressed or overly stressed and not even realize it. Try to be attuned to your body and mind, and notice the symptoms that something might be awry.","Learn about mindfulness meditation.Mindfulness is a form of meditation that allows you to focus on (and even control, in some instances) your thoughts.The benefits of mindfulness are far reaching: It can lower stress, improve your relationships, enhance your focus and memory, and help you feel more at ease.","PRACTICE SELF-COMPASSION.Self-compassion is a way of relating to ourselves more kindly and studies show it makes us happier and gives us better overall emotional wellbeing (as well as a whole host of other benefits too)","KEEP IN TOUCH.We humans are social animals. We crave to feel connected and supported and to feel valued by others. Studies have shown that social connection is a vital key to good mental health.","DO SOMETHING YOU LOVE.What activities do you love doing just for the fun of it? You know the ones you really lose yourself in? Take some time each day to do things you love and just enjoy yourself."," Associate With Positive People.Associating with the right people can do worlds of good for your mental health. ","Eliminate Bad Habits."};
        for(int i=0;i<3;i++)
        {
            random_num = rand.nextInt(98435)%30;
            num[i] = random_num;
        }
        javafx.scene.control.Label L1= new javafx.scene.control.Label("Here's your daily mental health improvement tips");
        //fonts
        L1.setFont(new Font("MV Boli", 25)); //font name first, size second
        L1.setTextFill(Color.web("#921a7d")); //customize the text color
        pane.addRow(1,L1);

        int k=2;
        for (int j=0;j<3;j++,k++) {
            javafx.scene.control.Label L2= new javafx.scene.control.Label(j+1+")"+" "+tips1[num[j]]);
            //fonts
            L2.setFont(new Font("MV Boli", 20)); //font name first, size second
            L2.setTextFill(Color.web("#921a7d")); //customize the text color
            pane.addRow(k,L2);
        }
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
        pane.addRow(k+1,EXIT);
        //animate the pane
        new LightSpeedIn(pane).play();
        ScrollPane sp = new ScrollPane();
        sp.setStyle(
                "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
        sp.setContent(pane);
        Scene scene=new Scene(sp);
        window.setScene(scene);
        window.show();

    }

    @Override
    public void Therapy() {
        Stage window=new Stage();
        //layout 1
        GridPane pane=new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(50,50,50,50));
        pane.setHgap(15);
        pane.setVgap(15);

        pane.setStyle(
                "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
        User obj=new User();
//layout 2
        VBox v1=new VBox();

        javafx.scene.control.Label L1= new javafx.scene.control.Label("Hello and welcome to theraphy hub of HealthAholic");
        //fonts
        L1.setFont(new Font("MV Boli", 25)); //font name first, size second
        L1.setTextFill(Color.web("#921a7d")); //customize the text color
        pane.addRow(1,L1);

        javafx.scene.control.Label L2= new javafx.scene.control.Label("\n\n Are you suffering from any serious Mental disorder?");
        //fonts
        L2.setFont(new Font("MV Boli", 20)); //font name first, size second
        L2.setTextFill(Color.web("#921a7d")); //customize the text color
        pane.addRow(2,L2);

        Button yes=new Button("YES");
        pane.addRow(3,yes);
        yes.setOnAction(e->{
            Stage window1=new Stage();
            javafx.scene.control.Label L= new javafx.scene.control.Label("Please consult a Professional Psychologist for your improvement");
            //fonts
            L.setFont(new Font("MV Boli", 25)); //font name first, size second
            L.setTextFill(Color.web("#921a7d")); //customize the text color
            v1.getChildren().add(L);
            Button EXIT=new Button("exit");
            EXIT.setStyle(
                    "-fx-border-color: red; -fx-background-color: #921a7d;");
            EXIT.setStyle("-fx-border-color: blue;");
            EXIT.setFont(Font.font("Times New Roman",
                    FontWeight.SEMI_BOLD, 15));
            //action performed by exit button
            EXIT .setOnAction(ex-> {
                window1.close();
            });
            v1.getChildren().add(EXIT);
            v1.setStyle(
                    "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
            //animate the pane
            new LightSpeedIn(pane).play();
            //animate the pane
            new LightSpeedIn(v1).play();
            Scene scene=new Scene(v1);
            window1.setScene(scene);
            window1.show();

        });

        Button NO=new Button("NO");
        pane.addRow(4,NO);
        NO.setOnAction(e->{

            Stage window1=new Stage();
            //layout 3
            GridPane v2=new GridPane();
            v2.setAlignment(Pos.CENTER);
            v2.setPadding(new Insets(50,50,50,50));
            v2.setHgap(15);
            v2.setVgap(15);
            v2.setStyle(
                    "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
            String tips[]={"Art.This therapy uses art as a way to express emotions that individuals may find upsetting or confusing.The aim of art therapy is to provide a safe space to express your emotions without fear of judgement.Everyone will have a different experience of art therapy, but it’s a useful tool to help you process your emotions and resolve complicated and conflicting feelings.","Family therapy.The purpose of family therapy is to navigate the sometimes complex thoughts and emotions which occur in a family setting. It can help you gain a better understanding of each family member’s needs and views.Family therapy also aims to strengthen relationships by reflecting on the importance of those relationships and finding ways to make meaningful changes","Existential therapy.Existential therapy is a form of psychotherapy that addresses inner conflict and concerns about life in general.It’s useful for anyone with existential concerns - such as fear of time passing - because it helps you to confront your anxieties about life and teaches you to deal with life’s problems"};
            for(int i=0;i<3;i++)
            {

                random_num = rand.nextInt(92457) % 30;
                num[i] = random_num;
            }
            javafx.scene.control.Label L= new javafx.scene.control.Label("Try out the following activities in your daily life for long term affects");
            //fonts
            L.setFont(new Font("MV Boli", 25)); //font name first, size second
            L.setTextFill(Color.web("#921a7d")); //customize the text color
            v2.addRow(1,L);

            int k = 2;
            for (int j=0;j<3;j++,k++) {
               // javafx.scene.control.Label m= new javafx.scene.control.Label();
                javafx.scene.control.TextField m=new javafx.scene.control.TextField(j+1+")"+" "+tips[j]);
                //fonts
                m.setFont(new Font("MV Boli", 20)); //font name first, size second
              //  m.setTextFill(Color.web("#5042f4")); //customize the text color
                v2.addRow(k,m);
            }
            Button EXIT=new Button("exit");
            EXIT.setStyle(
                    "-fx-border-color: red; -fx-background-color: #db70b4;");
            EXIT.setStyle("-fx-border-color: blue;");
            EXIT.setFont(Font.font("Times New Roman",
                    FontWeight.SEMI_BOLD, 15));
            //action performed by exit button
            EXIT .setOnAction(eX -> {
                window1.close();
            });
            v2.addRow(k+1,EXIT);
            //animate the pane
            new LightSpeedIn(v2).play();
            ScrollPane sp = new ScrollPane();
            sp.setStyle(
                    "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
            sp.setContent(v2);
            Scene scene=new Scene(sp);

            window1.setScene(scene);
            window1.show();
        });
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
        pane.addRow(5,EXIT);

        //animate the pane
        new LightSpeedIn(pane).play();
        ScrollPane sp = new ScrollPane();
        sp.setStyle(
                "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");
        sp.setContent(pane);
        Scene scene=new Scene(sp);
        window.setScene(scene);
        window.show();

         }

}
