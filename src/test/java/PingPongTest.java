import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class PingPongTest {

  @Test
  public void pingPong_forNumberLessThanThree_arrayOfNumbersOneThroughNumber() {
    PingPong testPingPong = new PingPong();
    ArrayList<Object> expected = new ArrayList<Object>();
    expected.add(1);
    expected.add(2);
    assertEquals(expected, testPingPong.pingPong(2));
  }

  @Test
  public void pingPong_forNumberDivisibleByThree_arrayOfNumbersOneThroughTwoAndPing() {
    PingPong testPingPong = new PingPong();
    ArrayList<Object> expected = new ArrayList<Object>();
    expected.add(1);
    expected.add(2);
    expected.add("ping");
    assertEquals(expected, testPingPong.pingPong(3));
  }

  @Test
  public void pingPong_forNumberDivisibleByFive_OneTwoPingFourPong() {
    PingPong testPingPong = new PingPong();
    ArrayList<Object> expected = new ArrayList<Object>();
    expected.add(1);
    expected.add(2);
    expected.add("ping");
    expected.add(4);
    expected.add("pong");
    assertEquals(expected, testPingPong.pingPong(5));
  }

  @Test
  public void pingPong_forNumberDivisibleByFifteen_OneTwoPingFourPongEtc() {
    PingPong testPingPong = new PingPong();
    ArrayList<Object> expected = new ArrayList<Object>();
    expected.add(1);
    expected.add(2);
    expected.add("ping");
    expected.add(4);
    expected.add("pong");
    expected.add("ping");
    expected.add(7);
    expected.add(8);
    expected.add("ping");
    expected.add("pong");
    expected.add(11);
    expected.add("ping");
    expected.add(13);
    expected.add(14);
    expected.add("pingpong");
    assertEquals(expected, testPingPong.pingPong(15));
  }
}
