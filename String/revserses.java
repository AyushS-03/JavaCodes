import java.util.Scanner;

public class revserses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String reverseString = "";
        int length = a.length();

        for(int i = length-1; i >= 0; i--){
            reverseString += a.charAt(i);
        }
        System.out.println(reverseString);
        sc.close();
    }
}
