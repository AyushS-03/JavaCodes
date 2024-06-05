import java.util.Scanner;

public class reversesSb {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder(a);

        for(int i = 0; i < sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 - i;
            
            char FrontChar = sb.charAt(front);
            char BackChar = sb.charAt(back);

            sb.setCharAt(front, BackChar);
            sb.setCharAt(back, FrontChar);
        }

        System.out.println(sb);
        sc.close();
    }
}
