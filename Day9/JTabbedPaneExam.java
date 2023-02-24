import javax.swing.*;
public class JTabbedPaneExam {
    JFrame jf;
    JTabbedPaneExam(){
        jf = new JFrame("JTabbed Pane Example");
        jf.setSize(400,400);
        jf.setVisible(true);

        JPanel jp = new JPanel();
        jf.add(jp);

        JTabbedPane jtp = new JTabbedPane();
        jtp.addTab("TAB FILE",jp);
        jp.add(jtp);
       
        JPanel jp1 = new JPanel();
        jf.add(jp1);
        JTabbedPane jtp1 = new JTabbedPane();
        jtp1.addTab("Name",jp1);
        jp1.add(jtp1);
    }
    public static void main(String arg[])
    {
        JTabbedPaneExam obj = new JTabbedPaneExam();
    }
}
