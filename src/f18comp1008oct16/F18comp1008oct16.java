/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f18comp1008oct16;

import java.util.ArrayList;

/**
 *
 * @author Ravneet Bhullar
 */
public class F18comp1008oct16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(15);
        
        System.out.println(circle1);
        System.out.printf("The area is %.2f%n", circle1.getArea());
        
        System.out.printf("Circle2 -> %s has an area of %.2f%n", circle2,
                                                       circle2.getArea());
        
        
        Rectangle rec1 = new Rectangle(10,20);
        Rectangle rec2 = new Rectangle(20,30);
        
        System.out.printf("rec1: %s has area of %.1f%n", rec1, rec1.getArea());
        System.out.printf("rec2: %s has area of %.1f%n", rec2, rec2.getArea());
        
        ArrayList<TwoDimensionalShape> shapes = new ArrayList<>();
        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(rec1);
        shapes.add(rec2);
        
        for (TwoDimensionalShape shape: shapes)
        {
            System.out.println(shape + " area: " + shape.getArea());
        }
    }
    
}
