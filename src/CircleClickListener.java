import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CircleClickListener  extends MouseAdapter {
    
    private CirclePanel panel;
    
    public CircleClickListener(CirclePanel panel) {
        super();
        this.panel = panel;
    }
    
    @Override
    public void mouseMoved (MouseEvent e){
        super.mouseMoved(e);
        CirclePanel.xCoord = e.getX();
        CirclePanel.yCoord = e.getY();
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        panel.addCircle(new Circle(e.getX() - 3, e.getY() - 3, 6, Color.GREEN));
    }
}