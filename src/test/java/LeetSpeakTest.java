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
    assertEquals("h3ck", testLeetSpeak.leetSpeak("heck"));
  }

  @Test
  public void leetSpeak_forLetterOInWord_ReplaceWith0() {
    LeetSpeak testLeetSpeak = new LeetSpeak();
    assertEquals("0rang3 0rang3", testLeetSpeak.leetSpeak("Orange Orange"));
  }

  @Test
  public void leetSpeak_forCapitalLInPhrase_RelpaceWith1() {
    LeetSpeak testLeetSpeak = new LeetSpeak();
    assertEquals("W3'r3 numb3r 313v3n" ,testLeetSpeak.leetSpeak("We're number eleven"));
  }
}
