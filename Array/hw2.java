import java.util.Scanner;

// Find the maximum & minimum number in an array of integers.

public class hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the Total no: ");
        int size = sc.nextInt();
        int[] num = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("Enter the number: ");
            num[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < num.length; i++){
            if(num[i] > max){
                max = num[i];
            }

            if(num[i] < min){
                min = num[i];
            }
        }

        System.out.println("Max Number: "+max);
        System.out.println("Min Number: "+min);
        sc.close();

    }    
}
