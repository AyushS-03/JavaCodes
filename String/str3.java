import java.util.Scanner;

public class str3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String Username = "";

        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == '@'){
                break;
            }else{
                Username += a.charAt(i);
            }
        }
        System.out.println(Username);
        sc.close();
    }
}
