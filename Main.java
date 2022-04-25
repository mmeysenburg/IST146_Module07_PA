import java.util.*;

/** 
 * Main class for IST 146 Module 7 PA: Spell-checker.
 */
class Main {
  /**
   * Application entry point.
   *
   * @param args Command-line arguments; ignored by this app.
   */
  public static void main(String[] args) {
    // create the SpellCheck object with the dictionary.txt file.
    SpellCheck sc = 
      new SpellCheck("https://raw.githubusercontent.com/mmeysenburg/" + 
        "IST146_Module07_PA/main/dictionary.txt");

    // Spell-check War and Peace, getting the misspelled words in a 
    // Collection
    Collection<String> misspelled = 
      sc.findMisspelledWords("https://raw.githubusercontent.com/" + 
        "mmeysenburg/IST146_Module07_PA/main/wap.txt");

    // Display the misspelled words 
    for(String word : misspelled) {
      System.out.println(word);
    }
  }
}