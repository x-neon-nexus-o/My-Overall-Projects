import java.awt.*;

public class PractNo1ExcerciseQ1 extends Frame {
    PractNo1ExcerciseQ1(){
        setVisible(true);
        setSize(900,500);
        setLayout(null);

        setTitle("Label Demonstration");

        Label lblheader=new Label("Welcome To Java",Label.CENTER);
        lblheader.setBounds(0,50,900,30);
        Font font=new Font("Times New Roman",Font.BOLD,20);
        lblheader.setFont(font);
        add(lblheader);
    }
    public static void main(String[] args){
        PractNo1ExcerciseQ1 obj=new PractNo1ExcerciseQ1();
    }
}
