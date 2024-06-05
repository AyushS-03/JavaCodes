public class Bm1 {
   public static void main(String args[]) {
      int n = 7; //0111
      int pos = 2;
      int bitMask = 0<<pos; // 0100

      // int New = ~(bitMask); // 1011


      // int newNumber = New & n;
      System.out.println(bitMask);
   }
}
