import java.util.Scanner;

public class sbstr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder(a);

        for(int i = 0; i < sb.length()-1; i++){
            if(sb.charAt(i) == 'e'){
                sb.setCharAt(i, 'i');
            }
        }
        System.out.println(sb);
        sc.close();
    }
}
