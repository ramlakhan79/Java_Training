import java.awt.*;
import javax.swing.*;

public class ImageIconExam {
  ImageIconExam() {
    JFrame fr = new JFrame("Iamge Icon ");
    fr.setSize(30, 30);
    fr.setVisible(true);
    JPanel jp = new JPanel();
    fr.add(jp);
    ImageIcon img = new ImageIcon("download.jpg");
    JButton jb = new JButton(img);
    jp.add(jb);
    JLabel jl = new JLabel(img);
    jp.add(jl);
  }

  public static void main(String arg[]) {
    ImageIconExam obj = new ImageIconExam();
  }
}
