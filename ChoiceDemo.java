import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceDemo extends Frame
{
    ChoiceDemo(){
        Frame frame=new Frame("ChoiceDemo");
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        frame.setSize(500,500);
        frame.setBackground(Color.DARK_GRAY);

        Label label=new Label("Select The Anime You Adore:",Label.RIGHT);
        Font font=new Font("Arial",Font.BOLD,20);
        label.setForeground(Color.CYAN);
        label.setFont(font);
        frame.add(label);


        Choice choice=new Choice();
        choice.add("Demon Slayer");   //You Can Add Whatever You Want
        choice.add("Attack On Titans");
        choice.add("Gintama");
        choice.add("Naruto");
        choice.add("Death Note");
        choice.setForeground(Color.red);

        choice.setFont(font);
        frame.add(choice);


        Label label1=new Label("Result will be display here:");
        label1.setFont(font);
        label1.setForeground(Color.CYAN);
        frame.add(label1);
        choice.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label1.setText("You have selected  "+choice.getSelectedItem());
            }
        });
    }
    public static void main(String[] args){
        ChoiceDemo obj=new ChoiceDemo();
    }
}
