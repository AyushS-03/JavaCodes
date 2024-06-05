import java.util.Scanner;

public class bmhw2 {
    public static void main(String[] args) {
        // Write a program to toggle a bit a position = “pos” in a number “n”.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Position to Shift the number by: ");
        int pos = sc.nextInt();
        int bitmask = 1 << pos;
        System.out.println("Enter 0 or 1 to shift the position in the number");
        int binary = sc.nextInt();
        if(binary == 0){
            int xor =  a ^ bitmask;
            System.out.println(xor);
        }else if(binary == 1){
            int or = a | bitmask;
            System.out.println(or);
        }else{
            System.out.println("Wrong Input");
        }

        sc.close();
    }
}
