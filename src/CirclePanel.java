import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

class CirclePanel extends JPanel {
    
    private List<Circle> circles = new LinkedList<Circle>();
    private BufferedImage image;
    public int width;
    public int height;
    public static int xCoord;
    public static int yCoord;
    {
        try {
            image = ImageIO.read(new File("C:\\Users\\Home\\Downloads\\Data_US\\all\\images\\Norma\\normQL_01\\1.bmp"));
            width = image.getWidth();
            height = image.getHeight();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void addCircle(Circle circle)
    {
        circles.add(circle);
        this.repaint();
    }
    
    @Override
    public  void paint(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null);
        ((Graphics2D)g).drawString("Coordinates x:" + xCoord + " y:" + yCoord, 100, 20);
        for (Circle c: circles) {
            c.draw(g);
        }
    }
    
}