import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ExerciseTabbed implements ActionListener{
    JFrame jf;
    JPanel jp1,jp2,jp3,jp4;
    JLabel jl1,jl2,jl3,jl4;
    JTabbedPane jtp;
    JTextField tf1,tf2,tf3;
    TextArea ta;
    JButton b1,b2;
    
    ExerciseTabbed(){
        jf =new JFrame("Exercise Tabbed");
        jf.setSize(400,400);
        jf.setVisible(true);

        jtp = new JTabbedPane();
        ta =new TextArea();             

        jp1 =new JPanel();
        jl1 = new JLabel();        
        tf1 = new JTextField();
        jtp.addTab("Name",jp1);        
        jl1.add(jtp);        
        jf.add(jtp);
        jp1.add(jl1);
        jp1.add(tf1);
        // jp1.addactionListener(this);

        jp2 =new JPanel();
        jl2 = new JLabel();        
        tf2 = new JTextField();
        jtp.addTab("Branch",jp2);        
        jl2.add(jtp);        
        jf.add(jtp);
        jp2.add(jl2);
        jp2.add(tf2);

        jp3 =new JPanel();
        jl3 = new JLabel();        
        tf3 = new JTextField();
        jtp.addTab("Semester",jp3);        
        jl3.add(jtp);        
        jf.add(jtp);
        jp3.add(jl3);
        jp3.add(tf3);

        jp4 =new JPanel();
        jl4 = new JLabel();        
        jtp.addTab("Result",jp4);        
        jl4.add(jtp);        
        jf.add(jtp);
        jp4.add(jl4);

        b1= new JButton(" Show ");
    }

    public void actionPerformed(ActionEvent ac){
        if(ac.getSource()==jp1){
            String name = JOptionPane.showInputDialog(jf, "Enter Your Name");
            JOptionPane.showMessageDialog(jf, "Your Name is "+name);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
    public static void main(String arg[])
    {
        ExerciseTabbed obj =new ExerciseTabbed();
    }
}
