// Feel like this is important .


public class pattern1 {
    public static void main(String[] args) {
        // int n = 5;
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= i ; j++){
        //         System.out.print("*");
        //     }
        // int space = 2 * (n-i);
        // for(int j = 1; j <= space; j++){
        //     System.out.print(" ");
        //     }
        
        // for(int j = 1; j <= i; j++){
        //     System.out.print("*");
        //     }
        // System.out.println();    
        // }

        // for(int i = n; i >= 1; i--){
        //     for(int j = 1; j <= i ; j++){
        //         System.out.print("*");
        //     }
        // int space = 2 * (n-i);
        // for(int j = 1; j <= space; j++){
        //     System.out.print(" ");
        //     }
        
        // for(int j = 1; j <= i; j++){
        //     System.out.print("*");
        //     }
        // System.out.println();    
        // }
        int n = 4;

        // 1st part
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print("*");
            }
            for(int j = 2; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd part
        
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print("*");
            }
            for(int j = 2; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}