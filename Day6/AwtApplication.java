import java.awt.*;
public class AwtApplication {
    public static void main(String arg[])
    {
        Frame ob = new Frame("Application");
        ob.setSize(400,400);
        ob.setVisible(true);
        Panel p = new Panel();
        ob.add(p);
        Label l1  = new Label("Enter First Name : ");
        p.add(l1);
        TextField txtf1 = new TextField();
        p.add(txtf1);
        Label l2  = new Label("Enter Second Name : ");
        p.add(l2);
        TextField txtf2 = new TextField();
        p.add(txtf2);
        Label l3  = new Label("Enter Third Name : ");
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
        p.setLayout(new FlowLayout());
    }
}
