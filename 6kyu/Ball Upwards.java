public class Ball {
  public static int maxBall(int v0) {
    double time = ((double)(v0 * 1000)/ 3600 / 9.81) *10;
      System.out.println(Math.round(time) + " " + time);
       return (int) Math.round(time);
  }
}