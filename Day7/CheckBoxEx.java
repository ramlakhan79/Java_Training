import java.awt.*;
import javax.swing.*;
public class CheckBoxEx {
    public static void main(String arg[])
    {
        Frame fr = new Frame("Login Form");
        fr.setSize(200,200);
        fr.setVisible(true);
        fr.setLayout(new FlowLayout());
        
        Panel p = new Panel();
        fr.add(p);
        p.setLayout(new GridLayout(3,2));
        
        Checkbox cb1 = new Checkbox("Check Box 1");
        p.add(cb1);
        Checkbox cb2 = new Checkbox("Check Box 2");
        p.add(cb2);

        JRadioButton rb1 = new JRadioButton("Radio Button 1");
        p.add(rb1);
        JRadioButton rb2 = new JRadioButton("Radio Button 2");
        p.add(rb2);

    }
}
