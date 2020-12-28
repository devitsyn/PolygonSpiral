package polygons;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;
import java.util.ArrayList;

import static java.lang.Math.*;

public class DrawPanel extends JPanel {
    
    private ArrayList<Polygon> polygons;
    private int n;
    private int j;

    private int rotation;

    private final static int centerX = 160;
    private final static int centerY = 160;

    public DrawPanel(int n) {
        this.n = n;
        rotation = 0;
        polygons = new ArrayList<>();

        polygons.add(new Polygon(150, n, new Point2D.Double(centerX, centerY), rotation));

        initPolygons();
    }

    private void initPolygons() {
        int i = 1;
        while (true) {
            double a = polygons.get(i - 1).getSide();
            rotation += 45;
            int new_r = (int) round(a / (2 * tan(PI / n)));

            if (new_r <= 10) {
                break;
            }

            polygons.add(new Polygon(
                    new_r,
                    n,
                    new Point2D.Double(centerX, centerY),
                    rotation));
            i++;
        }
        j = polygons.size();
    }
    

    @Override
    public void paint(Graphics g) {

        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.BLACK);

        if (j >= 0) {
            for (int i = 0; i < polygons.size() - j - 1; i++) {
                Polygon polygon = polygons.get(i);
                g2d.drawPolygon(polygon.getX(), polygon.getY(), n);
            }
        }
    }

    public boolean next() {
        j--;
        if (j < 0) {
            return true;
        }
        repaint();
        return false;
    }
}
