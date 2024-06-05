package Basics;

import java.util.Scanner;

// Write a function which takes in 2 numbers and returns the greater of those two.

public class three {

    public static void great(int a, int b) {
        if(a > b){
            System.out.println("The greater between "+a+" and "+b+" is "+a);
        }else{
            System.out.println("The greater between "+a+" and "+b+" is "+b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        great(a, b);
        sc.close();
    }
    
}
