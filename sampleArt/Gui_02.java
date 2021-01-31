import javax.swing.*;
import java.awt.*;

class myPanel_02 extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.drawArc(100,180,150,150,0,360);
        g.fillArc(360,160,150,150,0,270);
        g.setColor(Color.black);
        g.drawRect(20,40,100,100);
        g.setColor(Color.green);
        g.fillRect(400,40,100,100);

    }
}
public class Gui_02 extends JFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Gui_02");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600,500);
        Container contentPane = f.getContentPane();
        myPanel_02 p = new myPanel_02();
        contentPane.add(p);

        f.setVisible(true);
    }
}
