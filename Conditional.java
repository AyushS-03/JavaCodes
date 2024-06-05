import java.util.*;

public class Conditional {
    public static void main(String[] arg){
        int a, b, c, d, e, f, g, h;
        Scanner sc = new Scanner(System.in);
        System.out.println("Java Calculator:\n1. Addition\n2. Multiplication\n3. Division\n4. Substraction\n5. Modulus");
        c  = sc.nextInt();
        a = sc.nextInt();
        b  = sc.nextInt();
        switch(c){
            case 1: d = a + b;
            System.out.println("Addition of A and B: "+d);
            break;
            case 2: e = a * b;
            System.out.println("Multiplication of A and B: "+e);
            break;
            case 3: f = a / b;
            System.out.println("Division of A and B: "+f);
            break;
            case 4: g = a - b;
            System.out.println("Substraction of A and B: "+g);
            break;
            case 5: h = a % b;
            System.out.println("Modulus of A and B: "+h);
            break;
            default: System.out.println("Invalid Number");
        }
        sc.close();
    }
}
