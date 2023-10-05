import java.awt.Color;
public class Rectangle {
    private double xPos; // instance variables
    private double yPos;
    private double width;
    private double height;
    private Color color;
    public Rectangle(double x, double y, double w, double h) {
        this.xPos = x;
        this.yPos = y;
        this.width = w;
        this.height = h;
    }
    public double calculatePerimeter() {
        return 2*this.width + 2*this.height;
    }
    public double calculateArea() {
        return this.width * this.height;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public void setPos(double x, double y) {
        this.xPos = x;
        this.yPos = y;
    }
    public void setHeight(double h) {
        this.height = h;
    }
    public void setWidth(double w) {
        this.width = w;
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
    public double getWidth() {
        return this.width;
    }
    public double getHeight() {
        return this.height;
    }
}

// Written by Tenzin Chonyi chony003@umn.edu