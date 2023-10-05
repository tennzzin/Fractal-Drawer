import java.awt.Color;
public class Circle {
    private double xPos; //instance variables
    private double yPos;
    private double radius;
    private Color color;
    public Circle(double x, double y, double r) {
        this.xPos = x;
        this.yPos = y;
        this.radius = r;
    }
    public double calculatePerimeter() {
        return 2 * 3.14 * this.radius;
    }
    public double calculateArea() {
        return 3.14 * this.radius * this.radius;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public void setPos(double x, double y) {
        this.xPos = (x+y)/2;
        this.yPos = (y+x)/2;
    }
    public void setRadius(double r) {
        this.radius = r;
    }
    public Color getColor() {
        return this.color;
    }
    public double getXPos() {
        return this.xPos;
    }
    public double getYPos() {
        return this.yPos;
    }
    public double getRadius() {
        return this.radius;
    }
}

// Written by Tenzin Chonyi chony003@umn.edu