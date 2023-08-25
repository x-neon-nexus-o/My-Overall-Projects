import java.awt.*;

public class ButtonDemo extends Frame {
    ButtonDemo(){
        setVisible(true);
        setSize(900,500);
        setLayout(null);

        Label lblheader=new Label("What You Wanna Choose",Label.CENTER);
        lblheader.setBounds(0,90,900,30);
        Font font=new Font("Times New Roman",Font.BOLD,20);
        lblheader.setFont(font);
        add(lblheader);


        Button Ok=new Button("Ok");
        Ok.setBounds(320,120,50,20);

        Button Reset=new Button("Reset");
        Reset.setBounds(420,120,50,20);

        Button Cancel=new Button("Cancel");
        Cancel.setBounds(520,120,50,20);

        add(Cancel);
        add(Reset);
        add(Ok);

    }
    public static void main(String args[]){
        ButtonDemo obj=new ButtonDemo();
    }
}
