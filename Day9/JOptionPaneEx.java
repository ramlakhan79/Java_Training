import javax.swing.*;
public class JOptionPaneEx {
    JFrame jf;  
    JOptionPaneEx(){
        jf = new JFrame();
        jf.setSize(400,400);
        jf.setVisible(true);
        String name = JOptionPane.showInputDialog(jf, "Enter Your Name");
        JOptionPane.showMessageDialog(jf, "Your Name is "+name);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String arg[])
    {
        JOptionPaneEx obj = new JOptionPaneEx() ;
    }
}
