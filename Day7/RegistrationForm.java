import java.awt.*;

public class RegistrationForm {
    public static void main(String arg[])
    {
        Frame ob = new Frame("Registration");
        ob.setSize(300,300);
        ob.setVisible(true);

        ob.setLayout(new FlowLayout());
        ob.setBackground(Color.yellow);

        Panel p = new Panel();
        ob.add(p);
        p.setLayout(new GridLayout(6,2,12,20));

        Label l1  = new Label("Enrollment");
        p.add(l1);
        TextField txtf1 = new TextField();
        p.add(txtf1);
        
        Label l2  = new Label("Name");
        p.add(l2);
        TextField txtf2 = new TextField();
        p.add(txtf2);

        Label l3  = new Label("Branch");
        p.add(l3);
        TextField txtf3 = new TextField();
        p.add(txtf3);

        Label l4  = new Label("Semester");
        p.add(l4);
        TextField txtf4 = new TextField();
        p.add(txtf4);

        Label l5  = new Label("Information");
        p.add(l5);
        TextArea ta = new TextArea(2,20);
        p.add(ta);

        Button b1 = new Button("Submit");
        p.add(b1);

        
    }
}
