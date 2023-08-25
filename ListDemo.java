import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ListDemo extends Frame {
    ListDemo(){
        Frame frame=new Frame("ListDemo");
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        frame.setSize(900,500);
        frame.setBackground(Color.GRAY);

        Label label=new Label("Select The Tehsil/Taluka You Live");
        Font font=new Font("Times New Roman",Font.BOLD,20);
        label.setFont(font);
        frame.add(label);

        List list=new List(5,false);
        list.add("Malvan");
        list.add("Kankavali");
        list.add("Dodamarg");
        list.add("Sawantwadi");
        list.add("Devgad");
        list.add("Vaibhavwadi");
        list.add("Kudal");
        list.add("Sindhudurgnagaris");

        frame.add(list);
        Label lbl1=new Label("");
        lbl1.setFont(font);
        frame.add(lbl1);

        list.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                lbl1.setText("You have selected: "+list.getSelectedItem());
            }
        });
    }
    public static void main(String[] args){
        ListDemo obj=new ListDemo();
    }
}
