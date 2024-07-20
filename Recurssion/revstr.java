import java.util.Scanner;

public class revstr {

    public static void str(String string, int idx){
        if(idx == 0){
            System.out.println(string.charAt(idx));
            return;
        }
        System.out.print(string.charAt(idx));
        str(string, idx-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        str(string, string.length()-1);
        sc.close();

    }
}
