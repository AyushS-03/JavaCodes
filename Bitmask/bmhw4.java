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

    public static void binaryToDecimal(String b) {
        int decimal = 0;
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == '1') {
                decimal += Math.pow(2, b.length() - i - 1);
            }
        }
        System.out.println(decimal);
    }

    public static void main(String[] args){
        System.out.println("Press 1 to convert decimal to binary");
        System.out.println("Press 2 to convert binary to decimal");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice == 1){
            System.out.println("Enter a decimal number");
            int n = sc.nextInt();
            decimalToBinary(n);
        }else if(choice == 2){
            System.out.println("Enter a binary number");
            String b = sc.next();
            binaryToDecimal(b);
        }else{
            System.out.println("Invalid Choice!");
        }
        sc.close();
    }
}