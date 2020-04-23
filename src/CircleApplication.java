import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CircleApplication {
   
    public static void main(String[] arguments) {
        JFrame window = new JFrame("dynamicEcho");
        CirclePanel panel = new CirclePanel();
        window.setContentPane(panel);
        window.setSize(panel.width,panel.height);
        panel.addMouseListener(new CircleClickListener(panel));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

    }
}
