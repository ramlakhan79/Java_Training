import java.awt.*;
import java.awt.event.*;

//import java.awt.swing.*;
public class AwtComponent implements ActionListener , ItemListener{
    Frame fr;
    Panel p1,p2,p3,p4;
    Button b1;
    Checkbox cb1,cb2;
    Choice c1;
    List lst1;
    AwtComponent(){
        fr = new Frame("Awt Component");
        fr.setSize(300,300);
        fr.setVisible(true);

        fr.setLayout(new FlowLayout());
        fr.setLayout(new GridLayout(4,1));


        p1 = new Panel();
        fr.add(p1);
        p1.setBackground(Color.blue);

        Label l1 = new Label();
        p1.add(l1);
        cb1 =new Checkbox("Male");
        p1.add(cb1);
        cb2 = new Checkbox("Female");
        p1.add(cb2);


        p2= new Panel();
        fr.add(p2);
        p2.setBackground(Color.yellow);
        c1 = new Choice();
        c1.add("Choice 1");
        p2.add(c1);
        c1.add("Choice 2");
        p2.add(c1);
        c1.add("Choice 3");
        p2.add(c1);



        p3 = new Panel();
        fr.add(p3);
        p3.setBackground(Color.orange);
       
        lst1 = new List();
        lst1.add("List 1");
        p3.add(lst1);
        lst1.add("List 1");
        p3.add(lst1);
        lst1.add("List 1");
        p3.add(lst1);
        lst1.add("List 1");
        p3.add(lst1);


        p4 = new Panel();
        fr.add(p4);
        p4.setBackground(Color.gray);

        b1 = new Button("Exit");
        p4.add(b1);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            System.exit(0);
        }
    }

    public void itemStateChanged(ItemEvent it){
        if(it.getSource()==cb1){

        }
    }
    public static void main(String arg[])
    {
        AwtComponent obj = new AwtComponent();
    }
}
