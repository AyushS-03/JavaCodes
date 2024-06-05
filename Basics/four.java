package Basics;

import java.util.Scanner;

// Write a function that takes in the radius as input and returns the circumference of a circle.

public class four {
    public static void circumference(double r) {
        double Circumference = 2 * 3.14 * r;
        System.out.println("The Circumference of Circle is : "+Circumference);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        circumference(r);
        sc.close();
    }

}
