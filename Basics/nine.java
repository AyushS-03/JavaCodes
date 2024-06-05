package Basics;

import java.util.Scanner;
// Write a function that calculates the Greatest Common Divisor of 2 numbers. 

public class nine {
    public static void gcd(int n, int d){
        int bt;
        while(n != 0){
            bt = d % n;
            d = n;
            n = bt;
        }
        System.out.println(d);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        gcd(n, d);
        sc.close();
    }
}
