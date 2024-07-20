import java.util.Scanner;
// Enter 2d array and print them in spiral order
public class twohw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int n = sc.nextInt();
        System.out.print("Enter the col: ");
        int m = sc.nextInt();
        int[][] spiral = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                spiral[i][j] = sc.nextInt();
            }
        }

        int row_start = 0;
        int col_start = 0;
        int row_end = n - 1;
        int col_end = m - 1;

        while(row_start <= row_end && col_start <= col_end){
            // 1
            for(int col = col_start; col <= col_end; col++){
                System.out.print(spiral[row_start][col] + " ");
            }
            row_start++;

            // 2
            for(int row = row_start; row <= row_end; row++){
                System.out.print(spiral[row][col_end] + " ");
            }
            col_end--;

            // 3
            for(int col = col_end; col >= col_start; col--){
                System.out.print(spiral[row_end][col] + " ");
            }
            row_end--;

            // 4
            for(int row = row_end; row >= row_start; row--){
                System.out.print(spiral[row][col_start] + " ");
            }
            col_start++;

            System.out.println();
        }
        sc.close();   
    }
}