import org.junit.Test;
import static org.junit.Assert.*;

public class TestPalindrome {
    // You must use this palindrome, and not instantiate
    // new Palindromes, or the autograder might be upset.
    static Palindrome palindrome = new Palindrome();

    @Test
    public void testWordToDeque() {
        Deque d = palindrome.wordToDeque("persiflage");
        String actual = "";
        for (int i = 0; i < "persiflage".length(); i++) {
            actual += d.removeFirst();
        }
        assertEquals("persiflage", actual);
    }


    @Test
    public void testWordToDeque2() {
        Deque d = palindrome.wordToDeque("abcdefgh");
        String actual = "";
        for (int i = 0; i < "abcdefgh".length(); i++) {
            actual += d.removeFirst();
        }
        assertEquals("abcdefgh", actual);
    }

    @Test
    public void testIsPalindrome1() {
        assertFalse(palindrome.isPalindrome("cat"));



    }

    @Test
    public void testIsPalindrome2() {
        assertFalse(palindrome.isPalindrome("caC"));



    }

    @Test
    public void testIsPalindrome3() {

        assertTrue(palindrome.isPalindrome("cac"));



    }

    @Test
    public void testIsPalindrome4() {

        assertTrue(palindrome.isPalindrome("abcdefggfedcba"));



    }

    @Test
    public void testIsPalindrome5() {

        assertFalse(palindrome.isPalindrome("abcdefggfeddbffd"));
        assertFalse(palindrome.isPalindrome("acta"));


    }
}
