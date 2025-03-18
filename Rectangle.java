package CSCI1933P1;

import java.awt.Color;

public class Rectangle {

    double xPosition;
    double yPosition;
    double width; 
    double height; 
    Color color; 

    public Rectangle(double x, double y, double w, double h){

        this.xPosition = x; 
        this.yPosition = y;
        this.width = w; 
        this.height = h; 
    }
    

    public double calculatePerimeter(){

        return 2 * (height + width); 

    }

    public double getArea(){

        return height * width; 

    }

    public void setColor(Color c){

        this.color = c; 

    }

    public void setPos(double x, double y){

        this.xPosition = x; 
        this.yPosition = y; 

    }

    public void setHeight(double h){

        this.height = h; 

    }

    public void setWidth(double w){
        
        this.width = w;

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

    public double getHeight(){

        return height; 

    }

    public double getwidth(){

        return width; 

    }


}
