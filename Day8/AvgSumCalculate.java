import java.awt.*;
import java.awt.event.*;
public class AvgSumCalculate implements ActionListener {
    Frame ob;  
    Panel p;
    Button b1,b2;
    TextField txtf1,txtf2,txtf3,txtf4,txtf5;
    Checkbox ch;

    AvgSumCalculate(){
        ob = new Frame("Application");
        ob.setSize(400,400);
        ob.setVisible(true);
        ob.setLayout(new FlowLayout());

        p = new Panel();
        ob.add(p);
        p.setLayout(new GridLayout(7,2));

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

        Label l4  = new Label("Sum Of Three Number ");
        p.add(l4);
        txtf4  = new TextField("");
        p.add(txtf4);  

        Label l5  = new Label("Average Of Three Number ");
        p.add(l5);
        txtf5  = new TextField("");
        p.add(txtf5);     
       
        
        b1 = new Button("EXIT");
        p.add(b1);
        b1.addActionListener(this);


        ch=new Checkbox("Click To Enavle Result Button");
        p.add(ch);

        b2 = new Button("Show Reslut");
        p.add(b2);
        b2.addActionListener(this);  

        
    }
    public void actionPerformed(ActionEvent ob){
        if(ob.getSource()==b2){
            if( ch.getState()==true){
            b2.setBackground(Color.green);
            Integer i1 = Integer.parseInt(txtf1.getText());
            Integer i2 = Integer.parseInt(txtf2.getText());
            Integer i3 = Integer.parseInt(txtf3.getText());
           
            int sum = i1+i2+i3;
            txtf4.setText(String.valueOf(sum));

            float avg = (i1+i2+i3)/3;

            txtf5.setText(String.valueOf(avg));
            }
            else if(ch.getState()==false){
                txtf4.setText(null);
                txtf5.setText(null);
                b2.setBackground(null);
    
            }

        }            
        else if(ob.getSource()==b1){
            System.exit(0);
        }
    }    
    public static void main(String arg[])
    {
        AvgSumCalculate obj = new AvgSumCalculate();       
    }
}
