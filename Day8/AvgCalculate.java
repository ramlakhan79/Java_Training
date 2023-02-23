import java.awt.*;
import java.awt.event.*;
public class AvgCalculate implements ActionListener {
    Frame ob;  
    Panel p;
    Button b1,b2,b3;
    TextField txtf1,txtf2,txtf3,txtf4;

    AvgCalculate(){
        ob = new Frame("Application");
        ob.setSize(400,400);
        ob.setVisible(true);
        ob.setLayout(new FlowLayout());

        p = new Panel();
        ob.add(p);
        p.setLayout(new GridLayout(6,2));

        Label l1  = new Label("Enter First Number : ");
        p.add(l1);
        txtf1 = new TextField();
        p.add(txtf1);
        
        Label l2  = new Label("Enter Second Number : ");
        p.add(l2);
        txtf2 = new TextField();
        p.add(txtf2);

        Label l3  = new Label("Enter Third Number : ");
        p.add(l3);
        txtf3 = new TextField();
        p.add(txtf3);

        Label l4  = new Label("##### Average ######");
        p.add(l4);
        txtf4  = new TextField("");
        p.add(txtf4);
     
        b1 = new Button("COMPUTE");
        p.add(b1);
        b1.addActionListener(this);

        b2 = new Button("REFRESH");
        p.add(b2);
        b2.addActionListener(this);

        b3 = new Button("EXIT");
        p.add(b3);
        b3.addActionListener(this);

        
    }
    public void actionPerformed(ActionEvent ob){
        if(ob.getSource()==b1){

            Integer i1 = Integer.parseInt(txtf1.getText());
            Integer i2 = Integer.parseInt(txtf2.getText());
            Integer i3 = Integer.parseInt(txtf3.getText());
           
            float avg = (i1+i2+i3)/3;
            txtf4.setText(String.valueOf(avg));

        }
        else if(ob.getSource()==b2){

           txtf1.setText("");
           txtf2.setText("");
           txtf3.setText("");
           txtf4.setText("");
        }
        else if(ob.getSource()==b3){
            System.exit(0);
        }
    }
    public static void main(String arg[])
    {
        AvgCalculate obj = new AvgCalculate();       
    }
}
