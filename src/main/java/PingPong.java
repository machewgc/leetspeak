import java.util.ArrayList;

public class PingPong {
  public static void main(String[] args) {

  }
  public static ArrayList<Object> pingPong(Integer number) {
    ArrayList<Object> pingPongResults = new ArrayList<Object>();
    for (Integer i = 1; i <= number; i++) {
      if (i % 3 == 0) {
        pingPongResults.add("ping");
      } else {
        pingPongResults.add(i);
      }
    }
    return pingPongResults;
  }
}
