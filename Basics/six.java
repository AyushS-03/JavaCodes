package Basics;

import java.util.Scanner;

// Write an infinite loop using do while condition.

public class six {
    public static void infinite(int n) {
        do{
            n++;
            System.out.println(n);
        }while(n > 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        infinite(n);
        sc.close();
    }

}
