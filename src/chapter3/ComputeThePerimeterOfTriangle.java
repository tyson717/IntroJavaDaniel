package chapter3;

import java.util.Scanner;

public class ComputeThePerimeterOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three edges of triagle: ");
        System.out.println(" x : ");
        double x = input.nextDouble();
        System.out.println("y: ");
        double y = input.nextDouble();
        System.out.println("z : ");
        double z = input.nextDouble();
        boolean isValid = x + y > z & x + z > y & y + z > x ;
        double perimeter = 0;
        if (isValid){
         perimeter = x + y + z ;
        }
        System.out.println("Perimeter of triangle = " + perimeter);
    }
}
/*3.19 (Compute the perimeter of a triangle)
 * Write a program that reads three edges for a triangle and computes the perimeter
 * if the input is valid. Otherwise, display that the input is invalid.
 * The input is valid if the sum of every pair of two edges is greater than
 * the remaining edge.*/