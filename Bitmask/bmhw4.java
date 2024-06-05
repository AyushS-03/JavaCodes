import java.util.Scanner;

public class bmhw4{
    public static void decimalToBinary(int n){
        StringBuilder sb = new StringBuilder();

        if(n == 0){
            sb.append("0");
        }else{
            while(n > 0){
                sb.append(n % 2);
                n /= 2;
            }
            sb.reverse();
        }
        System.out.println(sb);
    }





    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decimalToBinary(n);
    }
}