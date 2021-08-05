package sample;
import animatefx.animation.LightSpeedIn;
import animatefx.animation.Shake;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.sql.*;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;

import static sample.Main.LoginMethod;

//import static sample.Main.LoginMethod;
/*
database class
 */
public class DBConnect {

    public static void main(String[] args){

        printAll();

    }//ends main
    public static void printAll(){
        try{
            String host="jdbc:mysql://localhost:3306/user";
            String uName="root";
            String uPass="a4a4#H7@i2";
            Connection con = DriverManager.getConnection(host,uName,uPass);

            Statement stat = con.createStatement();
            String sql = "SELECT *FROM user_table";
            ResultSet rs = stat.executeQuery(sql);

            System.out.println("ID  NAME  AGE  BG  IQ  WGT  HGT");
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString("Name");
                String age = rs.getString("Age");
                String blood_group = rs.getString("Blood_Group");
                String Iq = rs.getString("IQ");
                String weight = rs.getString("Weight");
                String height = rs.getString("Height");

                String p = id + "\t" + name + "\t" + age + "\t" + blood_group + "\t" + Iq + "\t" + weight + "\t" + height;
                System.out.println(p);
            }//ends while loop

        }
        catch(SQLException err){
            System.out.println(err.getMessage());
        }
    }//ends method printAll

    public static Label newEntry(String name, String iq1, String age1, String bg, String weight1, String height1 ){

        final String n1=name;
        final var iq=iq1;
        final String age=age1;
        final String BG=bg;
        final String wgt=weight1;
        final String hgt=height1;
        final int iD;

        try{
            String host="jdbc:mysql://localhost:3306/user";
            String uName="root";
            String uPass="a4a4#H7@i2";
            Connection con = DriverManager.getConnection(host,uName,uPass);
            PreparedStatement posted =con.prepareStatement("INSERT INTO user_table (Name,Age,Blood_Group,IQ,Weight,Height) VALUES('"+ n1 +"','"+ age +"','"+bg+"','"+iq+"','"+wgt+"','"+hgt+"')");
            posted.executeUpdate();

            Statement stmt1     = con.createStatement();
            ResultSet rs  = stmt1.executeQuery("select ID  from user_table where Name='" + n1 + "'");
            while (rs.next()) {
                String id_value = rs.getString(1);
               Label l=new Label("The id is: \"" + id_value +"\" Remember this for further use");
                //fonts
                l.setFont(new Font("Gill Sans MT", 20)); //font name first, size second
                l.setTextFill(Color.web("#921a7d")); //customize the text coloR
               return l;

            }
        }
        catch(Exception e){
            System.out.println("you entered wrong data with wrong datatypes plz try again");
        }
        return null;
    }//ends method newEntry


    public static GridPane user_login_credentials(int id, String name){

        int id0=id;
        String name0=name;

        try{
            String host="jdbc:mysql://localhost:3306/user";
            String uName="root";
            String uPass="a4a4#H7@i2";
            Connection con = DriverManager.getConnection(host,uName,uPass);
            Statement stmt1     = con.createStatement();
            ResultSet rs1   = stmt1.executeQuery("select * From user_table where (ID='"+id0+"' && Name='"+name0+"')");
            boolean isPresent = rs1.next();

            GridPane pane = new GridPane();
            pane.setAlignment(Pos.CENTER);
            pane.setPadding(new Insets(50, 50, 50, 50));
            pane.setHgap(15);
            pane.setVgap(15);
           Stage window=new Stage();

            if(isPresent){
                Label L1=new Label( "Verified!!!!!!!");
                //fonts
                L1.setFont(new Font("Gill Sans MT", 20)); //font name first, size second
                L1.setTextFill(Color.web("#921a7d")); //customize the text coloR

                Label l1=new Label("Welcome " + name);
                //fonts
                l1.setFont(new Font("Gill Sans MT", 20)); //font name first, size second
                l1.setTextFill(Color.web("#921a7d")); //customize the text coloR

                Button letsstart=new Button("LETS START");
                //fonts
                letsstart.setFont(new Font("Gill Sans MT", 20)); //font name first, size second
                letsstart.setTextFill(Color.web("#921a7d")); //customize the text coloR
                pane.addRow(1,L1);
                pane.addRow(2,l1);
                pane.addRow(3,letsstart);
                letsstart.setOnAction(e->{
                    MainMenuHandler obj = new MainMenuHandler();
                    //TEXT AND BUTTON FOR EXIT
                    Label exit = new Label("DO YOU WANT TO EXIT FROM HEALTHAHOLIC\n");
                    exit.setTextFill(Color.web("#921a7d")); //customize the text color
                    //fonts
                    exit.setFont(new Font("Cambria", 25)); //font name first, size second

                    Button EXIT = new Button("exit");
                    EXIT.setStyle(
                            "-fx-border-color: red; -fx-background-color: #db70b4;");
                    EXIT.setStyle("-fx-border-color: blue;");
                    EXIT.setFont(Font.font("Times New Roman",
                            FontWeight.SEMI_BOLD, 15));
                    //action performed by exit button
                    EXIT.setOnAction(ea-> {
                        window.close();
                    });
                    pane.addRow(4, obj.display());
                    pane.addRow(5, exit);
                    pane.addRow(6, EXIT);

                    //pane style
                    pane.setStyle(
                            "-fx-border-color: red; -fx-background-color: rgba(154,22,68,0.16);");

                    //animate the pane
                    new LightSpeedIn(pane).play();
                    Scene scene = new Scene(pane);
                    window.setScene(scene);
                    // window.setFullScreen(true);
                    window.show();

                });

                return pane;
            }
            else {
                Label L1=new Label( "Wrong credentials");
                //fonts
                L1.setFont(new Font("Gill Sans MT", 20)); //font name first, size second
                L1.setTextFill(Color.web("#921a7d")); //customize the text coloR

                Button tryagain=new Button("tryagain");
                //fonts
                tryagain.setFont(new Font("Gill Sans MT", 20)); //font name first, size second
                tryagain.setTextFill(Color.web("#921a7d")); //customize the text coloR

                pane.addRow(1,L1);
                pane.addRow(2,tryagain);
                tryagain.setOnAction(e->{
                    LoginMethod();
                });
                return pane; }
        }
        catch(Exception e){
            System.out.println("you input different type of data try using best types");
        }

        return null;
    }
    public static VBox user_cred(int user_id){
        int u_id=user_id;
        try {
            String host = "jdbc:mysql://localhost:3306/user";
            String uName = "root";
            String uPass = "a4a4#H7@i2";
            Connection con = DriverManager.getConnection(host, uName, uPass);

            Statement stmt1 = con.createStatement();
            ResultSet rs = stmt1.executeQuery("select * from user_table where ID='" + u_id + "'");
            while (rs.next()) {
                String id_value = rs.getString(1);
                String name_value =rs.getString(2);
                String Age = rs.getString(3);
                String Blood_Group = rs.getString(4);
                String IQ = rs.getString(5);
                String Weight = rs.getString(6);
                String Height = rs.getString(7);
                Label credencials=new Label("Name:"+name_value+"\nAge:"+Age+"\nBlood_Group:"+Blood_Group+"\nIQ:"+IQ+"\nWeight:"+Weight+"\nHeight:"+Height);
                credencials.setTextFill(Color.web("#921a7d")); //customize the text color
                //fonts
                credencials.setFont(new Font("Cambria", 25)); //font name first, size second
                VBox vbox=new VBox();
                vbox.setAlignment(Pos.CENTER);
                //animate the pane
                new Shake(vbox).play();
                vbox.getChildren().add(credencials);
                return vbox;
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return null;
    }//ends user cred
}
/******************/
