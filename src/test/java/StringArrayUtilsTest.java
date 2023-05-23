import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


public class xgit StringArrayUtilsTest {


  @Test
  public void testIndexOfPresent1() {
    String[] a1 = {"aa", "bb", "cc"};
    assertTrue(StringArrayUtils.indexOf(a1, "aa") == 0, "expect index of first to be zero");
  }

  @Test public void testIndexOfPresent2() {
    String[] a1 = {"aa", "bb", "cc"};
    assertTrue(StringArrayUtils.indexOf(a1, "bb") == 1, "expect index of second to be one");
  }
  @Test public void testIndexOfPresent3() {
    String[] a1 = {"aa", "bb", "cc"};
    assertTrue(StringArrayUtils.indexOf(a1, "cc") == 2, "expect index of last to be three");
  }

  @Test public void testIndexOfAbsent() {
    String[] a1 = {"aa", "bb", "cc"};
    assertTrue(StringArrayUtils.indexOf(a1, "xx") == -1, "expect index of missing item to be -1");
  }

  @Test public void testIsSorted1() {
    String[] a1 = {"aa", "bb", "cc"};
    assertTrue(StringArrayUtils.isSorted(a1), "expect sorted array to be detected as such");
  }
  @Test public void testIsSorted2() {
    String[] a2 = {"aa", "dd", "bb", "ee", "cc"};
    assertFalse(StringArrayUtils.isSorted(a2), "expect unsorted array to be properly detected");
  }

  @Test public void testSortStandard1() {
    String[] a1 = {"aa", "bb", "cc"};
    String[] a1s = {"aa", "bb", "cc"};
    StringArrayUtils.sortStandard(a1);
    assertTrue(Arrays.equals(a1, a1s), "expect presorted array to stay sorted");
  }
  @Test public void testSortStandard2() {
    String[] a2 = {"aa", "dd", "bb", "ee", "cc"};
    String[] a2s = {"aa", "bb", "cc", "dd", "ee"};
    StringArrayUtils.sortStandard(a2);
    assertTrue(Arrays.equals(a2, a2s), "expect shuffled array to become sorted");
  }

  @Test public void testSortLength1() {
    String[] a1 = {"a", "bb", "ccc"};
    String[] a1s = {"a", "bb", "ccc"};
    String[] a1ss = {"ccc", "bb", "a"};
    StringArrayUtils.sortLength(a1);
    assertTrue(Arrays.equals(a1, a1s) || Arrays.equals(a1, a1ss), "expect array to be sorted by length of words in array");
  }
  @Test public void testSortLength2() {
    String[] a2 = {"a", "dddd", "bb", "eeeee", "ccc"};
    String[] a2s = {"a", "bb", "ccc", "dddd", "eeeee"};
    String[] a2ss = {"eeeee", "dddd", "ccc", "bb", "a"};
    StringArrayUtils.sortLength(a2);
    assertTrue(Arrays.equals(a2, a2s) || Arrays.equals(a2, a2ss), "expect array to be sorted by length of words in array");
  }

  @Test public void testBinarySearchPreSorts() {
    String[] a2 = {"aa", "dd", "bb", "ee", "cc"};
    String[] a2s = {"aa", "bb", "cc", "dd", "ee"};
    StringArrayUtils.binarySearch(a2, "");
    assertTrue(Arrays.equals(a2, a2s), "expect binary search to make sure the array is sorted before starting the search");
  }

  @Test public void testBinarySearchSuccess1() {
    String[] a2 = {"aa", "dd", "bb", "ee", "cc"};
    assertTrue(StringArrayUtils.binarySearch(a2, "aa") == 0, "expect binary search to find each item in correct place.");
  }
  @Test public void testBinarySearchSuccess2() {
    String[] a2 = {"aa", "dd", "bb", "ee", "cc"};
    assertTrue(StringArrayUtils.binarySearch(a2, "bb") == 1, "expect binary search to find each item in correct place.");
  }
  @Test public void testBinarySearchSuccess3() {
    String[] a2 = {"aa", "dd", "bb", "ee", "cc"};
    assertTrue(StringArrayUtils.binarySearch(a2, "cc") == 2, "expect binary search to find each item in correct place.");
  }
  @Test public void testBinarySearchSuccess4() {
    String[] a2 = {"aa", "dd", "bb", "ee", "cc"};
    assertTrue(StringArrayUtils.binarySearch(a2, "dd") == 3, "expect binary search to find each item in correct place.");
  }
  @Test public void testBinarySearchSuccess5() {
    String[] a2 = {"aa", "dd", "bb", "ee", "cc"};
    assertTrue(StringArrayUtils.binarySearch(a2, "ee") == 4, "expect binary search to find each item in correct place.");
  }

  @Test public void testBinarySearchFail() {
    String[] a2 = {"aa", "dd", "bb", "ee", "cc"};
    assertTrue(StringArrayUtils.binarySearch(a2, "xx") < 0, "expect binary search to return negative for failed search");
  }

  @Test public void testSameWords1() {
    String[] a2 = {"aa", "dd", "bb", "ee", "cc"};
    String[] a3 = {"11", "22"};
    assertFalse(StringArrayUtils.sameWords(a2, a3), "expect two very differnt arrays not to have the same words");
  }
  @Test public void testSameWords2() {
    String[] a2 = {"aa", "dd", "bb", "ee", "cc"};
    String[] a2s = {"aa", "bb", "cc", "dd", "ee"};
    assertFalse(StringArrayUtils.sameWords(a2, a2s), "expect two arrays with same words in different orders to be rejected");
  }
  @Test public void testSameWords3() {
    String[] a2 = {"aa", "dd", "bb", "ee", "cc"};
    assertTrue(StringArrayUtils.sameWords(a2, a2), "expect equal arrays to be accepted as having same words");
  }

}
