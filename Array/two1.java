import java.util.Scanner;

public class two1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row in Array: ");
        int row = sc.nextInt();
        System.out.print("Enter the column in Array: ");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];
        System.out.print("Enter the Element in Array: ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the No. you want to find: ");
        int marksf = sc.nextInt();

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(matrix[i][j] == marksf){
                System.out.print("Element found at "+i+" "+j);
                }
            }
        }
        sc.close();
    }
}
