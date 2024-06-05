import java.util.Scanner;

public class bmhw1 {
    public static void main(String[] args) {
        // Write a program to find if a number is a power of 2 or not.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        // Check if n is greater than 0 and n & (n - 1) is 0
        if (n > 0 && (n & (n - 1)) == 0) {
            System.out.println(n + " is a power of 2.");
        } else {
            System.out.println(n + " is not a power of 2.");
        }
        sc.close();
    }
}
