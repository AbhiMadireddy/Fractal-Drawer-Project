package CSCI1933P1;
// FractalDrawer class draws a fractal of a shape indicated by user input
import java.awt.Color;

public class FractalDrawer {
    private double totalArea = 0;  // member variale for tracking the total area

    public FractalDrawer() {}  // contructor


    //TODO:
    // drawFractal creates a new Canvas object
    // and determines which shapes to draw a fractal by calling appropriate helper function
    // drawFractal returns the area of the fractal
    public double drawFractal(String type) {
        
        Canvas can = new Canvas(800,800); 
        can.setVisible(true); 
        

        switch (type) {
            case "triangle" -> drawTriangleFractal(400, 400, 0, 0, Color.BLACK, can, 5);
            case "circle" -> drawCircleFractal(400, 0, 0, Color.BLACK, can, 5);
            case "rectangle" -> drawRectangleFractal(400, 400, 0, 0, Color.BLACK, can, 5);
            default -> {
            }
        }

        
        return totalArea;


    }


    //TODO:
    // drawTriangleFractal draws a triangle fractal using recursive techniques
    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level){

        if(level == 0){
            Triangle t = new Triangle(x, y, width, height); 
            t.setColor(c);
            can.drawShape(t);
            totalArea += t.calculateArea(); 
        }else{
            drawTriangleFractal(width/2, height/2, x, y, c, can, level - 1); 
            drawTriangleFractal(width/2, height/2, x + width/2, y, c, can, level - 1); 
            drawTriangleFractal(width/2, height/2, x + width/4, y + height/2, c, can, level - 1);
        }

    }


    // TODO:
    // drawCircleFractal draws a circle fractal using recursive techniques
    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {

        if(level == 0){
            Circle cir = new Circle(x, y, radius); 
            cir.setColor(c);
            can.drawShape(cir);
            totalArea += cir.calculateArea();
        }else{
            drawCircleFractal(radius/2, x, y, c, can, level - 1); 
            drawCircleFractal(radius/2, x + radius, y, c, can, level - 1); 
            drawCircleFractal(radius/2, x + radius/2, y + radius, c, can, level - 1);
        }
    }


    //TODO:
    // drawRectangleFractal draws a rectangle fractal using recursive techniques
    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
        if(level == 0){
            Rectangle r = new Rectangle(x, y, width, height); 
            r.setColor(c);
            can.drawShape(r);
            totalArea += r.getArea();
        }else{
            drawRectangleFractal(width/2, height/2, x, y, c, can, level - 1); 
            drawRectangleFractal(width/2, height/2, x + width/2, y, c, can, level - 1); 
            drawRectangleFractal(width/2, height/2, x, y + height/2, c, can, level - 1); 
            drawRectangleFractal(width/2, height/2, x + width/2, y + height/2, c, can, level - 1);
        }
    }

}
