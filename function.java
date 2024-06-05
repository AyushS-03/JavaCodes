import java.util.Scanner;

public class function {
    public static int sum(int n) {
        int factorial = 1;
        for(int i = n; i >= 1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sum(n);
        sc.close();
    }
}
