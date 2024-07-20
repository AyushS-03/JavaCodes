import java.util.Scanner;

public class permutation {

    public static void per(String str, String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }

        for(int i = 0; i < str.length(); i++){
            char currchar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i+1);
            per(newstr, permutation + currchar);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        per(str, "");
        sc.close();
    }
}