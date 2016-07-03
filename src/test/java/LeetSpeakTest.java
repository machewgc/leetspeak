import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class LeetSpeakTest {

  @Test
  public void leetSpeak_forNoSpecialLettersEOLS_originalString() {
    LeetSpeak leetSpeakTest = new LeetSpeak();
    assertEquals("Happy", leetSpeakTest.leetSpeak("Happy"));
    }
  }
