import java.util.Scanner;

public class loops {
    public static void table(int n) {
        int counter = 10;
        for(int i = 0; i <= counter; i++){
            int mul = n * i;
            System.out.println(+n+ " * "+i+ " is: "+mul);
        }
    }    
        // for(int i = 0; i <= n; i++)
        //     if(i % 2 == 0){
        //         System.out.println(i);
        //     }
        // for(; ;) {
        //     System.out.println("Apna College");
        // }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        table(n);
        sc.close();
        }
}
