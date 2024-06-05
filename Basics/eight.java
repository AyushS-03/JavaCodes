package Basics;


// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n.
import java.util.Scanner;

public class eight {
    public static void power(int x, int n) {
        long pow = (long) Math.pow(x, n);
        System.out.println(pow);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        power(x, n);
        sc.close();
    }
}
