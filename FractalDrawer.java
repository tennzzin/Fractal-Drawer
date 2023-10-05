// FractalDrawer class draws a fractal of a shape indicated by user input
import java.awt.Color;
import java.util.Scanner;

public class FractalDrawer {
    private double totalArea=0;  // member variable for tracking the total area

    public FractalDrawer() {}  // contructor


    //TODO:
    // drawFractal creates a new Canvas object
    // and determines which shapes to draw a fractal by calling appropriate helper function
    // drawFractal returns the area of the fractal
    public double drawFractal(String type) { // Draws fractal based on user input
        Canvas can = new Canvas();
        if (type.equals("triangle")) {
            drawTriangleFractal(200, 100, 400, 400, Color.BLUE, can, 0);
        } else if (type.equals("circle")) {
            drawCircleFractal(200, 400, 400, Color.BLUE, can, 0);
        } else if (type.equals("rectangle")) {
            drawRectangleFractal(200, 100, 400, 400, Color.BLUE, can, 0);
        } else {
            System.out.println("Invalid input. Please enter: 'triangle', 'circle', or 'rectangle'.");
        }
        return totalArea; // Returns the total area of the given fractal
    }

    //TODO:
    // drawTriangleFractal draws a triangle fractal using recursive techniques
    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level){
        Triangle tri = new Triangle(x, y, width, height); // Create new Triangle object
        tri.setColor(c);
        if (level < 8) { // Set the conditional to create the triangle fractal 7 times
            can.drawShape(tri);
            Color nextColor = c;
            if (c == Color.RED) { // Change the next color of fractal based off the previous
                nextColor = Color.BLUE;

            } else if (c == Color.BLUE) {
                nextColor = Color.GREEN;

            } else if (c == Color.GREEN) {
                nextColor = Color.RED;
            }
            totalArea += tri.calculateArea(); // Use method from Triangle class to return totalArea

            drawTriangleFractal(width/2,height/2,x+width,y, nextColor, can, level + 1); // Right side of triangle
            drawTriangleFractal(width/2,height/2,x-(width/2),y, nextColor, can, level + 1); // Left side of triangle
            drawTriangleFractal(width/2,height/2,x+(width/4),y-height, nextColor, can, level + 1); // Top triangle
        }
    }

    // TODO:
    // drawCircleFractal draws a circle fractal using recursive techniques
    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
        Circle circle = new Circle(x, y, radius); // Create new Circle object
        circle.setColor(c);
        if (level < 8) { // Set the conditional to create the circle fractal 7 times
            can.drawShape(circle);
            Color nextColor = c;
            if (c == Color.RED) { // Change the next color of fractal based off the previous
                nextColor = Color.BLUE;

            } else if (c == Color.BLUE) {
                nextColor = Color.GREEN;

            } else if (c == Color.GREEN) {
                nextColor = Color.RED;
            }
            totalArea += circle.calculateArea(); // Use method from Circle class to return totalArea

            drawCircleFractal(radius/2, x-radius, y, nextColor, can, level + 1); // Left circle
            drawCircleFractal(radius/2, x+radius, y, nextColor, can, level + 1); // Right circle
            drawCircleFractal(radius/2, x, y-radius, nextColor, can, level + 1); // Top circle
            drawCircleFractal(radius/2, x, y+radius, nextColor, can, level + 1); // Bottom circle
        }
    }

    //TODO:
    // drawRectangleFractal draws a rectangle fractal using recursive techniques
    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
        Rectangle rect = new Rectangle(x, y, width, height); // Create new Rectangle object
        rect.setColor(c);
        if (level < 8) { // Set the conditional to create the circle fractal 7 times
            can.drawShape(rect);
            Color nextColor = c;
            if (c == Color.RED) { // Change the next color of fractal based off the previous
                nextColor = Color.BLUE;

            } else if (c == Color.BLUE) {
                nextColor = Color.GREEN;

            } else if (c == Color.GREEN) {
                nextColor = Color.RED;
            }
            totalArea += rect.calculateArea(); // Use method from Rectangle class to return totalArea

            drawRectangleFractal(width/2, height/2, x + width, y, nextColor, can, level+1); // Right rectangle
            drawRectangleFractal(width/2, height/2, x - width, y, nextColor, can, level+1); // Left rectangle
            drawRectangleFractal(width/2, height/2, x, y + height, nextColor, can, level+1); // Bottom rectangle
            drawRectangleFractal(width/2, height/2, x, y - height, nextColor, can, level+1); // Top rectangle
        }
    }

    //TODO:
    // main should ask user for shape input, and then draw the corresponding fractal.
    // should print area of fractal


    public static void main(String[] args){
        FractalDrawer myDrawer = new FractalDrawer(); // Create new FractalDrawer object
        Scanner myScanner = new Scanner(System.in); // Create Scanner

        System.out.println("Enter the fractal type: 'triangle', 'circle', or 'rectangle'.: ");
        String type = myScanner.next(); // Take in user input
        double area = myDrawer.drawFractal(type); // Calculate area based off input
        System.out.println("Total area of the fractal: " + area);

        myScanner.close();
    }
}

// Written by Tenzin Chonyi chony003@umn.edu