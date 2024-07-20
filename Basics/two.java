package Basics;

// Write a function to print the sum of all odd numbers from 1 to n.
import java.util.Scanner;

public class two {
    public static void odd(int n) {
        int d = 0;
        for(int i = 0; i <= n; i++){
            if(i % 2 != 0){
                d = d + i;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nSum of all odd no. are: "+d);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        odd(n);
        sc.close();
    }
}
