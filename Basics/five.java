package Basics;

import java.util.Scanner;

// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

public class five {
    public static void eligibility(int age){
        if(age > 18){
            System.out.println("The Person is eligible to vote");
        }else{
            System.out.println("The Person is not eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        eligibility(age);
        sc.close();
    }
}
