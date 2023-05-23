
public class StringArrayUtils {

  /**
   * Use the main method to test your other methods. Some sample arrays are given. The methods below
   * assume the array is full.
   */
  public static void main(String[] args) {
    String[] a1 = {"aa", "bb", "cc"};
    String[] a2 = {"aa", "dd", "bb", "ee", "cc"};
    String[] a3 = {"cc", "bb", "aa"};
    // add some test code here.
    printWords(a1);

  }

  /**
   * @param words - a full array of Strings to be printed displays the array to standard output
   * 
   *        This method is completed for you. Don't change it.
   */
  public static void printWords(String[] words) {
    System.out.print("[");
    for (int i = 0; i < words.length - 1; i++)
      System.out.print(words[i] + ", ");
    System.out.println(words[words.length - 1] + "]");
  }

  /**
   * @param words - a full array of Strings
   * @param key - a string search target
   * @return - the index of the string in the array or -1 if not found
   * 
   *         Hint - use the equals method of the String class to test String equality. E.g.
   *         if(words[i].equals(key)){ ... }
   */
//TODO: Write your method here.
  /**
   * @param words - a full array of Strings
   * @return - true if sorted in lexicographical order
   * 
   *         Hint - use the compareTo method of the String class to test order. E.g.
   *         if(words[i].compareTo(words[i+1]){ ... }
   */
//TODO: Write your method here.
  /**
   * @param words - a full array to be sorted
   * 
   *        Hint - use the compareTo method of the String class to test order. You can use any
   *        sorting algorithm you like, but you must code it here. You may not call a library sort
   *        function.
   */
//TODO: Write your method here.
  /**
   * @param words - a full array to be sorted
   * 
   *        Hint - Sort the strings in increasing order of length. You can use any sorting algorithm
   *        you like, but you must code it here. You may not call a library sort function.
   */
//TODO: Write your method here.

  /**
   * @param words - a full array of Strings
   * @param key - a string search target
   * @return - the index of the string in the array or -1 if not found
   * 
   *         The method must ensure the list is sorted before searching.
   */

//TODO: Write your method here.

  /**
   * @param list1 - a full array of Strings
   * @param list2 - another full array of Strings
   * @return - true if both arrays contain the same words.
   * 
   *         Hint - use the equals method of the String class to test String equality. Be careful of
   *         arrays of different lengths.
   */
  //TODO: Write your method here.
}
