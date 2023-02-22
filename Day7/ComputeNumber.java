import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
public class ComputeNumber implements ActionListener{

    ComputeNumber(){
        
    }
    public void actionPerformed(ActionEvent ob){
        if(ob.getSource()==b1){
            Scanner sc =new Scanner(System.in);
        }
    }
    public static void main(String arg[])
    {
        ComputeNumber ob = new ComputeNumber();
        Frame ob = new Frame("Application");
        ob.setSize(400,400);
        ob.setVisible(true);
        ob.setLayout(new FlowLayout());

        Panel p = new Panel();
        ob.add(p);
        p.setLayout(new GridLayout(6,2));

        Label l1  = new Label("Enter First Number : ");
        p.add(l1);
        TextField txtf1 = new TextField();
        p.add(txtf1);
        
        Label l2  = new Label("Enter Second Number : ");
        p.add(l2);
        TextField txtf2 = new TextField();
        p.add(txtf2);

        Label l3  = new Label("Enter Third Number : ");
        p.add(l3);
        TextField txtf3 = new TextField();
        p.add(txtf3);

        Label l4  = new Label("##### Average ######");
        p.add(l4);

        Label l5  = new Label("Display the Result  ");
        p.add(l5);

        Button b1 = new Button("COMPUTE");
        p.add(b1);

        Button b2 = new Button("REFRESH");
        p.add(b2);

        Button b3 = new Button("EXIT");
        p.add(b3);

        
    }
}
