import java.util.*;

public class Palindrome {
  /**
   * I check if a word is a palindrome.
   *
   * @param word palindrome candidate
   *
   * @return whether word is a palindrome or not
   */
  public boolean isPalindrome(String word) {
    // start and end of word accessers
    int i = 0;
    int j = word.length() - 1;

    // word has odd length: cannot be a palindrome
    if (word.length() % 2 != 1) {
      return false;
    }

    // compare pair of edge chars from start to middle
    while (i != j) {
      // chars differ: not a palindrome
      if (word.charAt(i) != word.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }

    // all chars equal: word is a palindrome
    return true;
  }

  /**
   * I execute the main program logic.
   */
  public static void main(String[] args) throws Exception {
    // create scanner object
    Scanner s = new Scanner(System.in);

    // instantiate palindrome checker object
    Palindrome p = new Palindrome();

    // fetch word from stdin while stop sign string is not read
    while (s.hasNextLine()) {
      String word = s.nextLine();

      // end of input signal read: break scanner
      if (word.equals("FIM")) {
        break;
      }
      System.out.println(p.isPalindrome(word));
    }

    // close scanner buffer
    s.close();
  }
}
