import java.awt.*;

public class AwtButtonEx {
    public static void main(String arg[])
    {
        Frame fr = new Frame("Awt Button Ex");
        fr.setSize(400,400);
        fr.setVisible(true);
        Button b1 = new Button("TOP");
        Button b2 = new Button("BOTTOM");
        Button b3 = new Button("LEFT");
        Button b4 = new Button("RIGHT");
        Button b5 = new Button("CENTER");

        fr.setLayout(new BorderLayout(70,70));
        
        fr.add(b1,BorderLayout.NORTH);
        fr.add(b2,BorderLayout.SOUTH);
        fr.add(b3,BorderLayout.WEST);
        fr.add(b4,BorderLayout.EAST);
        fr.add(b5,BorderLayout.CENTER);      
    }
}
