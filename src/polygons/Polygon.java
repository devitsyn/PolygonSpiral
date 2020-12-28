package polygons;

import java.awt.geom.Point2D;

public class Polygon {

    private int[] x;
    private int[] y;
    private Point2D.Double center;
    private int n;
    private int r;
    private double side;
    private int rotation;

    public Polygon(int r, int n, Point2D.Double center, int rotation) {
        this.n = n;
        this.center = center;
        this.r = r;
        this.side = 2 * r * Math.sin(Math.PI/ n);
        x = new int[n];
        y = new int[n];
        this.rotation = rotation;

        initPoints();
    }

    private void initPoints() {
        double angle = 360f / n;
        Turtle turtle = new Turtle(center.getX(), center.getY());
        turtle.left((180 - angle) / 2 - rotation);
        turtle.forward(r);
        turtle.setRotation(-rotation);


        for (int i = 0; i < n; i++) {
            turtle.right(angle);
            turtle.forward(side);
            x[i] = (int) Math.round(turtle.getX());
            y[i] = (int) Math.round(turtle.getY());
        }
    }

    public int[] getX() {
        return x;
    }

    public int[] getY() {
        return y;
    }

    public double getSide() {
        return side;
    }
}
