public class pattern {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
        
        // for(int i = 1; i <= 5; i++){
        //     // System.out.println("*");
        //     for(int j = 1; j <= i; j++){
        //         if((i + j) % 2 == 0){
        //             System.out.print(" 1 ");
        //         }
        //         else{
        //             System.out.print(" 0 ");
        //         }
        //     }
        //     System.out.println();
        // }
    }
}
