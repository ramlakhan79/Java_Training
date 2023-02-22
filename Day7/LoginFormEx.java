import java.awt.*;
public class LoginFormEx {
    public static void main(String arg[])
    {
        Frame fr = new Frame("Login Form");
        fr.setSize(200,200);
        fr.setVisible(true);
        fr.setLayout(new FlowLayout());

        Panel p = new Panel();
        fr.add(p);
        p.setLayout(new GridLayout(3,2));

        Label l1 = new Label("Username");
        p.add(l1);
        TextField txt1 = new TextField();
        p.add(txt1);
        
        Label l2 = new Label("Password");
        p.add(l2);
        TextField txt2 = new TextField();
        p.add(txt2);

        Button b = new Button("Submit");
        p.add(b);

    }
}
