import java.awt.Color;
import java.lang.Math;
public class Triangle {
    private double xCoor; // instance variables
    private double yCoor;
    private double width;
    private double height;
    private Color color;
    public Triangle(double x, double y, double w, double h) {
        this.xCoor = x;
        this.yCoor = y;
        this.width = w;
        this.height = h;
    }
    public double calculatePerimeter() {
        double side = Math.sqrt(((this.width/2) * (this.width/2)) + this.height*this.height);
        return side*2 + this.width;
    }
    public double calculateArea() {
        return (this.width * this.height)/2;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public void setPos(double x, double y) {
        this.xCoor = x;
        this.yCoor = y;
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
        return this.xCoor;
    }
    public double getYPos() {
        return this.yCoor;
    }
    public double getHeight() {
        return this.height;
    }
    public double getWidth() {
        return this.width;
    }
}

// Written by Tenzin Chonyi chony003@umn.edu