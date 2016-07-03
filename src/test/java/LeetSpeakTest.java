import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class LeetSpeakTest {

  @Test
  public void leetSpeak_forNoSpecialLettersEOLS_originalString() {
    LeetSpeak leetSpeakTest = new LeetSpeak();
    assertEquals("Happy", leetSpeakTest.leetSpeak("Happy"));
    }

  @Test
  public void leetSpeak_forLetterEInWord_ReplaceWith3(){
    LeetSpeak testLeetSpeak = new LeetSpeak();
    assertEquals("3cho", testLeetSpeak.leetSpeak("Echo"));
  }

  @Test
  public void leetSpeak_forLetterOInWord_ReplaceWith0() {
    LeetSpeak testLeetSpeak = new LeetSpeak();
    assertEquals("0rang3", testLeetSpeak.leetSpeak("Orange"));
  }

}
