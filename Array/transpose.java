import java.util.Scanner;

public class transpose {
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
        // Traversed j first to print column , then i to prin rows in opposite way.
        for(int j = 0; j < m; j++){
            for(int i = 0; i < n; i++){
                System.out.print(spiral[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
