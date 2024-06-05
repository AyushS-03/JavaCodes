package Basics;

import java.util.Scanner;

public class ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cpp = 0;
        int cp = 1; 
        for(int i = 0; i <= n; i++){
            System.out.println(cpp);
            int cn = cpp + cp;
            cpp = cp;
            cp = cn;
        }
        sc.close();
    }
}
