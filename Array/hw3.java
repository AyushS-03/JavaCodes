
// Take an array of numbers as input and check if it is an array sorted in ascending order.

import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the No. in Array: ");
        int size = sc.nextInt();
        int[] num = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("Enter the No. : ");
            num[i] = sc.nextInt();
        }
        
        boolean isAscending = true;

        for(int i = 0; i < num.length-1; i++){
            if(num[i] > num[i+1]){
                isAscending = false;
            }
        }

        if(isAscending){
            System.out.println("The Arrays are Sorted in Ascending Order");
        }
        else{
            System.out.println("The Arrays are not Sorted in Ascending Order");
        }

        sc.close();

    }
}
