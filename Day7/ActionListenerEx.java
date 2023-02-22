import java.awt.*;
import java.awt.event.*;
public class ActionListenerEx implements KeyListener {    
    Frame fr;
    Label l;
    TextArea ta;
    ActionListenerEx(){
        fr=new Frame();
        fr.setSize(600,600);
        fr.setVisible(true);

        l=new Label();
        fr.add(l);

        ta =new TextArea();
        fr.add(ta);
        ta.addKeyListener(this);
    }
    public void keyPressed(KeyEvent ob){
        ta.setText("Key Pressed");
    }
    public void keyTyped(KeyEvent ob){
        ta.setText("Key Typed");
    }
    public void keyReleased(KeyEvent ob){
        ta.setText("Key Released");
    }
    public static void main(String arg[])
    {
        ActionListenerEx ob = new ActionListenerEx();
    }
    
}
