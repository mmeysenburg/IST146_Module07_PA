# IST146_Module07_PA

For the final PA, you will use the basic Java data structures to design and implement a simple spell check program. Your program will read in two files from the Web:

* `dictionary.txt`, a partial listing of correctly spelled English words
* `wap.txt`, a plain text version of the novel "War and Peace", with punctuation, etc. removed

Your program should load the dictionary file into some data structure. Then, it should read the War and Peace file, one word at a time, and see if each word is in the dictionary data structure or not. If a word is in the dictionary, it is considered to be spelled correctly. Conversely, any word not in the dictionary data structure is assumed to be misspelled.

For output, your program should print the misspelled words, one per line. The mis-spelled words should be printed in alphabetical order, and each misspelled word should only be printed once.

## Instructions

1. Log on to your replit account. 
2. Click the "+ New repl" button to create a new repl. 
3. Click on the "Import from GitHub" tab. 
4. Type or paste the following URL into the "Paste any repository URL" text field: `github.com/mmeysenburg/IST146_Module07_PA`
5. Click on the "Import from github" button.
6. Click the "Done" button in the ".replit" dialog that appears.
7. From the "Console" tab, enter the following command: `rm .replit` *If you omit this step, the "Run" button will not work as it should!*
8. Select the `SpellCheck.java` file. Search for the keyword "TODO", and write the specified code.
9. At any time you can run the code from the user's perspective, or, from a developer's point of view, execute the unit tests that have been provided.
  * To run the code, click the "Run" button.
  * To execute the unit tests (if any), enter the following command in the "Console" tab: `bash test.sh`
10. Once you have completed the code correctly, the unit tests (if any) should pass, and running the code should produce results that make sense.
11. When you are finished, submit your `SpellCheck.java` file via the Canvas assignment.

## Files in the repository

* `Main.java`: Main program to run the code from a user's perspective. This file's `main()` method is invoked when you click the "Run" button.
* `SpellCheck.java`: Class encapsulating a spell checker using online text files as the dictionary and file to check. Edit only this file. 
* `SpellCheckTest.java`: JUnit tests for the SpellCheck class.
* `README.md`: This README file.
* `test.sh`: Bash script to execute the JUnit4 unit tests in `SpellCheckTest.java`
* `dictionary.txt`: Plain text file with correctly-spelled words, one word per line.
* `testDictionary.txt`: Synthetic test dictionary file.
* `testFile.txt`: Synthetic test file to check.
* `wap.txt`: Plain text version of War and Peace, with all punctuation and symbols removed.
* `LICENSE`: GNU General Public License v3.0 for these materials.