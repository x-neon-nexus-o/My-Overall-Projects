import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class Biodata extends Frame {
    Biodata() {
        setVisible(true);
        setSize(900, 500);
        setLayout(null);

        setTitle("Biodata Form");

        Label lblheader = new Label("Biodata Form", Label.CENTER);
        lblheader.setBounds(0, 50, 900, 30);
        Font font = new Font("Arial", Font.BOLD, 20);
        lblheader.setFont(font);
        lblheader.setBackground(Color.LIGHT_GRAY);
        lblheader.setForeground(Color.BLACK);
        add(lblheader);

        Label lblname = new Label("Enter Name", Label.RIGHT);
        lblname.setBounds(0, 100, 200, 30);
        add(lblname);

        TextField tname = new TextField();
        tname.setBounds(210, 100, 200, 30);
        add(tname);

        Label lblEmail = new Label("Enter Email", Label.RIGHT);
        lblEmail.setBounds(0, 150, 200, 30);
        add(lblEmail);

        TextField temail = new TextField();
        temail.setBounds(210, 150, 200, 30);
        add(temail);

        Label lblAddress = new Label("Enter Address", Label.RIGHT);
        lblAddress.setBounds(0, 200, 200, 30);
        add(lblAddress);

        TextField tAddress = new TextField();
        tAddress.setBounds(210, 200, 250, 30);
        add(tAddress);

        Label lblgender = new Label("Enter Gender", Label.RIGHT);
        lblgender.setBounds(0, 320, 200, 30);
        add(lblgender);

        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox Male = new Checkbox("Male", cbg, true);
        Checkbox Female = new Checkbox("Female", cbg, false);
        Male.setBounds(210, 320, 100, 30);
        Female.setBounds(310, 320, 100, 30);

        add(Male);
        add(Female);

        Label lblhobbies = new Label("Select Hobbies", Label.RIGHT);
        lblhobbies.setBounds(0, 400, 200, 30);
        add(lblhobbies);

        Checkbox Reading = new Checkbox("Reading", cbg, true);
        Checkbox Writing = new Checkbox("Writing", cbg, false);
        Checkbox Dancing = new Checkbox("Dancing", cbg, false);
        Checkbox Singing = new Checkbox("Singing", cbg, false);

        Reading.setBounds(310, 400, 100, 30);
        Writing.setBounds(310, 430, 100, 30);
        Dancing.setBounds(310, 460, 100, 30);
        Singing.setBounds(310, 490, 100, 30);

        add(Reading);
        add(Writing);
        add(Dancing);
        add(Singing);

        Button btnsave = new Button("Save");
        btnsave.setBounds(310, 530, 100, 30);
        add(btnsave);

        Button btnclear = new Button("Clear");
        btnclear.setBounds(420, 530, 100, 30);
        add(btnclear);
        System.out.println("Biodata.Biodata");

    }

    public static void main(String[] args) {

        new Biodata();
    }

}