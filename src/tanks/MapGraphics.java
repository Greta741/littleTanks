package tanks;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class MapGraphics extends JPanel {

    public MapGraphics() {}
    
    public void paint(Graphics g) {
        // background
        g.setColor(Color.black);
        g.fillRect(1, 1, 692, 592);
        
        // borders
        g.setColor(Color.yellow);
        g.fillRect(0, 0, 3, 592);
        g.fillRect(0, 0, 692, 3);
        g.fillRect(691, 0, 3, 592);
    
        g.dispose();
    }
}
