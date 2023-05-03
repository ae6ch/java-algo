
// Fibonacci sequence using memoization
import java.util.HashMap;

public class Fibonacci {
   HashMap<Long, Long> memo;

   public static void main(String[] args) {
      if (args.length != 1) {
         System.out.println("usage: Fibonacci N");
         return;
      }
      Fibonacci fibonacci = new Fibonacci();
      for (long i = 1L; i <= Long.parseLong(args[0]); i++) {
         System.out.printf("%s ", Long.toUnsignedString(fibonacci.find(i)));
      }
      System.out.println();

   }

   public Fibonacci() {
      memo = new HashMap<>();
      memo.put(1L, 1L);
      memo.put(2L, 1L);
   }

   public long find(long n) {
      memo.computeIfAbsent(n, k -> memo.get(n - 2) + memo.get(n - 1));
      return (memo.get(n));
   }
}