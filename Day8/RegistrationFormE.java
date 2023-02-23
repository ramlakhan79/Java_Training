import java.awt.*;
import java.awt.event.*;
public class RegistrationFormE implements ActionListener {
     Frame ob;
     Panel p;
     Button b1;
     TextField txtf1,txtf2,txtf3,txtf4;
     TextArea ta;

    RegistrationFormE (){    
        ob= new Frame("Registration");
        ob.setSize(300,300);
        ob.setVisible(true);
        ob.setLayout(new FlowLayout());
        ob.setBackground(Color.yellow);

        p = new Panel();
        ob.add(p);
        p.setLayout(new GridLayout(6,2,12,20));

        Label l1  = new Label("Enrollment");
        p.add(l1);
        txtf1 = new TextField();
        p.add(txtf1);
        
        Label l2  = new Label("Name");
        p.add(l2);
        txtf2 = new TextField();
        p.add(txtf2);

        Label l3  = new Label("Branch");
        p.add(l3);
        txtf3 = new TextField();
        p.add(txtf3);

        Label l4  = new Label("Semester");
        p.add(l4);
        txtf4 = new TextField();
        p.add(txtf4);

        Label l5  = new Label("Information");
        p.add(l5);
        ta = new TextArea(2,20);
        p.add(ta);

        Button b1 = new Button("Submit");
        p.add(b1);
        
        // txtf1.addActionListener(this);
        // txtf2.addActionListener(this);
        // txtf3.addActionListener(this);
        // txtf4.addActionListener(this);
        b1.addActionListener(this);
        
    }

    public void actionPerformed(ActionEvent ob){
        String s1 = txtf1.getText();
        String s2 = txtf2.getText();
        String s3 = txtf3.getText();
        String s4 = txtf4.getText();
        
        if(ob.getSource()==b1){
            ta.setText(s1+"\n"+s2+"\n"+s3+"\n"+s4);
        }
    }
    public static void main(String arg[])
    {
        RegistrationFormE obj = new RegistrationFormE();       
    }
}
