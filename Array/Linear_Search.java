import java.util.Scanner;

public class Linear_Search {

    public static void main(String[] args) {
        int marks;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the No. of Subjects: ");
        marks = sc.nextInt();
        int[] subjects = new int[marks];

        for(int i = 0; i < marks; i++){
            System.out.print("Enter the Marks of Subject: ");
            subjects[i] = sc.nextInt();
        }

        System.out.print("Enter the marks you want to find: ");
        int marksf = sc.nextInt();
        for(int i = 0; i < subjects.length; i++){
            if(subjects[i] == marksf){
                System.out.println("The marks is found at "+i);
            }
        }
        sc.close();
    }
}