import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test class for the CharFreq class.
 */
public class SpellCheckTest {

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {

  }

  @Test
  public void testFindMisspelledWords() {
    SpellCheck sc = 
      new SpellCheck("https://raw.githubusercontent.com/" +
      "mmeysenburg/IST146_Module07_PA/main/testDictionary.txt");

    // make sure dictionary was loaded properly
    String[] dWords = {"AAAA", "BBBB", "CCCC", "DDDD", "EEEE", "FFFF"};
    assertEquals(6, sc.dictionary.size());
    for(String word : dWords) {
      assertEquals(true, sc.dictionary.contains(word));
    }

    // validate spell checking
    Collection<String> misspelled = 
      sc.findMisspelledWords("https://raw.githubusercontent.com/" +
        "mmeysenburg/IST146_Module07_PA/main/testFile.txt");
    String[] bWords = {"BOB", "CHARLIE", "DAN", "ERIC", "FRED"};
    assertEquals(bWords.length, misspelled.size());
    Iterator<String> itr = misspelled.iterator();
    for(String word : bWords) {
      String fWord = itr.next();
      assertEquals(word, fWord);
    }
  }

  /**
   * Test launcher.
   *
   * @param args Command-line arguments; ignored by 
   * this application
   */
  public static void main(String[] args) {
    org.junit.runner.JUnitCore.main("SpellCheckTest");
  }
}