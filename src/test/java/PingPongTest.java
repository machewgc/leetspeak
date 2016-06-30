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
}
