package sample;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.VBox;
/*
INTERFACE
 */
interface Quiz{

    public void Questions();
    public void Selection(String ques[],String ans[]);
    public void Display(int []pos,String []ques,String[]ans);
    public int handler(RadioButton q1a, RadioButton q1b, RadioButton q1c, RadioButton q1d, RadioButton q2a, RadioButton q2b, RadioButton q2c, RadioButton q2d, RadioButton q3a, RadioButton q3b, RadioButton q3c, RadioButton q3d, RadioButton q4a, RadioButton q4b, RadioButton q4c, RadioButton q4d, RadioButton q5a, RadioButton q5b, RadioButton q5c, RadioButton q5d, RadioButton q6a, RadioButton q6b, RadioButton q6c, RadioButton q6d, String []ans, int [] pos);
    public VBox FinalScore();
    public VBox welcome1();
}