package Sorts;

import java.util.Scanner;

public class selection {

    public static void primt(int[] a) {
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] a = new int[len];
        for(int i = 0; i < len; i++){
            a[i] = sc.nextInt();
        }

        
        for(int i = 0; i < len-1; i++){
            int smallest = i;
            for(int j = i+1; j < len; j++){
                if(a[smallest] > a[j]){
                    smallest = j;
                }
            }
            int temp = a[smallest];
            a[smallest] = a[i];
            a[i] = temp;
            }
        
        primt(a);
        sc.close();
    }    
}
