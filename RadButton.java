import java.awt.*;

public class RadButton extends Frame {
    RadButton(){
        setVisible(true);
        setSize(900,500);
        setLayout(null);

        Label lblheader=new Label("Which Language You Wanna Prefer:",Label.LEFT);
        lblheader.setBounds(170,60,900,40);
        add(lblheader);

        CheckboxGroup cbg=new CheckboxGroup();
        Checkbox Marathi=new Checkbox("Marathi",cbg,true);
        Checkbox Hindi=new Checkbox("Hindi",cbg,false);
        Checkbox English=new Checkbox("English",cbg,false);
        Checkbox Sanskrit=new Checkbox("Sanskrit",cbg,false);

        Marathi.setBounds(180,90,900,40);
        Hindi.setBounds(180,120,900,40);
        English.setBounds(180,150,900,40);
        Sanskrit.setBounds(180,180,900,40);

        add(Marathi);
        add(Sanskrit);
        add(Hindi);
        add(English);
    }
    public static void main(String[] args){
        RadButton obj=new RadButton();
    }
}
