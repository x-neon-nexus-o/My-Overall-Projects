import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Frame {
    Calculator(){
        Frame frame=new Frame();
        frame.setLayout(new GridLayout(7,2,10,10));
        frame.setVisible(true);
        frame.setSize(500,900);
        frame.setBackground(Color.DARK_GRAY);

        Font font=new Font("Times New Roman",Font.BOLD,20);
        Label lb1=new Label("Enter First Number",Label.RIGHT);
        Label lb2=new Label("Enter Second Number",Label.RIGHT);
        Label lb3=new Label("Result Is:",Label.RIGHT);
        lb1.setFont(font);
        lb2.setFont(font);
        lb3.setFont(font);


        TextField t1=new TextField();
        t1.setFont(font);
        TextField t2=new TextField();
        t2.setFont(font);
        TextField t3=new TextField();
        t3.setFont(font);
        t3.setEnabled(false);

        Button AddBtn=new Button("ADD");
        Button SubBtn=new Button("SUB");
        Button DivBtn=new Button("DIV");
        Button MulBtn=new Button("MUL");
        Button ModBtn=new Button("MOD");
        Button ClrBtn=new Button("CLEAR");
        AddBtn.setBackground(Color.CYAN);
        ModBtn.setBackground(Color.CYAN);
        MulBtn.setBackground(Color.CYAN);
        DivBtn.setBackground(Color.CYAN);
        SubBtn.setBackground(Color.CYAN);
        ClrBtn.setBackground(Color.CYAN);

        frame.add(lb1); frame.add(t1);
        frame.add(lb2); frame.add(t2);
        frame.add(lb3); frame.add(t3);
        frame.add(AddBtn);frame.add(SubBtn);
        frame.add(DivBtn);frame.add(MulBtn);
        frame.add(ModBtn);frame.add(ClrBtn);

        AddBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a=Integer.parseInt(t1.getText());
                int b=Integer.parseInt(t2.getText());
                int c=a+b;
                t3.setText(String.valueOf(c));
            }
        });

        SubBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a=Integer.parseInt(t1.getText());
                int b=Integer.parseInt(t2.getText());
                int c=a-b;
                t3.setText(String.valueOf(c));
            }
        });

        MulBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a=Integer.parseInt(t1.getText());
                int b=Integer.parseInt(t2.getText());
                int c=a*b;
                t3.setText(String.valueOf(c));
            }
        });

        DivBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a=Integer.parseInt(t1.getText());
                int b=Integer.parseInt(t2.getText());
                int c=a/b;
                t3.setText(String.valueOf(c));
            }
        });

        ModBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a=Integer.parseInt(t1.getText());
                int b=Integer.parseInt(t2.getText());
                int c=a%b;
                t3.setText(String.valueOf(c));
            }
        });

        ClrBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               t1.setText("");
               t2.setText("");
               t3.setText("");
            }
        });
    }



    public static void main(String[] args){
        Calculator obj=new Calculator();
    }
}
