import java.util.Scanner;

public class primenumber {
    public static void prime(int n){
    
        for(int i = 1; i <= n; i++){
            int counter = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    counter++;
                }
            }
            if(counter == 2){
                System.out.println(i);
                }
        }
    }

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        prime(n);
        sc.close();
    }
    
}
