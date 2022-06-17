public class Sequence {

  public static long getScore(long n) {
    double x = ((n+1) / 2.0);
  
      return (long) (x * (50 * n));
    }
}