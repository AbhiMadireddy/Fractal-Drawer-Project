package CSCI1933P1;

import java.util.Scanner; 

public class FractalProgram {
    //TODO:
    // Main should ask user for shape input, and then draw the corresponding fractal.
    // This method should print area of fractal, after the fractal is done drawing.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the shape you would like to draw a fractal of: ");
        String shape = sc.nextLine(); 

        FractalDrawer fd = new FractalDrawer(); 

        double area = fd.drawFractal(shape); 

        System.out.println("The area of the fractal is: " + area);

        


    }
}


