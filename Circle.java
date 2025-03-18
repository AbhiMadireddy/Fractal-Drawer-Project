package CSCI1933P1;
import java.awt.Color;

public class Circle{

    double xPosition; 
    double yPosition; 
    double radius; 
    Color color; 

    public Circle(double xPos, double yPos, double r){

        this.xPosition = xPos; 
        this.yPosition = yPos;
        this.radius = r; 
    }

    public double calculatePerimeter(){

        return Math.PI * 2 * radius; 

    }

    public double calculateArea(){

        return Math.PI * radius * radius; 

    }

    public void setColor(Color c){

        this.color = c; 

    }
    
    public void setColor(double x, double y){

        this.xPosition = x; 
        this.yPosition = y; 

    }

    public void setRadius(double r){

        this.radius = r; 

    }

    public Color getColor(){

        return color; 

    }

    public double getXPos(){

        return xPosition; 
    }

    public double getYPos(){

        return yPosition; 

    }

    public double getRadius(){

        return radius; 

    }

}
