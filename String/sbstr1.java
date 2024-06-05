import java.util.Scanner;

public class sbstr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] arva = new String[size];
        int totlength = 0;

        for(int i = 0; i < size; i++){
            arva[i] = sc.next();
            StringBuilder sb = new StringBuilder(arva[i]);
            totlength += sb.length();
        }

        System.out.println(totlength);
        sc.close();
    }
}
