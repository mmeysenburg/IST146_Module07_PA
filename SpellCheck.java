import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

/**
 * Class encapsulating a spell-checker. Both the dictionary and the 
 * file to be checked are plain text files loaded from the Internet.
 */
public class SpellCheck {
  /** 
   * Data structure holding the dictionary. This has package access 
   * to facilitate testing. 
   */
  Collection<String> dictionary;

  /**
   * Construct a new spell checker with the indicated dictionary.
   *
   * @param urlStr String containing the URL of the plain text dictionary
   * to load. The dictionary should contain a series of correctly-
   * spelled words, one word per line. 
   */
  public SpellCheck(String urlStr) {
    dictionary = loadDictionary(urlStr);
  }

  /**
   * Construct a Scanner attached to a plain-text file on the Internet.
   *
   * @param urlStr String containing the URL of the file to open.
   * @return A Scanner object attached to the indicated file, ready to 
   * read from.
   */
  private Scanner scannerFromURL(String urlStr) {
    Scanner fileIn = null;

    // TODO: write a try / catch block to associate the specified online
    // file with the fileIn Scanner.  


    return fileIn;
  }

  /**
   * Load the dictionary data structure with the dictionary specified.
   *
   * @param urlStr String containing the URL of the plain text dictionary
   * to load. The dictionary should contain a series of correctly-
   * spelled words, one word per line. 
   *
   * @return The data structure containing the correctly spelled words
   * in the dictionary.
   */
   private Collection<String> loadDictionary(String urlStr) {
    // TODO: decide on the best data structure to hold the dictionary.
    // Note that this method returns a Collection<String> object. 
    // Collection is an interface that is a superclass of Java Lists and
    // Sets, so you should choose the List or Set "flavor" you think will
    // result in the fastest performance of your code.

    // TODO: declare and initialize your data structure

    Scanner fileIn = scannerFromURL(urlStr);

    // TODO: read the words from fileIn and add them to your 
    // data structure


    // TODO: replace this return statement to return your dictionary
    // data structure instead of null
    return null;
  }

  /**
   * Find all of the misspelled words in an online text file.
   *
   * @param urlStr String containing the URL of the plain text file to
   * spell-check. This file is assumed to be in all uppercase, with no 
   * punctuation or other symbols, i.e., it contains only words. There
   * may be multiple words per line.
   *
   * @return A data structure holding all of the misspelled words in 
   * the file. Each misspelled word should only be included once in the
   * structure, and the misspelled words should be alphabetized.
   */
  public Collection<String> findMisspelledWords(String urlStr) {
    // TODO: decide on the best data structure to hold the misspelled words.
    // Note that this method returns a Collection<String> object. 
    // Collection is an interface that is a superclass of Java Lists and
    // Sets, so you should choose the List or Set "flavor" you think will
    // result in the fastest performance of your code. Remember this data
    // structure should only have one copy of each misspelled word, and they
    // should be alphabetized.


    Scanner fileIn = scannerFromURL(urlStr);

    // TODO: read the words from fileIn, check each to see if it is in the
    // dictionary. If a word is not in the dictionary, add it to your 
    // misspelled word data structure. 



    // TODO: replace this return statement to return your misspelled word
    // data structure instead of null
    return null;
  }
}