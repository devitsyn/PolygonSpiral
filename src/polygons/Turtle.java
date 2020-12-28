package polygons;

public class Turtle {
    double x;
    double y;
    double rotation;

    public Turtle() {
        x = 0;
        y = 0;
        rotation = 0;
    }

    public Turtle(double x, double y) {
        this.x = x;
        this.y = y;
        rotation = 0;
    }

    public void left(double angle) {
        rotation += angle;
    }

    public void right(double angle) {
        rotation -= angle;
    }

    public void forward(double distance) {
        x += Math.cos(Math.toRadians(rotation)) * distance;
        y += Math.sin(Math.toRadians(rotation)) * distance;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRotation() {
        return rotation;
    }

    public void setRotation(double rotation) {
        this.rotation = rotation;
    }
}
