import java.util.Scanner;

public class str1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] string = new String[size];
        int totlength = 0;

        for(int i = 0; i < size; i++){
            string[i] = sc.next();
            totlength += string[i].length();
        }

        System.out.println(totlength);
        sc.close();
    }
}