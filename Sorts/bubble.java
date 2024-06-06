package Sorts;

import java.util.Scanner;

class bubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ele = sc.nextInt();
        int[] array = new int[ele];

        for(int i = 0; i < ele; i++){
            array[i] = sc.nextInt(); 
        }

        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j+1]){
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}