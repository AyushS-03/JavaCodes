// Print x^n

import java.util.Scanner;

public class PowerStack {

    public static int powerC(int n, int p) {
        if(p == 0){
            return 1;
        }else if(n == 0){
            return 0;
        }
        int powercalc = powerC(n, p-1);
        int result = n * powercalc;
        return result; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        System.out.println("Enter the Power: ");
        int p = sc.nextInt();
        int answer = powerC(n, p);
        System.out.println(answer);
    }
}
