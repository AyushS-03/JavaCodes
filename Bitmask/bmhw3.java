import java.util.Scanner;

public class bmhw3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int a = sc.nextInt();
        int count = 0;
        while(a != 0){
            count += a & 1;
            a >>= 1;
        }
        System.out.println("The representation of 1 in the No. is: "+count);
        sc.close();
    }
}