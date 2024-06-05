import java.util.Scanner;

public class sbstr3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder(a);
        String Username = "";

        for(int i = 0; i < sb.length()- 1; i++){
            if(sb.charAt(i) == '@'){
                break;
            }else{
                Username += sb.charAt(i);
            }
        }
        System.out.println(Username);
        sc.close();
    }
}