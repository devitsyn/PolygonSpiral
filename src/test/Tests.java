package test;

import org.junit.Assert;
import org.junit.Test;
import polygons.Polygon;
import polygons.Turtle;

import java.awt.geom.Point2D;

public class Tests {

    @Test
    public void turtleMoveTest() {
        Turtle turtle = new Turtle(0, 0);
        turtle.forward(10);
        Assert.assertEquals(10, (int) turtle.getX());
    }

    @Test
    public void turtleRotationTest() {
        Turtle turtle = new Turtle(0, 0);
        turtle.left(45);
        Assert.assertEquals(45, (int) turtle.getRotation());
    } 

    @Test
    public void polygonSideTest() {
        Polygon polygon = new Polygon(24, 4, new Point2D.Double(0, 0), 0);
        Assert.assertEquals(33, (int) polygon.getSide());
    }

    @Test
    public void test() {
        Assert.assertEquals(1, 1);
    }
}
