import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the No. of people: ");
        int size = sc.nextInt();
        String[] names = new String[size];

        for(int i = 0; i < names.length; i++){
            System.out.print("Enter the name of people: ");
            names[i] = sc.next();
        }

        for(int i = 0; i < size; i++){
            System.out.println(names[i]);
        }

        sc.close();
    }
}
