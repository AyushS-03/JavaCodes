public class factorial{
    public static int primt(int n) {
        if(n == 0){
            return 1;
        }
        return n * primt(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        primt(n);
        System.out.println(primt(n));
    }
}