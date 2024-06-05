package Basics;
// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
import java.util.Scanner;

public class seven {

    public static void counter() {
        int countp = 0; int countn = 0; int countz = 0; char ch;
        Scanner sc = new Scanner(System.in);
        do{
            int n = sc.nextInt();
            if(n > 0){
                countp++;
            }
            else if(n < 0){
                countn++;
            }
            else{
                countz++;
            }
            ch = sc.next().charAt(0);

        }while(ch != 'N' && ch != 'n');
        
        System.out.println("No. Of Positive Integer: "+countp);
        System.out.println("No. Of Negative Integer: "+countn);
        System.out.println("No. Of Zero: "+countz);

        sc.close();
    }

    public static void main(String[] args) {
        counter();
    }
}