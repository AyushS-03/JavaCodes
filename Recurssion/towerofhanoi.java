public class towerofhanoi {
    public static void rod(int n, char fromrod, char torod, char auxrod){
        if(n == 1){
            System.out.println("Move disk 1 from rod "+fromrod+" to rod "+torod);
            return;
        }
        rod(n-1, fromrod, auxrod, torod);
        System.out.println("Move disk "+n+" from rod "+fromrod+" to rod "+torod);
        rod(n-1, auxrod, torod, fromrod);
    }
    public static void main(String[] args){
        int n = 3;
        rod(n, 'A', 'C', 'B');
    }
}
