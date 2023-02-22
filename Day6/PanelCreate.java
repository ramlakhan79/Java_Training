
import java.awt.*;


 public class PanelCreate extends Frame{
  
    PanelCreate(){        
        setTitle("Hello");
        setSize(300,300);
        setVisible(true); 

    }
    public static void main(String arg[])
    {
        PanelCreate obj =new PanelCreate();
       // Panel p = new Panel();
       // obj.add(p);
        Label l= new Label("Hello world");
        obj.add(l);
        // TextField txf = new TextField("TextField");
        // obj.add(txf);
        TextArea tx = new TextArea("TextField");
        obj.add(tx);
        
       
    }
}
 