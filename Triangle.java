package CSCI1933P1;


import java.awt.Color;


public class Triangle{

    double xPosition; 
    double yPosition; 
    double height; 
    double width; 
    Color color; 

    public Triangle(double x, double y, double h, double w){

        this.xPosition = x; 
        this.yPosition = y; 
        this.width = w;
        this.height = h;

    }

    public double calculatePerimeter(){

        double sideA = Math.sqrt(((width/2) * (width/2)) + (height * height));

        return width + sideA + sideA; 

    }

    public double calculateArea(){

        return 0.5 * width * height; 

    }

    public void setPos(double x, double y){

        this.xPosition = x; 
        this.yPosition = y; 

    }

    public void setColor(Color c){

        this.color = c; 
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

    public double getWidth(){

        return width;

    }



}
    

